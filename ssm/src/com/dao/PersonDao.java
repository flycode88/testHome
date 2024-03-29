package com.dao;

import java.util.List;

import com.po.Person;

public interface PersonDao {
	/**
	 * 
	 * 查询所有信息
	 * 
	 */
	public List<Person> findall();
	
	/**
	 * 删除
	 * 
	 */
	public void delone(int id);
	
	/**
	 * 增加新信息
	 * 
	 */
	public int addone(Person p);
	/**
	 * 
	 * 
	 * @param id
	 * @return
	 */
	public Person findById(int id);
	
	/**
	 * 
	 * 根据id修改用户
	 * @param person
	 * @return
	 */
	
	public boolean updateinfo(Person person);
	
	
	
}	
