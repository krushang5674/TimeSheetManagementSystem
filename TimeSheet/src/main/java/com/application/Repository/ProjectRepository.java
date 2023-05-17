package com.application.Repository;

import com.application.Entity.Employee;

@Repository
public interface ProjectRepository extends MongoRepository<Employee, String>{
}
