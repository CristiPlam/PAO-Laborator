package proiect.model;

public class Copil extends Client
{
    private Integer varsta;
    private final static Integer discount = 40;

    public Copil(String Nume, String Prenume, Integer varsta)
    {
        super(Nume, Prenume);
        this.varsta = varsta;
    }

    @Override
    public Double getPret(Double Pret)
    {
        if(varsta > 0 && varsta < 10)
            return super.getPret(Pret) - ((super.getPret(Pret) * discount) / 100);
        return super.getPret(Pret);
    }

    @Override
    public String toString()
    {
        return  "Client{" + "Nume ='" + Nume + ", Prenume =" + Prenume + "," +
                " discount = " + Integer.toString(discount) + "% de copil" + "}";
    }
}