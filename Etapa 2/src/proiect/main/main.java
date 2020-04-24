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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class main
{
    public static void main(String[] args)
    {
        /**
        ServiceClient client_service = ServiceClient.getInstanta();
        client_service.addClient(new Client("Pop", "Liviu"));
        client_service.addClient(new Student("Mot", "Ovidiu", 20466));
        client_service.addClient(new Elev("Blaj", "Sergiu"));
        client_service.addClient(new Elev("Blaj", "Sergiu"));
        client_service.addClient(new Copil("Marica", "Daria", 12));
        client_service.addClient(new Pensionar("Matei", "Valeria"));

        ArrayList<Client> clienti = client_service.getAllClienti();

        for(Client client : clienti) {
            System.out.println(client);
        }
         */

        /**
        String csvFile = "/Facultate/Anul II/Semestrul 2/PROIECT_PAO/src/proiect/clienti.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {

            while ((line = br.readLine()) != null)
            {
                String[] nume = line.split(cvsSplitBy);

                for( int i = 0; i < nume.length; i ++)
                    for( int j = 0; j < nume.length; j ++)
                    System.out.println("Client {nume= " + nume[i] + " , prenume=" + nume[j] + "}");

            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
         */

        ServiceClient service = ServiceClient.getInstanta();
        service.citeste_clienti_din_csv();

        service.addClient(new Pensionar("Gigel", "Marcel"));
        service.getPensionari();
        service.addClient(new Student("George", "Ion", 20466));
        service.getStudenti();

    }
}
