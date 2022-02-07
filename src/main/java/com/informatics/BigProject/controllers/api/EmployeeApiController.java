package com.informatics.BigProject.controllers.api;


import com.informatics.BigProject.data.entities.Employee;
import com.informatics.BigProject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeApiController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/api/employee")
    public List<Employee> getEmployees() {return employeeService.getEmployees();}

    @RequestMapping("/api/employee/{id}")
    public Employee getEmployee(@PathVariable("id") long id){
        return employeeService.getEmployee(id);
    }

    @PostMapping(value = "/api/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/api/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping(value = "/api/employee/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }
}
