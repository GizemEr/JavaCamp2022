package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository //bu sınıf bir DataAccess nesnesidir
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programminglanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programminglanguages = new ArrayList<ProgrammingLanguage>(); //bununla beraber elimizde boş bir liste var
		programminglanguages.add(new ProgrammingLanguage(1, "C#"));
		programminglanguages.add(new ProgrammingLanguage(2, "Java"));
		programminglanguages.add(new ProgrammingLanguage(3, "Python"));
		programminglanguages.add(new ProgrammingLanguage(4, "JavaScript"));
		programminglanguages.add(new ProgrammingLanguage(5, "Kotlin"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {//içinde programminglanguage olan bir liste döndürücem demek
		
		return programminglanguages;
	}
	@Override
	public void add(ProgrammingLanguage programminglanguage) {
		programminglanguages.add(programminglanguage);
	}
	@Override
	public void delete(int id) {
		ProgrammingLanguage programminglanguage = getById(id);
		programminglanguages.remove(programminglanguage);
	}

	@Override
	public void update(ProgrammingLanguage programminglanguage) {
		for(ProgrammingLanguage programminglanguage_ : programminglanguages) {
			if(programminglanguage_.getId()==programminglanguage.getId()) {
				programminglanguage_.setName(programminglanguage.getName());
			}
		}
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage programminglanguage_ : programminglanguages) {
			if(programminglanguage_.getId()==id) {
				return programminglanguage_;
			}
		}
		return null;
	}

}
