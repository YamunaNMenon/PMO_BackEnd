package com.fse.pmo.services;

import java.util.List;

import com.fse.pmo.model.PmoUser;

public interface UserService {
	
	public Integer saveUpadteUser(PmoUser user);
	public List<PmoUser> getAllUsers();
	public PmoUser getUserById(Integer userId);
	public Integer deleteUserById(Integer userId);

}
