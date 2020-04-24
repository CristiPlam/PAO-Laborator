package proiect.model;

public class Student extends Client
{
    private Integer Student_ID;
    private final static Integer discount = 50;

    public Student(String Nume, String Prenume, Integer Student_ID)
    {
        super(Nume, Prenume);
        this.Student_ID = Student_ID;
    }

    @Override
    public Double getPret(Double Pret)
    {
        return super.getPret(Pret) - ((super.getPret(Pret) * discount) / 100);
    }

    @Override
    public String toString()
    {
        return  "Client{" + "Nume ='" + Nume + ", Prenume =" + Prenume + "," + "Student_ID = " + Integer.toString(Student_ID) +
                        " discount = " + Integer.toString(discount) + "% de student" + "}";
    }
}
