package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;
//veri tabanı işleri yapıcak sınıflara verilen isimlerdir repository, Dao olarak da kullanmıştık

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer>{
	
	 
	
}
