package com.informatics.BigProject.controllers.view;

import com.informatics.BigProject.data.entities.LogisticCompany;
import com.informatics.BigProject.service.LCService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/logisticcompanies")
public class LCController {
    private LCService lcService;

    @GetMapping
    public String getLogisticCompanies(Model model) {
        final List<LogisticCompany> logisticCompanies = lcService.getLogisticCompanies();
        model.addAttribute("logisticompanies", logisticCompanies);
        return "/logisticcompanies/logisticcompanies";
    }

    @GetMapping("/create-logisticcompanies")
    public String showCreateLogisticCompanyForm(Model model) {
        model.addAttribute("logisticcompany", new LogisticCompany());
        return "/logisticcompanies/create-logisticcompanies";
    }

    @PostMapping ("/create")
    public String sreateLogisticCompany(@ModelAttribute LogisticCompany logisticcompany){
        LCService.create(logisticcompany);
        return "redirect:/logisticcompany";
    }

    @GetMapping("/edit-logisticcompany/{id}")
    public String showEditLogisticCompanyForm(Model model, @PathVariable long id, LogisticCompany logisticCompany){
        LCService.updateLogisticCompany(id, logisticCompany);
        return "redirect:/logisticcompanies";
    }

    @GetMapping ("/update/{id}"){
        public String updateLogisticCompany(Model model, @PathVariable long id, LogisticCompany logistic company);
        LCService.updateLogisticCompany(id, updateLogisticCompany);
        return "redirect:/logisticcompanies";
    }

    @GetMapping("/delete/{id}")
    public String processProgramForm(@PathVariable int id){
        LCService.deleteLogisticCompany(id);
        return "redirect:/logisticcompanies";
    }

}
