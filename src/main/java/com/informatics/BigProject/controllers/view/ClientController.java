package com.informatics.BigProject.controllers.view;

import com.informatics.BigProject.data.entities.Client;
import com.informatics.BigProject.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
        private ClientService clientService;

        @GetMapping
        public String getClients(Model model) {
            final List<Client> clients = clientService.getClients();
            model.addAttribute("client", clients);
            return "/client/client";
        }

        @GetMapping("/create-client")
        public String showCreateClientForm(Model model) {
            model.addAttribute("client", new Client());
            return "/client/create-client";
        }

        @PostMapping("/create")
        public String createClient(@ModelAttribute Client client) {
            clientService.create(client);
            return "redirect:/client";
        }

        @GetMapping("/edit-client/{id}")
        public String showEditClientForm(Model model, @PathVariable long id, Client client) {
            clientService.updateClient(id, client);
            return "redirect:/client";
        }

        @GetMapping("/delete/{id}")
        public String processProgramForm(@PathVariable int id) {
            clientService.deleteClient(id);
            return "redirect:/client";
        }

    }

