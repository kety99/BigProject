package com.informatics.BigProject.data.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee extends BaseEntity{

    private String name;
}
