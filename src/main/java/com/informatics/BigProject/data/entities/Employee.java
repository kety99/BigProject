package com.informatics.BigProject.data.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee extends BaseEntity{

    private String name;

    private BigDecimal salary;

    @ManyToOne
    private LogisticCompany logisticCompany;

    @OneToMany(mappedBy = "employee")
    private Set<Package> packages;
}
