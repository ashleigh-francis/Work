package com.bae.puppies.service;

import java.util.List;

import com.bae.puppies.data.Puppy;

public interface PuppyService {

	public void createPuppy(Puppy puppy);

	public List<Puppy> getAllPuppies();

	public Puppy getPuppy(int id);

	public Puppy replacePuppy(int id, Puppy newPuppy);

	public String deletePuppy(int id);
}
