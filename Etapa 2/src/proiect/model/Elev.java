package proiect.model;

public class Elev extends Client
{
    private final static Integer discount = 25;

    public Elev(String Nume, String Prenume)
    {
        super(Nume, Prenume);
    }

    @Override
    public Double getPret(Double Pret)
    {
        return super.getPret(Pret) - ((super.getPret(Pret) * discount) / 100);
    }

    @Override
    public String toString()
    {
        return  "Client{" + "Nume ='" + Nume + ", Prenume =" + Prenume + "," +
                " discount = " + Integer.toString(discount) + "% de elev" + "}";
    }
}