package proiect.main;

import proiect.model.Client;
import proiect.model.Student;
import proiect.model.Elev;
import proiect.model.Pensionar;
import proiect.model.Copil;
import proiect.model.Bilet;
import proiect.model.Spectacol;
import proiect.service.ServiceBilet;
import proiect.service.ServiceClient;

import java.util.ArrayList;

public class main
{
    public static void main(String[] args)
    {
        ServiceClient client_service = ServiceClient.getInstanta();
        client_service.addClient(new Client("Pop", "Liviu"));
        client_service.addClient(new Student("20466", "Mot", "Ovidiu"));
        client_service.addClient(new Elev("Blaj", "Sergiu"));
        client_service.addClient(new Elev("Blaj", "Sergiu"));
        client_service.addClient(new Copil("Marica", "Daria"));
        client_service.addClient(new Pensionar("Matei", "Valeria"));

        ArrayList<Client> clienti = ServiceClient.();

        for(Client client : clienti) {
            System.out.println(client);
        }


    }
}
