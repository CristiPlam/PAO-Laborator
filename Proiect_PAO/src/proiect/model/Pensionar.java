package proiect.model;

public class Pensionar extends Client
{
    private final static Integer discount = 50;

    public Pensionar(String Nume, String Prenume)
    {
        super(Nume, Prenume);
    }

    @Override
    public Double getPret(Double pret) {
        return super.getPret(pret) * ((super.getPret(pret) * discount) / 100);
    }

    @Override
    public String toString()
    {
        return  "Client{" + "Nume ='" + Nume + ", Prenume =" + Prenume + "," +
                " discount = " + Integer.toString(discount) + "% de pensionar" + "}";
    }

}
