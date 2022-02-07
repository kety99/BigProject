package com.informatics.BigProject.controllers.api;

import com.informatics.BigProject.data.entities.Package;
import com.informatics.BigProject.service.PackageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PackageApiController {
    private final PackageService packageService;

    @GetMapping(value = "/api/package")
    public List<Package> getPakages() {return packageService.getPackages();}

    @RequestMapping("/api/package/{id}")
    public Package getPackage(@PathVariable("id") long id){
        return packageService.getPackage(id);
    }

    @PostMapping(value = "/api/package")
    public Package createPackage(@RequestBody Package package1) {
        return packageService.create(package1);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/api/package/{id}")
    public Package updatePackage(@PathVariable("id") long id, @RequestBody Package package1){
        return packageService.updatePackage(id, package1);
    }

    @DeleteMapping(value = "/api/package/{id}")
    public void deletePackage(@PathVariable long id) {
        packageService.deletePackage(id);
    }
}
