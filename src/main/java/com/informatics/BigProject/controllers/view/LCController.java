package com.informatics.BigProject.controllers.view;

import com.informatics.BigProject.data.entities.LogisticCompany;
import com.informatics.BigProject.service.LCService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
