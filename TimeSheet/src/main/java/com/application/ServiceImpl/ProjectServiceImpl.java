package com.application.ServiceImpl;

import com.application.Service.ProjectService;

public class ProjectServiceImpl implements ProjectService {

    @Override
    public List<Project> getAllProjects() {
        // Return type: List<Project>
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(String id) {
        // Input parameter: String id
        // Return type: Project
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public Project createProject(Project project) {
        // Input parameter: Project project
        // Return type: Project
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Project project) {
        // Input parameter: Project project
        // Return type: Project
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(String id) {
        // Input parameter: String id
        // Return type: void
        projectRepository.deleteById(id);
    }

}
