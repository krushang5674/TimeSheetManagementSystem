package com.application.Entity;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isActive;
    private LocalDate joinDate;
    private LocalDate resignationDate;
    private String position;

    // Constructors, getters, and setters
    // ...
}

