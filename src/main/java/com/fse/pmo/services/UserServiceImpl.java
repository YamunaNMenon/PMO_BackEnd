package com.fse.pmo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.pmo.dao.UserDaoImpl;
import com.fse.pmo.model.PmoUser;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDaoImpl userDaoImpl;
	
	@Override
	public Integer saveUpadteUser(PmoUser user) {
		return userDaoImpl.saveUpadteUser(user);
	}

	@Override
	public List<PmoUser> getAllUsers() {
		return userDaoImpl.getAllUsers();
	}

	@Override
	public PmoUser getUserById(Integer userId) {
		return userDaoImpl.getUserById(userId);
	}

	@Override
	public Integer deleteUserById(Integer userId) {
		return userDaoImpl.deleteUserById(userId);
	}
	
}
