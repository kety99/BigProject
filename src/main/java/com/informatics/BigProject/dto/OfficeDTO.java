package com.informatics.BigProject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class OfficeDTO {
    private long id;
    private String name;
    private int maxNumberOfEmployees;
    private LocalDate foundationDate;
    private int deleted;
}
