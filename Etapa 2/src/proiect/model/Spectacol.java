package proiect.model;

public class Spectacol
{
    private String Nume_Show;
    private Integer zi;
    private Integer luna;
    private Integer an;
    private String locatie;
    private Double Pret;

    public Spectacol(String Nume_Show, Integer zi, Integer luna, Integer an, String locatie, Double Pret)
    {
        this.Nume_Show = Nume_Show;
        this.zi = zi;
        this.luna = luna;
        this.an = an;
        this.locatie = locatie;
        this.Pret = Pret;
    }

    public String getNume_Show()
    {
        return this.Nume_Show;
    }
    public void setPret(Double Pret)
    {
        this.Pret = Pret;
    }

    public boolean validare_data()
    {
        if(zi > 1 || zi < 31)
            if(luna > 1 || luna < 12)
                if(an == 2020)
                    return true;
        return false;
    }

    @Override
    public String toString()
    {
        return "Spectacol{ nume_spectacol = " + "Nume_Show" + "in data de " + Integer.toString(zi) + "." +
                           Integer.toString(luna) + "." + Integer.toString(an) + " pret bilet = "
                           + Double.toString(Pret) + "}";
    }

}
