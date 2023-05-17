package com.application.Controller;

import com.application.Service.TimeSheetService;

@RestController
@RequestMapping("/api/timesheets")
public class TimeSheetController {
    @Autowired
    TimeSheetService timeSheetService;

    @GetMapping
    public List<TimeSheet> getAllTimeSheets() {
        // Return type: List<TimeSheet>
        return timeSheetService.getAllTimeSheets();
    }

    @GetMapping("/{id}")
    public TimeSheet getTimeSheetById(@PathVariable String id) {
        // Input parameter: String id
        // Return type: TimeSheet
        return timeSheetService.getTimeSheetById(id);
    }

    @PostMapping
    public TimeSheet createTimeSheet(@RequestBody TimeSheet timeSheet) {
        // Input parameter: TimeSheet timeSheet
        // Return type: TimeSheet
        return timeSheetService.createTimeSheet(timeSheet);
    }

    @PutMapping("/{id}")
    public TimeSheet updateTimeSheet(@PathVariable String id, @RequestBody TimeSheet timeSheet) {
        // Input parameters: String id, TimeSheet timeSheet
        // Return type: TimeSheet
        timeSheet.setId(id); // Set the ID of the time sheet
        return timeSheetService.updateTimeSheet(timeSheet);
    }

    @DeleteMapping("/{id}")
    public void deleteTimeSheet(@PathVariable String id) {
        // Input parameter: String id
        // Return type: void
        timeSheetService.deleteTimeSheet(id);
    }

    @GetMapping("/employee/{employeeId}")
    public List<TimeSheet> getTimeSheetsByEmployeeId(@PathVariable String employeeId) {
        // Input parameter: String employeeId
        // Return type: List<TimeSheet>
        return timeSheetService.getTimeSheetsByEmployeeId(employeeId);
    }

    @GetMapping("/daterange")
    public List<TimeSheet> getTimeSheetsByDateRange(@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                                    @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        // Input parameters: LocalDate startDate, LocalDate endDate
        // Return type: List<TimeSheet>
        return timeSheetService.getTimeSheetsByDateRange(startDate, endDate);
    }
}

