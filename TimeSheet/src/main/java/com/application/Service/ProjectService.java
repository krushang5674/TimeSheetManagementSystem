package com.application.Service;

public interface ProjectService {

    public List<Project> getAllProjects();
    public Project getProjectById(String id);
    public Project createProject(Project project);
    public Project updateProject(Project project);
    public void deleteProject(String id);
}
