package proiect.service;

import proiect.model.*;
import proiect.repository.RepositoryBilet;

import java.util.ArrayList;

public class ServiceBilet
{
    private RepositoryBilet repositoryBilet = new RepositoryBilet();
    private static ServiceBilet service = new ServiceBilet();

    private ServiceBilet()
    {

    }

    public static ServiceBilet getInstanta()
    {
        return service;
    }

    /**public boolean verificaBilet(Bilet bilet)
    {
        Integer nr = bilet.get_loc();
        if(nr < bilet.get_Spectacol().nrLocuri())
            return bilet.locliber(nr);
        return false;
    }*/

    /**public ArrayList<Bilet> getAllBilete()
    {
        return RepositoryBilet.getAll();
    }*/


}
