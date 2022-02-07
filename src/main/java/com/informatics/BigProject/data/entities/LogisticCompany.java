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
@Table (name="logistic_company")
public class LogisticCompany extends BaseEntity{

    private String name;



}
