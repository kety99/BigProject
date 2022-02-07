package com.informatics.BigProject.service;
import com.informatics.BigProject.data.entities.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee getEmployee(long id);

    Employee create(Employee employee);

    Employee updateEmployee(long id, Employee employee);

    void deleteEmployee(long id);
}
