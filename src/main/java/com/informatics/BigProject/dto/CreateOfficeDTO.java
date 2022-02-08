package com.informatics.BigProject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CreateOfficeDTO {
    private String name;
    private int maxNumberOfEmployees;
    private LocalDate foundationDate;
}

