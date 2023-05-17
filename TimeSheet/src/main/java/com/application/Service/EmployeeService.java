package com.application.Service;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(String id);
    public Employee createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(String id);
    public List<Employee> getActiveEmployees();
    public List<Employee> getInactiveEmployees();
    public List<Employee> searchEmployees(String name);
}
