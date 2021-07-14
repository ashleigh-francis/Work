package com.bae.puppies.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.puppies.data.Puppy;
import com.bae.puppies.service.PuppyService;

@RestController
public class PuppyController { // Spring class for receiving requests and creating responses

	private PuppyService service;

	public PuppyController(PuppyService service) {
		super();
		this.service = service;
	}

	@GetMapping("/puppy/all")
	public List<Puppy> getAllPuppies() {
		return service.getAllPuppies();
	}

	@PostMapping("/createPuppy") // CREATE = POST
	public void createPuppy(@RequestBody Puppy puppy) {
		this.service.createPuppy(puppy);
	}

	@GetMapping("/getPuppy/{id}") // READ = GET
	public Puppy getPuppy(@PathVariable int id) {
		return this.service.getPuppy(id);
	}

	@DeleteMapping("/deletePuppy/{id}")
	public String deletePuppy(@PathVariable int id) {
		return this.service.deletePuppy(id);
	}

	@PutMapping("/replacePuppy/{id}")
	public Puppy replacePuppy(@PathVariable int id, @RequestBody Puppy newPuppy) {
		return this.service.replacePuppy(id, newPuppy);

	}

//	@PatchMapping("/patchPuppy/{id}")
//	public String PatchPuppy(@PathVariable int id, @RequestBody Puppy puppy) {
//		return "Updated puppy at index  " + id;
	// }

}
