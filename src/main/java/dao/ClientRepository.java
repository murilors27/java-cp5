package dao;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    private List<Client> clients = new ArrayList<>();

    public void add(Client client) {
        clients.add(client);
        System.out.println("Client saved: " + client.getName());
    }

    public List<Client> getAll() {
        return clients;
    }
}

