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
public class JpaController {
	
	
	@Autowired
	private ServiceFormation FormationService;
	
	@Autowired
	private JPARepository repository;
	
	@GetMapping("/jpa/users/{name}/All")
	public List<Formation> GetAll(@PathVariable String name) {
		
		return repository.findByUsername(name);
		
	}
	
	@DeleteMapping("/jpa/users/{name}/formations/{id}")
	//ResponseEntity<Void>
	public void deleteById(@PathVariable int id , @PathVariable String name) {
			repository.deleteById(id);
	}
	
	@GetMapping("/jpa/users/{name}/formations/{id}")
	//ResponseEntity<Void>
	public Formation GetById(@PathVariable int id , @PathVariable String name) {
		
	return repository.findById(id).get();
					
	}
	
	@PutMapping("/jpa/users/{name}/formations/{id}")
	public Formation Update(@PathVariable int id , @PathVariable String name, @RequestBody Formation formation) {
		
		return repository.save(formation);
					
	}
	
	@PostMapping("/jpa/users/{name}/formations")
	public Formation Save(@PathVariable String name, @RequestBody Formation formation) {
		
		formation.setUsername(name);
		return repository.save(formation);
		
		//location response header ( njm nrajaa nafs uri heka w nzidou id par exemple ) 
					
	}
	
	@GetMapping("/jpa/AuthBean")
	public AuthBean GetAuth() {
		return new AuthBean("Bonjour");
	}

}
