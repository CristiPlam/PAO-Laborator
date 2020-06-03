package proiect.main;

import proiect.model.Client;
import proiect.model.Student;
import proiect.model.Elev;
import proiect.model.Pensionar;
import proiect.model.Copil;
import proiect.model.Bilet;
import proiect.model.Spectacol;
import proiect.service.ServiceBilet;
import proiect.service.ServiceClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class main extends JFrame implements ActionListener
{
    private JMenuBar menubar;
    private JMenu x, x1, x2;
    private JMenuItem i1, i2, i3, i4, i5, ii1, ii2;
    private JLabel label;
    private JPanel panel;
    private JTextField nume, prenume;

    public main(String title)
    {
        super(title);

        label = new JLabel("Meniul a fost pornit!");
        menubar = new JMenuBar();

        x = new JMenu("Meniu derulant");
        x1 = new JMenu("Client nou");
        x2 = new JMenu("Actiuni");

        i1 = new JMenuItem("Normal");
        i2 = new JMenuItem("Student");
        i3 = new JMenuItem("Copil");
        i4 = new JMenuItem("Pensionar");
        i5 = new JMenuItem("Elev");

        ii1 = new JMenuItem("GetClienti");
        ii2 = new JMenuItem("GetBilete");

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);

        ii1.addActionListener(this);
        ii2.addActionListener(this);

        x1.add(i1);
        x1.add(i2);
        x1.add(i3);
        x1.add(i4);
        x1.add(i5);
        x2.add(ii1);
        x2.add(ii2);
        x.add(x1);
        x.add(x2);
        menubar.add(x);

        this.setJMenuBar(menubar);
        this.add(label);
        this.setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args)
    {
        /**
        ServiceClient client_service = ServiceClient.getInstanta();
        client_service.addClient(new Client("Pop", "Liviu"));
        client_service.addClient(new Student("Mot", "Ovidiu", 20466));
        client_service.addClient(new Elev("Blaj", "Sergiu"));
        client_service.addClient(new Elev("Blaj", "Sergiu"));
        client_service.addClient(new Copil("Marica", "Daria", 12));
        client_service.addClient(new Pensionar("Matei", "Valeria"));

        ArrayList<Client> clienti = client_service.getAllClienti();

        for(Client client : clienti) {
            System.out.println(client);
        }
         */

        /**
        String csvFile = "/Facultate/Anul II/Semestrul 2/PROIECT_PAO/src/proiect/clienti.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {

            while ((line = br.readLine()) != null)
            {
                String[] nume = line.split(cvsSplitBy);

                for( int i = 0; i < nume.length; i ++)
                    for( int j = 0; j < nume.length; j ++)
                    System.out.println("Client {nume= " + nume[i] + " , prenume=" + nume[j] + "}");

            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
         */

        ServiceClient service = ServiceClient.getInstanta();
        service.citeste_clienti_din_csv();

        service.addClient(new Pensionar("Gigel", "Marcel"));
        service.getPensionari();
        service.addClient(new Student("George", "Ion", 20466));
        service.getStudenti();
        new main("GUI");


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {

        String str = actionEvent.getActionCommand();
        if(str == "Normal" || str == "Student" || str == "Pensionar" || str == "Elev" || str == "Copil")
        {
            if(str == "Student")
            {
                label.setText("Introdu datele pentru " + str);
                JFrame frame = new JFrame("fereastra noua");
                panel = new JPanel();
                JButton button = new JButton("Adauga Client");

                panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
                panel.setLayout(new GridLayout(0, 1));

                JLabel label1 = new JLabel("Numele Clientului");
                panel.add(label1);
                nume = new JTextField();
                nume.setBounds(5, 5, 280, 50);
                panel.add(nume);
                JLabel label2 = new JLabel("Prenumele Clientului");
                panel.add(label2);
                prenume = new JTextField();
                prenume.setBounds(5, 5, 280, 50);
                panel.add(prenume);
                JLabel label3;
                label3 = new JLabel("ID legitimatie student");
                panel.add(label3);
                JTextField id = new JTextField();
                id.setBounds(5, 5, 280, 50);
                panel.add(id);
                panel.add(button);
                panel.add(label);

                frame.add(panel, BorderLayout.CENTER);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setTitle("Client");
                frame.pack();
                frame.setVisible(true);
            }
            else if(str == "Copil")
            {
                label.setText("Introdu datele pentru " + str);
                JFrame frame = new JFrame("fereastra noua");
                panel = new JPanel();
                JButton button = new JButton("Adauga Client");

                panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
                panel.setLayout(new GridLayout(0, 1));

                JLabel label1 = new JLabel("Numele Clientului");
                panel.add(label1);
                nume = new JTextField();
                nume.setBounds(5, 5, 280, 50);
                panel.add(nume);
                JLabel label2 = new JLabel("Prenumele Clientului");
                panel.add(label2);
                prenume = new JTextField();
                prenume.setBounds(5, 5, 280, 50);
                panel.add(prenume);
                JLabel label3;
                label3 = new JLabel("Varsta copilului");
                panel.add(label3);
                JTextField id = new JTextField();
                id.setBounds(5, 5, 280, 50);
                panel.add(id);
                panel.add(button);
                panel.add(label);

                frame.add(panel, BorderLayout.CENTER);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setTitle("Client");
                frame.pack();
                frame.setVisible(true);
            }
            else
            {
                label.setText("Introdu datele pentru " + str);
                JFrame frame = new JFrame("fereastra noua");
                panel = new JPanel();
                JButton button = new JButton("Adauga Client");

                panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
                panel.setLayout(new GridLayout(0, 1));

                JLabel label1 = new JLabel("Numele Clientului");
                panel.add(label1);
                nume = new JTextField();
                nume.setBounds(5, 5, 280, 50);
                panel.add(nume);
                JLabel label2 = new JLabel("Prenumele Clientului");
                panel.add(label2);
                prenume = new JTextField();
                prenume.setBounds(5, 5, 280, 50);
                panel.add(prenume);
                panel.add(button);
                panel.add(label);

                frame.add(panel, BorderLayout.CENTER);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setTitle("Client");
                frame.pack();
                frame.setVisible(true);
            }
        }
        else
            label.setText(str + " este actiunea selectata");
    }
}
