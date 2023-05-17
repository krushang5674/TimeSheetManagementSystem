package com.application.Repository;

import com.application.Entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

    List<Employee> findByIsActive(boolean isActive);
    List<Employee> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName, String lastName);

}
