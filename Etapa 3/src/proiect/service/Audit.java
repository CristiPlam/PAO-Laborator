package proiect.service;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class Audit
{
    public static Audit ob = new Audit();

    public Audit()
    {

    }

    public static Audit getInstance()
    {
        return ob;
    }

    public String timeStamp()
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.toString();
    }

    public void scrie_in_csv(String scriere, String timestamp_scriere)
    {
        try(FileWriter scriere_csv = new FileWriter("/Facultate/Anul II/Semestrul 2/PROIECT_PAO/src/proiect/audit.csv", true))
        {
            List<String> line = Arrays.asList(scriere, timestamp_scriere);
            scriere_csv.append(String.join(",", line));
            scriere_csv.append("\n");
            scriere_csv.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



}
