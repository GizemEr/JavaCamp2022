package kodlama.io.Kodlama.io.Devs.webApi.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//api isimlendirmelerinde çoğul kullanılır
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController//annotation : bilgilendirme
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programminglanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programminglanguageService) {
		this.programminglanguageService = programminglanguageService;
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programminglanguageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception{
		 programminglanguageService.add(programmingLanguage);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		programminglanguageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception{
		programminglanguageService.update(programmingLanguage);
	}
	
	@GetMapping("/{id}")
	public ProgrammingLanguage getById(@PathVariable int id) {
		return programminglanguageService.getById(id);
	}
	
}
