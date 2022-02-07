package com.informatics.BigProject.controllers.view;

import com.informatics.BigProject.data.entities.Employee;
import com.informatics.BigProject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @Controller
    @AllArgsConstructor
    @RequestMapping("/employees")
    public class EmployeeController {
        private EmployeeService employeeService;

        @GetMapping
        public String getEmployees(Model model) {
            final List<Employee> employees = employeeService.getEmployees();
            model.addAttribute("employees", employees);
            return "/employees/employees";
        }

        @GetMapping("/create-employees")
        public String showCreateEmployeeForm(Model model) {
            model.addAttribute("employee", new Employee());
            return "/employees/create-employees";
        }

        @PostMapping("/create")
        public String createEmployee(@ModelAttribute Employee employee) {
            employeeService.create(employee);
            return "redirect:/employee";
        }

        @GetMapping("/edit-employee/{id}")
        public String showEditEmployeeForm(Model model, @PathVariable long id, Employee employee) {
            employeeService.updateEmployee(id, employee);
            return "redirect:/employees";
        }

        @GetMapping("/delete/{id}")
        public String processProgramForm(@PathVariable int id) {
            employeeService.deleteEmployee(id);
            return "redirect:/employees";
        }

    }
