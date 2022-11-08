package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@RestController//annotation : bilgilendirme
@RequestMapping("/api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;
	
	@Autowired 
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll(){
		return technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateTechnologyRequest createTechnologyRequest)throws Exception {
		this.technologyService.add(createTechnologyRequest);
	}
	
	@DeleteMapping
	public void delete(@RequestBody DeleteTechnologyRequest deleteTechnologyRequest) {
		this.technologyService.delete(deleteTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody() UpdateTechnologyRequest updateTechnologyRequest) throws Exception{
		this.technologyService.update(updateTechnologyRequest);
	}
	
	@GetMapping("/{id}")
	public GetByIdTechnologiesResponse getById(@PathVariable int id) {
		return this.technologyService.getById(id);
	}
	
}
