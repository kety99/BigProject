package com.informatics.BigProject.controllers.view.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class OfficeViewModel {
    private long id;
    private String name;
    private int maxNumberOfEmployees;
    private LocalDate foundationDate;
}
