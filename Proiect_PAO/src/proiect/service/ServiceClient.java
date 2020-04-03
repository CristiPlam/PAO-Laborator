package proiect.service;

import proiect.model.*;
import proiect.repository.RepositoryClient

import java.util.ArrayList;

public class ServiceClient
{
    private RepositoryClient repositoryClient = new RepositoryClient();
    private static ServiceClient service = new ServiceClient();

    private ServiceClient() { }

    public static ServiceClient getInstanta()
    {
        return service;
    }

    public void addClient(Client client)
    {
        repositoryClient.add(client);
    }

    public ArrayList<Client> getClientsByNume(String nume, String prenume)
    {
        return RepositoryClient.getAll(nume, prenume);
    }

    public ArrayList<Client> getAllClienti()
    {
        return repositoryClient.getAll();
    }



}
