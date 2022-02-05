package com.mfsa.extract.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mfsa.extract.model.Person;

public class PersonItenProcessor implements ItemProcessor<Person, Person>{

	@Override
	public Person process(Person person) throws Exception {
		return person;
	}
}