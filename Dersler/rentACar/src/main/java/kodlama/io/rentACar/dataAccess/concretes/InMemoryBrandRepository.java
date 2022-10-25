package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository //bu sınıf bir dataaccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository{

	List<Brand> brands;//buradaki List aslında ArrayList aşağıdaki
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();//bu hareket ile elimizde boş bir array varmış gibi düşünebiliriz
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Fiat"));
		brands.add(new Brand(5, "Renault"));
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
