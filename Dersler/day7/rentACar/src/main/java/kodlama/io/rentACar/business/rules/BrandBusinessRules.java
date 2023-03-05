package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
	private BrandRepository brandRespository;
	
	public void checkIfBrandNameExists(String name) {
		if(this.brandRespository.existsByName(name)) {
			throw new BusinessException("Brand name already exists");
		}
	}
}
