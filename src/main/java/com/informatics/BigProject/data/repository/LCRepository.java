package com.informatics.BigProject.data.repository;

import com.informatics.BigProject.data.entities.LogisticCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LCRepository extends JpaRepository<LogisticCompany, Long> {
}
