package com.application.Service;

public interface TimeSheetService {
    public List<TimeSheet> getAllTimeSheets();
    public TimeSheet getTimeSheetById(String id);
    public TimeSheet createTimeSheet(TimeSheet timeSheet);
    public TimeSheet updateTimeSheet(TimeSheet timeSheet);
    public void deleteTimeSheet(String id);
    public List<TimeSheet> getTimeSheetsByEmployeeId(String employeeId);
    public List<TimeSheet> getTimeSheetsByDateRange(LocalDate startDate, LocalDate endDate);
}
