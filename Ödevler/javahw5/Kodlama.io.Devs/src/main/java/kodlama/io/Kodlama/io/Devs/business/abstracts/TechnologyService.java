package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();

	void add(CreateTechnologyRequest createTechnologyRequest)throws Exception;

	void delete(DeleteTechnologyRequest deleteTechnologyRequest);

	void update(UpdateTechnologyRequest updateTechnologyRequest)throws Exception;

	GetByIdTechnologiesResponse getById(int id);
	
}
