package com.informatics.BigProject.controllers.api;

import com.informatics.BigProject.data.entities.Office;
import com.informatics.BigProject.service.OfficeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class OfficeApiController {
    private final OfficeService officeService;

    @GetMapping(value = "/api/office")
    public List<Office> getOffices() {return officeService.getOffices();}

    @RequestMapping("/api/office/{id}")
    public Office getOffice(@PathVariable("id") long id){
        return officeService.getOffice(id);
    }

    @PostMapping(value = "/api/office")
    public Office createOffice(@RequestBody Office office) {
        return officeService.create(office);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/api/office/{id}")
    public Office updateOffice(@PathVariable("id") long id, @RequestBody Office office){
        return officeService.updateOffice(id, office);
    }

    @DeleteMapping(value = "/api/office/{id}")
    public void deleteOffice(@PathVariable long id) {
        officeService.deleteOffice(id);
    }
}
