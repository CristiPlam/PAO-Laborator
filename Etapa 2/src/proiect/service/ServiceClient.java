package proiect.service;

import proiect.model.*;
import proiect.repository.RepositoryClient;

import java.util.ArrayList;

public class ServiceClient
{
    private RepositoryClient repositoryClient = new RepositoryClient();
    private static ServiceClient service = new ServiceClient();
    Audit audit = Audit.getInstance();

    private ServiceClient()
    {

    }

    public static ServiceClient getInstanta()
    {
        return service;
    }

    public void addClient(Client client)
    {
        audit.scrie_in_csv("Adauga client", audit.timeStamp());
        repositoryClient.add(client);
    }

    /**public ArrayList<Client> getClientsByNume(String nume, String prenume)
    {
        return repositoryClient.getAll(nume, prenume);
    }*/

    public ArrayList<Client> getClienti()
    {
        audit.scrie_in_csv("Get clienti", audit.timeStamp());
        return repositoryClient.getAll();
    }

    public ArrayList<Student> getStudenti()
    {
        audit.scrie_in_csv("Get studenti", audit.timeStamp());
        return repositoryClient.getStudenti();
    }

    public ArrayList<Copil> getCopii()
    {
        audit.scrie_in_csv("Get copii", audit.timeStamp());
        return repositoryClient.getCopii();
    }

    public ArrayList<Pensionar> getPensionari()
    {
        audit.scrie_in_csv("Get pensionari", audit.timeStamp());
        return repositoryClient.getPensionari();
    }

    public void citeste_clienti_din_csv()
    {
        audit.scrie_in_csv("Citeste toti clientii din fisier", audit.timeStamp());
        CitireServiceClient file = CitireServiceClient.getob();
        ArrayList<Client> clienti;
        clienti = CitireServiceClient.citire();
        for(Client client: clienti)
        {
           addClient(client);
        }
    }



}
