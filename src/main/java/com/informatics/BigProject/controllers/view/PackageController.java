package com.informatics.BigProject.controllers.view;

import com.informatics.BigProject.data.entities.Package;
import com.informatics.BigProject.service.PackageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/package")
public class PackageController {

    private PackageService packageService;

    @GetMapping
    public String getPackages(Model model) {
        final List<Package> packages = packageService.getPackages();
        model.addAttribute("package", packages);
        return "/package/package";
    }

    @GetMapping("/create-package")
    public String showCreatePackageForm(Model model) {
        model.addAttribute("package", new Package());
        return "/package/create-package";
    }

    @PostMapping("/package")
    public String createPackage(@ModelAttribute Package package1) {
        packageService.create(package1);
        return "redirect:/package";
    }

    @GetMapping("/edit-package/{id}")
    public String showEditPackageForm(Model model, @PathVariable long id, Package package1) {
        packageService.updatePackage(id, package1);
        return "redirect:/package";
    }

    @GetMapping("/delete/{id}")
    public String processProgramForm(@PathVariable int id) {
        packageService.deletePackage(id);
        return "redirect:/package";
    }
}
