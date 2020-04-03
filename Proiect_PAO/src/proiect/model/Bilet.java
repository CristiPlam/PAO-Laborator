package proiect.model;

import proiect.model.*;

public class Bilet
{
    private Client jon;
    private Loc loc;
    private Spectacol show;
    private Integer nr_bilet;

    public Bilet(Client jon, Loc loc, Spectacol show, Integer nr_bilet)
    {
        this.jon = jon;
        this.loc = loc;
        this.show = show;
        this.nr_bilet = nr_bilet;
    }

    public Integer getNr_bilet()
    {
        return this.nr_bilet;
    }

    @Override
    public String toString()
    {
        return "Bilet{Nr_bilet = " + Integer.toString(nr_bilet) + "Client = " + jon + "Spectacol = " +
                      show + "Loc = " + loc + "}";
    }

    public Integer get_loc()
    {
        return loc.getLoc();
    }

    public String get_Spectacol()
    {
        return show.getNume_Show();
    }

    public boolean locliber()
    {
        return loc.loc_liber();
    }

    public Integer nr_locuri()
    {
        return loc.nrLocuri();
    }
}
