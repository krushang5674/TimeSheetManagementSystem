package com.application.Repository;

import com.application.Entity.Employee;
@Repository
public interface TimeSheetRepository extends MongoRepository<Employee, String>{
    List<TimeSheet> findByEmployeeId(String employeeId);
    List<TimeSheet> findByDateBetween(LocalDate startDate, LocalDate endDate);

}
