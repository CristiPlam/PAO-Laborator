package proiect.repository;

import proiect.model.*;


import java.util.ArrayList;

public class RepositoryBilet
{
    private ArrayList<Bilet> rep_Bilet;

    public RepositoryBilet()
    {
        rep_Bilet = new ArrayList<>();
    }

    public void add(Bilet bilet)
    {
        rep_Bilet.add(bilet);
    }

    public ArrayList<Bilet> getAllBilete()
    {
        return rep_Bilet;
    }

    public void deleteBilet(Bilet bilet)
    {
        rep_Bilet.remove(bilet);
    }

    public Bilet getBiletByNumarBilet(int nr_bilet)
    {
        for(Bilet bilet : rep_Bilet)
        {
            if(bilet.getNr_bilet() == nr_bilet)
                return bilet;
        }
        return null;
    }


    public ArrayList<Bilet> getAll()
    {
        return rep_Bilet;
    }
}
