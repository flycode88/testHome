package com.dao;

import java.util.List;

import com.po.Login;

public interface LoginDao {
	/**
	 * ��¼
	 * @param login
	 * @return
	 */
	public Login cheak(Login login);
	
	/**
	 * 
	 * ��ѯ����Ա��Ϣ
	 * @param login
	 * @return
	 */
	
	public List<Login> findadmin();
	/**
	 *�޸Ĺ���Ա����
	 * @param id
	 * @return
	 */
	public int  updatepwd(Login login);
	
	/**
	 * �û�ע��
	 * @param login
	 * @return
	 */
	public int newuser(Login login);
}
