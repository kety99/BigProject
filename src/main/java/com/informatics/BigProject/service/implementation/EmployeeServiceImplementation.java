package com.informatics.BigProject.service.implementation;

import com.informatics.BigProject.data.entities.Employee;
import com.informatics.BigProject.data.repository.EmployeeRepository;
import com.informatics.BigProject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override //връща списък на всички служители
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @Override // връща служител по id
    public Employee getEmployee(long id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee id:" + id));
    }

    @Override //въвеждане на нов служител
    public Employee create(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override //ъпдейтване информацията за определен служител
    public Employee updateEmployee(long id, Employee employee){
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    @Override //изтриване на определен служител
    public void deleteEmployee(long id){
        try{
            employeeRepository.deleteById(id);
        }catch(EntityNotFoundException e){
            e.printStackTrace();
        }
    }
}
