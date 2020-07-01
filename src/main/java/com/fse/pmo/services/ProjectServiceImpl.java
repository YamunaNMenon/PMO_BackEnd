package com.fse.pmo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.pmo.dao.ProjectDaoImpl;
import com.fse.pmo.dao.UserDaoImpl;
import com.fse.pmo.model.PmoProject;
import com.fse.pmo.model.PmoUser;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDaoImpl projectDao;
	
	@Autowired
	private UserDaoImpl userDao;
	
	@Override
	public Integer saveUpadteProject(PmoProject project) {
		Integer saveOrUpadte = projectDao.saveUpadteProject(project) ;
		//PmoUser updatedUser = new PmoUser() ;
		//updatedUser = project.getUser();
		//updatedUser.setProject(project);
		//userDao.saveUpadteUser(updatedUser);
		return saveOrUpadte ;
	}

	@Override
	public List<PmoProject> getAllProjects() {
		return projectDao.getAllProjects() ;
	}

	@Override
	public PmoProject getProjectById(Integer projectId) {
		return projectDao.getProjectById(projectId) ;
	}

	@Override
	public Integer deleteProjectById(Integer projectId) {
		return projectDao.deleteProjectById(projectId) ;
	}
}
