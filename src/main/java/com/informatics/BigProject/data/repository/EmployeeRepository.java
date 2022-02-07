package com.informatics.BigProject.data.repository;

import com.informatics.BigProject.data.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
