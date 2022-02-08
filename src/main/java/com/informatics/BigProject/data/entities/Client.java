package com.informatics.BigProject.data.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "client")
    private Set<Package> packages;

}
