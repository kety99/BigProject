package com.informatics.BigProject.controllers.view.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateOfficeViewModel {
    @NotBlank
    @Size(min = 3, max = 25, message="Min 3, Max 25")
    private String name;

    @NotNull
    @Max(value = 100, message = "Max 100")
    private int maxNumberOfEmployees;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message="The date has to be in the past!")
    private LocalDate foundationDate;
}
