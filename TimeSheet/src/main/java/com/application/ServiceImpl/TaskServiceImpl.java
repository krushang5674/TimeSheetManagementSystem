package com.application.ServiceImpl;

import com.application.Repository.TaskRepository;
import com.application.Service.TaskService;

public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        // Return type: List<Task>
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(String id) {
        // Input parameter: String id
        // Return type: Task
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task createTask(Task task) {
        // Input parameter: Task task
        // Return type: Task
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        // Input parameter: Task task
        // Return type: Task
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(String id) {
        // Input parameter: String id
        // Return type: void
        taskRepository.deleteById(id);
    }

}
