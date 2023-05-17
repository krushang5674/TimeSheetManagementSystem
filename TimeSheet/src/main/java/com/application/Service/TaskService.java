package com.application.Service;

public interface TaskService {
    public List<Task> getAllTasks();
    public Task getTaskById(String id);
    public Task createTask(Task task);
    public Task updateTask(Task task);
    public void deleteTask(String id);
}
