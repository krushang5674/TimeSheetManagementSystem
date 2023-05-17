package com.application.Repository;

import com.application.Entity.Employee;
@Repository
public interface TaskRepository extends MongoRepository<Employee, String>{
    List<Task> findByProjectId(String projectId);
    List<Task> findByDueDateBefore(LocalDate date);
}
