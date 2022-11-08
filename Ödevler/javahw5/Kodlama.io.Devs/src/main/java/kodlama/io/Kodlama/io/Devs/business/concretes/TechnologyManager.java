package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{
	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageService programmingLanguageService;
	
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, ProgrammingLanguageService programmingLanguageService) {
		this.technologyRepository = technologyRepository;
		this.programmingLanguageService=programmingLanguageService;
	}
	
	@Override
	public List<GetAllTechnologiesResponse> getAll(){
		
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> technologiesResponse = new ArrayList<GetAllTechnologiesResponse>();
		
		for(Technology technology : technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			responseItem.setLanguageResponse(programmingLanguageService.getById(technology.getProgrammingLanguage().getId()));
			technologiesResponse.add(responseItem);
		}
		return technologiesResponse;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception{ 
		
		if(createTechnologyRequest.getName().isEmpty()) {
			throw new Exception("Programlama dili teknolojisi boş geçilemez.");
		}
		
		for(Technology technology_ : technologyRepository.findAll()) {
			if(technology_.getName().toLowerCase().equals(createTechnologyRequest.getName().toLowerCase())) {
				throw new Exception("Programlama dili teknolojisi mevcuttur, tekrar edemez.");
			}
		}
		Technology technology = new Technology();
		technology.setName(createTechnologyRequest.getName());
		GetByIdProgrammingLanguagesResponse getByIdProgrammingLanguagesResponse = programmingLanguageService.getById(createTechnologyRequest.getLanguageId());
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(getByIdProgrammingLanguagesResponse.getName());
		programmingLanguage.setId(getByIdProgrammingLanguagesResponse.getId());
		technology.setProgrammingLanguage(programmingLanguage);
		
		this.technologyRepository.save(technology);
		
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		this.technologyRepository.deleteById(deleteTechnologyRequest.getId());;
		
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest){
		Technology technology = technologyRepository.findById(updateTechnologyRequest.getId()).get();
		technology.setName(updateTechnologyRequest.getName());
		technology.setId(updateTechnologyRequest.getId());
		GetByIdProgrammingLanguagesResponse getByIdProgrammingLanguagesResponse = programmingLanguageService.getById(updateTechnologyRequest.getLanguageId());
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(getByIdProgrammingLanguagesResponse.getName());
		programmingLanguage.setId(getByIdProgrammingLanguagesResponse.getId());
		technology.setProgrammingLanguage(programmingLanguage);
		this.technologyRepository.save(technology);
		
	}

	@Override
	public GetByIdTechnologiesResponse getById(int id) {
		Technology technology = this.technologyRepository.findById(id).get();
		GetByIdTechnologiesResponse getByIdTechnologiesResponse = new GetByIdTechnologiesResponse();
		
		getByIdTechnologiesResponse.setTechnology(technology.getProgrammingLanguage().getName());
		getByIdTechnologiesResponse.setName(technology.getName());
		getByIdTechnologiesResponse.setId(id);
		return null;
	}
	
}
