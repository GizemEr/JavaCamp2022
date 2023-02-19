package kodlama.io.rentACar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
}
//http://localhost:8080/api/brands/getall
//http://localhost:8080/swagger-ui/index.html
//Brand-->Marka
//Car-->Araba

//http://localhost:8080/api/brands/getall
//http://localhost:8080/swagger-ui/index.html