package com.application.Entity;

import java.time.LocalDate;

@Entity
public class Task {
    @Id
    private String id;
    private String projectId;
    private String name;
    private String description;
    private LocalDate dueDate;

    // Constructors, getters, and setters
    // ...
}

