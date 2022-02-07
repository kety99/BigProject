package com.informatics.BigProject.controllers.api;

import com.informatics.BigProject.data.entities.Client;
import com.informatics.BigProject.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientApiController {

    private final ClientService clientService;

    @GetMapping(value = "/api/client")
    public List<Client> getClients() {return clientService.getClients();}

    @RequestMapping ("/api/client/{id}")
    public Client getClient(@PathVariable("id") long id){
        return clientService.getClient(id);
    }

    @PostMapping (value = "/api/client")
    public Client createClient(@RequestBody Client client) {
        return clientService.create(client);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/api/client/{id}")
    public Client updateClient(@PathVariable("id") long id, @RequestBody Client client){
        return clientService.updateClient(id, client);
    }

    @DeleteMapping(value = "/api/client/{id}")
    public void deleteClient(@PathVariable long id) {
        clientService.deleteClient(id);
    }

}
