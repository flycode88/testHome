package com.service;

import java.util.List;

import com.po.Login;

public interface LoginService {
	/**
	 * 登录
	 * @param login
	 * @return
	 */
	public Login cheak(Login login);
	
	/**
	 * 
	 * 查询管理员信息
	 * @return
	 */
	
	public List<Login> findadmin();
	
	/**
	 *修改管理员密码
	 * @param id
	 * @return
	 */
	public int  updatepwd(Login login);
	
	/**
	 * 用户注册
	 * @param login
	 * @return
	 */
	public int newuser(Login login);
}
