package com.informatics.BigProject.controllers.view.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.OneToOne;
import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateOfficeViewModel {
    @OneToOne
    private String address;
}
