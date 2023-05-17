package com.application.ServiceImpl;

import com.application.Repository.TimeSheetRepository;
import com.application.Service.TimeSheetService;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {

    @Autowired
    TimeSheetRepository timeSheetRepository;

    @Override
    public List<TimeSheet> getAllTimeSheets() {
        // Return type: List<TimeSheet>
        return timeSheetRepository.findAll();
    }

    @Override
    public TimeSheet getTimeSheetById(String id) {
        // Input parameter: String id
        // Return type: TimeSheet
        return timeSheetRepository.findById(id).orElse(null);
    }

    @Override
    public TimeSheet createTimeSheet(TimeSheet timeSheet) {
        // Input parameter: TimeSheet timeSheet
        // Return type: TimeSheet
        return timeSheetRepository.save(timeSheet);
    }

    @Override
    public TimeSheet updateTimeSheet(TimeSheet timeSheet) {
        // Input parameter: TimeSheet timeSheet
        // Return type: TimeSheet
        return timeSheetRepository.save(timeSheet);
    }

    @Override
    public void deleteTimeSheet(String id) {
        // Input parameter: String id
        // Return type: void
        timeSheetRepository.deleteById(id);
    }

    @Override
    public List<TimeSheet> getTimeSheetsByEmployeeId(String employeeId) {
        // Input parameter: String employeeId
        // Return type: List<TimeSheet>
        return timeSheetRepository.findByEmployeeId(employeeId);
    }

    @Override
    public List<TimeSheet> getTimeSheetsByDateRange(LocalDate startDate, LocalDate endDate) {
        // Input parameters: LocalDate startDate, LocalDate endDate
        // Return type: List<TimeSheet>
        return timeSheetRepository.findByDateBetween(startDate, endDate);
    }
}

