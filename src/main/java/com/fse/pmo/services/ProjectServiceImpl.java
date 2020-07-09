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
	private UserDaoImpl userDaoImpl;
	
	@Override
	public Integer saveUpadteProject(PmoProject project) {
		Integer result = projectDao.saveUpadteProject(project);
		if( result > 0 && project.getUser() != null) {
		PmoUser pmoUser = project.getUser().get(0);
		pmoUser.setProjectData(project);
		pmoUser.setManager_check(1);
		userDaoImpl.saveUpadteUser(pmoUser);
		}
		
		return result;
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
