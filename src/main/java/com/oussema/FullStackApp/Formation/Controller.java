package com.oussema.FullStackApp.Formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@CrossOrigin
public class Controller {
	
	
	@Autowired
	private ServiceFormation FormationService;
	
	@GetMapping("/users/{name}/All")
	public List<Formation> GetAll(@PathVariable String name) {
		
		return FormationService.findAll();
		
	}
	
	@DeleteMapping("/users/{name}/formations/{id}")
	//ResponseEntity<Void>
	public void deleteById(@PathVariable int id , @PathVariable String name) {
			FormationService.deleteById(id);
			/*if(formation != null)
				return ResponseEntity.noContent().build();
			
			return ResponseEntity.notFound().build();*/
					
	}
	
	@GetMapping("/users/{name}/formations/{id}")
	//ResponseEntity<Void>
	public Formation GetById(@PathVariable int id , @PathVariable String name) {
		
		return FormationService.findById(id);
					
	}
	
	@PutMapping("/users/{name}/formations/{id}")
	public Formation Update(@PathVariable int id , @PathVariable String name, @RequestBody Formation formation) {
		
		return FormationService.save(formation);
					
	}
	
	@PostMapping("/users/{name}/formations")
	public Formation Save(@PathVariable String name, @RequestBody Formation formation) {
		
		return FormationService.save(formation);
		
		//location response header ( njm nrajaa nafs uri heka w nzidou id par exemple ) 
					
	}
	
	@GetMapping("/AuthBean")
	public AuthBean GetAuth() {
		return new AuthBean("Bonjour");
	}

}
