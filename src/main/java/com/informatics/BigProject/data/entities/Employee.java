package com.informatics.BigProject.data.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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

    @OneToOne
    private LogisticCompany logisticCompany;

    @OneToMany(mappedBy = "employee")
    private Set<Package> packages;
}
