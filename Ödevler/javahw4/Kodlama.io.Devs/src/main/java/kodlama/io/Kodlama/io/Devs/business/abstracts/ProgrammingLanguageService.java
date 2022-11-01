package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

//iş kurallarını yazıcağımız yapıyı tasarlıyoruz
public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programminglanguage) throws Exception;
	void update(ProgrammingLanguage programminglanguage) throws Exception;
	void delete(int id);
	ProgrammingLanguage getById(int id);
}
