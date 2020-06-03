package proiect.service;

import proiect.model.*;
import proiect.repository.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CitireServiceClient
{
    private static CitireServiceClient ob = new CitireServiceClient();

    private CitireServiceClient()
    {

    }

    public static CitireServiceClient getob()
    {
        return ob;
    }

    public static ArrayList<Client> citire()
    {
        ArrayList<Client> clienti = new ArrayList<>();
        File fisier_clienti = new File("clienti.csv");
        if(!fisier_clienti.exists())
            return clienti;
        try(BufferedReader citire_csv = new BufferedReader(new FileReader(fisier_clienti)))
        {
            String linie;
            while ((linie = citire_csv.readLine()) != null)
            {
                String[] parsare = linie.split(",");
                if(parsare[0] == "")
                    clienti.add((new Client(parsare[1], parsare[2])));
                if(parsare[0] == "Student")
                    clienti.add(new Student(parsare[1], parsare[2], Integer.parseInt(parsare[3])));
                if(parsare[0] == "Elev")
                    clienti.add(new Elev(parsare[1], parsare[2]));
                if(parsare[0] == "Copil")
                    clienti.add(new Copil(parsare[1], parsare[2], Integer.parseInt(parsare[3])));
                if(parsare[0] == "Pensionar")
                    clienti.add(new Pensionar(parsare[1], parsare[2]));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return clienti;
    }
}
