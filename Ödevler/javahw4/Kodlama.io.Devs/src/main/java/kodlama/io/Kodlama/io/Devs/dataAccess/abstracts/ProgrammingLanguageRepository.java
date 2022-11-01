package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;
//veri tabanı işleri yapıcak sınıflara verilen isimlerdir repository, Dao olarak da kullanmıştık

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	void add(ProgrammingLanguage programminglanguage);
	void delete(int id);
	void update(ProgrammingLanguage programminglanguage);
	ProgrammingLanguage getById(int id);
	List<ProgrammingLanguage> getAll(); //listelemek için 
	
}
