package com.informatics.BigProject.controllers.view;

import com.informatics.BigProject.data.entities.Client;
import com.informatics.BigProject.data.entities.Office;
import com.informatics.BigProject.service.OfficeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/office")
public class OfficeController {
    private OfficeService officeService;

    @GetMapping
    public String getOffices(Model model) {
        final List<Office> offices = officeService.getOffices();
        model.addAttribute("office", offices);
        return "/office/office";
    }

    @GetMapping("/create-office")
    public String showCreateOfficeForm(Model model) {
        model.addAttribute("office", new Office());
        return "/office/create-office";
    }

    @PostMapping("/office")
    public String createOffice(@ModelAttribute Office office) {
        officeService.create(office);
        return "redirect:/office";
    }

    @GetMapping("/edit-office/{id}")
    public String showEditOfficeForm(Model model, @PathVariable long id, Office office) {
        officeService.updateOffice(id, office);
        return "redirect:/office";
    }

    @GetMapping("/delete/{id}")
    public String processProgramForm(@PathVariable int id) {
        officeService.deleteOffice(id);
        return "redirect:/office";
    }
}
