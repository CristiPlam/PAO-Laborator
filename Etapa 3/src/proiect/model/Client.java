package proiect.model;

public class Client
{
    protected String Nume;
    protected String Prenume;

    public Client()
    {

    }

    public Client(String Name, String Surname)
    {
        this.Nume = Name;
        this.Prenume = Surname;
    }

    public String getName()
    {
        return Nume;
    }

    public String getSurname()
    {
        return Prenume;
    }

    public void setName(String name) {
        this.Nume = name;
    }

    public void setSurname(String surname) {
        this.Prenume = surname;
    }

    public Double getPret(Double Pret)
    {
        return Pret;
    }

    @Override
    public String toString()
    {
        return  "Client{" + "Nume ='" + Nume + ", Prenume =" + Prenume + "," +
                " discount = nu beneficiaza de discount" + "}";
    }
}
