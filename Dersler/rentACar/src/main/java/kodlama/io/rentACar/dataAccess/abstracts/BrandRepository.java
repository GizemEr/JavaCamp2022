package kodlama.io.rentACar.dataAccess.abstracts;
//geçen ders Dao olarak kullanmıştık şimdi repository olarak kullandık

import java.util.List;//kullanabilmek için import ettik

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository {
	List<Brand> getAll();//tümünü getirmek için, getAll çağıran birisi markaları listeler
}
