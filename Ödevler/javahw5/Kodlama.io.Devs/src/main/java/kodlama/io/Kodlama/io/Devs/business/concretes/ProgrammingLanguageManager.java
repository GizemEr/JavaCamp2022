package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service //Bu sınıf bir business nesnesidir
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programminglanguageRepository) {
		this.programmingLanguageRepository = programminglanguageRepository;
	}
	
	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		this.programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getId());
	}
	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)throws Exception {
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(updateProgrammingLanguageRequest.getId()).get();
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		for(ProgrammingLanguage programminglanguage_ : programmingLanguageRepository.findAll()) {
			if(programminglanguage_.getName().toLowerCase().equals(programmingLanguage.getName().toLowerCase())) {
				throw new Exception("Programlama dili mevcuttur, tekrar edemez.");
			}
		}
	}
	
	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguageResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			programmingLanguageResponse.add(responseItem);
		}
		//iş kuralları
		return programmingLanguageResponse;
	}
	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());
		
		
		
		if(createProgrammingLanguageRequest.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		
		for(ProgrammingLanguage programminglanguage_ : programmingLanguageRepository.findAll()) {
			if(programminglanguage_.getName().toLowerCase().equals(createProgrammingLanguageRequest.getName().toLowerCase())) {
				throw new Exception("Programlama dili mevcuttur, tekrar edemez.");
			}
		}
		this.programmingLanguageRepository.save(programmingLanguage);
		
	}

	@Override
	public GetByIdProgrammingLanguagesResponse getById(int id) {
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(id).get();
		GetByIdProgrammingLanguagesResponse getByIdProgrammingLanguageResponse = new GetByIdProgrammingLanguagesResponse();
		getByIdProgrammingLanguageResponse.setName(programmingLanguage.getName());
		getByIdProgrammingLanguageResponse.setId(programmingLanguage.getId());
		return getByIdProgrammingLanguageResponse;
	}

}
