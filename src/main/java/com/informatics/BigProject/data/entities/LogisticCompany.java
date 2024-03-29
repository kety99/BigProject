package com.informatics.BigProject.data.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name="logistic_company")
public class LogisticCompany extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "logisticCompany")
    private Set<Employee> employees;

    @OneToOne
    private Office office;


}
