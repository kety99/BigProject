package com.informatics.BigProject.data.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="package")
public class Package extends BaseEntity{

    private boolean paid;

    private BigDecimal price;

    private String addressStart;

    private String addressDestination;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Employee employee;


}
