package com.informatics.BigProject.controllers.view.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.OneToOne;
import javax.validation.constraints.*;

@Getter
@Setter
public class CreateOfficeViewModel {
    @OneToOne
    private String address;
}
