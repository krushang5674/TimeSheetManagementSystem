package com.application.Entity;

import java.time.LocalDate;

@Entity
public class Project {
    @Id
    private String id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructors, getters, and setters
    // ...
}

