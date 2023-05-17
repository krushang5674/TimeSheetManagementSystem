package com.application.ServiceImpl;

import com.application.Repository.EmployeeRepository;
import com.application.Service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        // Return type: List<Employee>
        return employeeRepository.findAll();
    }
    @Override
    public Employee getEmployeeById(String id) {
        // Input parameter: String id
        // Return type: Employee
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // Input parameter: Employee employee
        // Return type: Employee
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        // Input parameter: Employee employee
        // Return type: Employee
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        // Input parameter: String id
        // Return type: void
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getActiveEmployees() {
        // Return type: List<Employee>
        return employeeRepository.findByIsActive(true);
    }

    @Override
    public List<Employee> getInactiveEmployees() {
        // Return type: List<Employee>
        return employeeRepository.findByIsActive(false);
    }

    public List<Employee> searchEmployees(String name) {
        // Input parameter: String name
        // Return type: List<Employee>
        return employeeRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(name, name);
    }
}
