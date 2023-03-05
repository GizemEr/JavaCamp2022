package kodlama.io.rentACar.dataAccess.abstracts;
//geçen ders Dao olarak kullanmıştık şimdi repository olarak kullandık

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand,Integer>{
	boolean existsByName(String name); // spring jpa keywords
}


