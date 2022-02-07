package com.informatics.BigProject.data.repository;

import com.informatics.BigProject.data.entities.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office, Long> {
}
