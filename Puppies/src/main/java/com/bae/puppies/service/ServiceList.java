package com.bae.puppies.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.bae.puppies.data.Puppy;

@Service
public class ServiceList implements PuppyService {

	private List<Puppy> puppies = new ArrayList<>();

	@Override
	public void createPuppy(@RequestBody Puppy puppy) {
		System.out.println(puppy);
		this.puppies.add(puppy);
	}

	@Override
	public List<Puppy> getAllPuppies() {
		return this.puppies;
	}

	@Override
	public Puppy getPuppy(int id) {
		Puppy found = this.puppies.get(id);
		return found;
	}

	@Override
	public Puppy replacePuppy(int id, Puppy newPuppy) {
		return this.puppies.set(id, newPuppy);

	}

	@Override
	public String deletePuppy(int id) {
		this.puppies.remove(id);

		return "Deleted puppy at index " + id;
	}
}
