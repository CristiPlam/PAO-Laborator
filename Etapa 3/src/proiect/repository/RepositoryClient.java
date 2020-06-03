package proiect.repository;

import proiect.model.*;

import java.util.ArrayList;

public class RepositoryClient
{
    private ArrayList<Client> rep_Client;

    public RepositoryClient()
    {
        rep_Client = new ArrayList<>();
    }

    public void add(Client client)
    {
        rep_Client.add(client);
    }

    public ArrayList<Client> getAll()
    {
        return rep_Client;
    }

    public void remove(Client client)
    {
        rep_Client.remove(client);
    }

    public ArrayList<Client> getAllByNume(String nume, String prenume)
    {
        ArrayList<Client> clienti = new ArrayList<>();

        for(Client client : rep_Client)
        {
            if(client.getName().equals(nume) && client.getSurname().equals(prenume))
                clienti.add(client);
        }
        return clienti;
    }

    public ArrayList<Student> getStudenti()
    {
        ArrayList<Student> Studenti = new ArrayList<>();
        for(Client client : rep_Client) {
            if (client instanceof Student)
            {
                Student student = (Student) client;
                Studenti.add(student);
            }
        }
        return Studenti;
    }

    public ArrayList<Elev> getElevi()
    {
        ArrayList<Elev> Elevi = new ArrayList<>();
        for(Client client : rep_Client)
        {
            if (client instanceof Elev)
            {
                Elev elev = (Elev) client;
                Elevi.add(elev);
            }
        }
        return Elevi;
    }

    public ArrayList<Copil> getCopii()
    {
        ArrayList<Copil> Copii = new ArrayList<>();
        for(Client client : rep_Client)
        {
            if (client instanceof Copil)
            {
                Copil copil = (Copil) client;
                Copii.add(copil);
            }
        }
        return Copii;
    }

    public ArrayList<Pensionar> getPensionari()
    {
        ArrayList<Pensionar> Pensionari = new ArrayList<>();
        for(Client client : rep_Client)
        {
            if (client instanceof Pensionar)
            {
                Pensionar pensionar = (Pensionar) client;
                Pensionari.add(pensionar);
            }
        }
        return Pensionari;
    }

    public ArrayList<Client> getClientiDiscount()
    {
        ArrayList<Client> Discount = new ArrayList<>();
        for (Client client : rep_Client)
        {
            if ((client instanceof Student) || (client instanceof Elev) || (client instanceof Copil) || (client instanceof Pensionar)) {
                Discount.add(client);
            }
        }
        return Discount;
    }
}
