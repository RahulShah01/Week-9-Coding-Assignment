package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {

  private ProjectDao projectDao = new ProjectDao();

  /*
   * This methods called the DAO class to insert a project row. 
   */
  public Project addProject(Project project) {
    return projectDao.insertProject(project);
  }

}
