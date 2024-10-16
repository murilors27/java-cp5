package service;

import dao.ClientRepository;
import model.Client;

import java.util.List;

public class ClientManager {
    private static ClientManager instance;
    private ClientRepository clientRepository;

    private ClientManager() {
        this.clientRepository = new ClientRepository();
    }

    public static ClientManager getInstance() {
        if (instance == null) {
            instance = new ClientManager();
        }
        return instance;
    }

    public void addClient(Client client) {
        clientRepository.add(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.getAll();
    }
}
