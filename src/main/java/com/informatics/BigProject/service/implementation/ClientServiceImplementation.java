package com.informatics.BigProject.service.implementation;

import com.informatics.BigProject.data.entities.Client;
import com.informatics.BigProject.data.repository.ClientRepository;
import com.informatics.BigProject.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImplementation implements ClientService {

    private final ClientRepository clientRepository;

    @Override //връща списък на всички клиенти
    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    @Override // връща клиент по id
    public Client getClient(long id){
        return clientRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid client id:" + id));
    }

    @Override //въвеждане на нов клиент
    public Client create(Client client){
        return clientRepository.save(client);
    }

    @Override //ъпдейтване информацията за определен клиент
    public Client updateClient(long id, Client client){
        client.setId(id);
        return clientRepository.save(client);
    }

    @Override //изтриване на определен клиент
    public void deleteClient(long id){
        try{
            clientRepository.deleteById(id);
        }catch(EntityNotFoundException e){
            e.printStackTrace();
        }
    }


}
