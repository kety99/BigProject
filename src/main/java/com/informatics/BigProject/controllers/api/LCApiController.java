package com.informatics.BigProject.controllers.api;

import com.informatics.BigProject.data.entities.LogisticCompany;
import com.informatics.BigProject.service.LCService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class LCApiController {

    private final LCService lcService;

    @GetMapping(value = "/api/logisticcompany")
    public List<LogisticCompany> getLogisticCompanies() {return lcService.getLogisticCompanies();}

    @RequestMapping("/api/logisticcompany/{id}")
    public LogisticCompany getLogisticCompany(@PathVariable("id") long id){
        return lcService.getLogisticCompany(id);
    }

    @PostMapping(value = "/api/logisticcompanies")
    public LogisticCompany createLogisticCompany(@RequestBody LogisticCompany logisticCompany) {
        return lcService.create(logisticCompany);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/api/logisticcompany/{id}")
    public LogisticCompany updateLogisticCompany(@PathVariable("id") long id, @RequestBody LogisticCompany logisticCompany){
        return lcService.updateLogisticCompany(id, logisticCompany);
    }

    @DeleteMapping(value = "/api/logisticcompany/{id}")
    public void deleteLogisticCompany(@PathVariable long id) {
        lcService.deleteLogisticCompany(id);
    }
}
