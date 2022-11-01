package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service //Bu sınıf bir business nesnesidir
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programminglanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programminglanguageRepository) {
		this.programminglanguageRepository = programminglanguageRepository;
	}
	@Override
	public void add(ProgrammingLanguage programminglanguage) throws Exception{
		if(programminglanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		
		for(ProgrammingLanguage programminglanguage_ : programminglanguageRepository.getAll()) {
			if(programminglanguage_.getName().toLowerCase().equals(programminglanguage.getName().toLowerCase())) {
				throw new Exception("Programlama dili mevcuttur, tekrar edemez.");
			}
		}
		programminglanguageRepository.add(programminglanguage);
	}
	@Override
	public void delete(int id) {
		programminglanguageRepository.delete(id);
	}
	@Override
	public void update(ProgrammingLanguage programminglanguage)throws Exception {
		if(programminglanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		for(ProgrammingLanguage programminglanguage_ : programminglanguageRepository.getAll()) {
			if(programminglanguage_.getName().toLowerCase().equals(programminglanguage.getName().toLowerCase())) {
				throw new Exception("Programlama dili mevcuttur, tekrar edemez.");
			}
		}
		programminglanguageRepository.update(programminglanguage);
	}
	@Override
	public ProgrammingLanguage getById(int id) {
		return programminglanguageRepository.getById(id);
	}
	@Override
	public List<ProgrammingLanguage> getAll() {
		//iş kuralları
		return programminglanguageRepository.getAll();
	}

}
