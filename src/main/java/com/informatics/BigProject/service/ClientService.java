package com.informatics.BigProject.service;
import com.informatics.BigProject.data.entities.Client;
import java.util.List;

public interface ClientService {

    List<Client> getClients();

    Client getClient(long id);

    Client create(Client client);

    Client updateClient(long id, Client client);

    void deleteClient(long id);
}
