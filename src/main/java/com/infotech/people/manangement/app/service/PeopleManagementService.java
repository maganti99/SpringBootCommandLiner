package com.infotech.people.manangement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.manangement.app.dao.PeopleManangementDao;
import com.infotech.people.manangement.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementDao peopleManangementDao;
	
	public Person createPerson(Person person1) {
		return peopleManangementDao.save(person1);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		Iterable<Person> list = peopleManangementDao.save(personList);
		return list;
	}

}
