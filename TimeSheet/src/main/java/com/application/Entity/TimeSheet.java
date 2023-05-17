package com.application.Entity;

import java.time.LocalDate;

@Entity
public class TimeSheet {
    @Id
    private String id;
    private String employeeId;
    private LocalDate date;
    private int hoursWorked;
    private String description;

    // Constructors, getters, and setters
    // ...
}

