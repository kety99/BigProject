package com.informatics.BigProject.data.repository;

import com.informatics.BigProject.data.entities.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}
