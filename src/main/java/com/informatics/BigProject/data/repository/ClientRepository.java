package com.informatics.BigProject.data.repository;

import com.informatics.BigProject.data.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long> {
}
