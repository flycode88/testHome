package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PersonDao;
import com.po.Person;
import com.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;
/*
 * ²é
 */
	@Override
	public List<Person> findall() {
		return personDao.findall();
	}
	/*
	 * É¾
	 */
	@Override
	public void delone(int id) {

		personDao.delone(id);
	}
	/*
	 * 
	 * Ôö
	 */
	@Override
	public int addone(Person p) {
		return personDao.addone(p);
	}
	/**
	 * 
	 */
	@Override
	public Person findById(int id) {
		
		return personDao.findById(id);
	}
	
	
	@Override
	public boolean updateinfo(Person person) {
		
		
		return personDao.updateinfo(person);
	}
	
	
}
