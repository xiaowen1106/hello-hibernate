package com.znz.hellohibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.znz.hellohibernate.dao.PersonDao;
import com.znz.hellohibernate.entity.Person;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	private PersonDao personDao;

	@RequestMapping(method=RequestMethod.POST)
	public Person create(@RequestBody Person person) {
		return personDao.save(person);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/{id}")
	public Person retrieve(@PathVariable Long id) {
		return personDao.findOne(id);
	}
}
