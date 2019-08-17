package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDao;
import com.po.Login;
import com.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired

	private LoginDao loginDao;

	@Override
	public Login cheak(Login login) {

		return loginDao.cheak(login);
	}

	/**
	 * 
	 * ��ѯ����Ա��Ϣ
	 */
	@Override
	public List<Login> findadmin() {
		return loginDao.findadmin();
	}

	/**
	 * 
	 * �޸Ĺ���Ա����
	 */
	@Override
	public int updatepwd(Login login) {

		return loginDao.updatepwd(login);
	}

	@Override
	public int newuser(Login login) {
		return loginDao.newuser(login);
	}

}
