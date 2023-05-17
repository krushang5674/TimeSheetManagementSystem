package com.application.Controller;

import com.application.Service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        // Return type: List<Employee>
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        // Input parameter: String id
        // Return type: Employee
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        // Input parameter: Employee employee
        // Return type: Employee
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        // Input parameters: String id, Employee employee
        // Return type: Employee
        employee.setId(id); // Set the ID of the employee
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        // Input parameter: String id
        // Return type: void
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/active")
    public List<Employee> getActiveEmployees() {
        // Return type: List<Employee>
        return employeeService.getActiveEmployees();
    }

    @GetMapping("/inactive")
    public List<Employee> getInactiveEmployees() {
        // Return type: List<Employee>
        return employeeService.getInactiveEmployees();
    }

    @GetMapping("/search")
    public List<Employee> searchEmployees(@RequestParam("name") String name) {
        // Input parameter: String name
        // Return type: List<Employee>
        return employeeService.searchEmployees(name);
    }
}

