package com.dao;

import java.util.List;

import com.po.Person;

public interface PersonDao {
	/**
	 * 
	 * ��ѯ������Ϣ
	 * 
	 */
	public List<Person> findall();
	
	/**
	 * ɾ��
	 * 
	 */
	public void delone(int id);
	
	/**
	 * ��������Ϣ
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
	 * ����id�޸��û�
	 * @param person
	 * @return
	 */
	
	public boolean updateinfo(Person person);
	
	
	
}	
