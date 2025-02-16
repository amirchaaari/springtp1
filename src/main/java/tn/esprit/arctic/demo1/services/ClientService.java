package tn.esprit.arctic.demo1.services;

import tn.esprit.arctic.demo1.entities.Client;
import tn.esprit.arctic.demo1.repositories.ClientRepo;

import java.util.List;

public class ClientService implements IClientService {
     ClientRepo clientRepo;

    @Override
    public Client saveClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepo.findById(id).get();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepo.findAll() ;
    }

    @Override
    public Client updateClient(Long id, Client client) {
        return clientRepo.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepo.deleteById(id);

    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return clientRepo.saveAll(clients) ;
    }
}
