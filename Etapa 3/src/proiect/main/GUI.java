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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;


/**public class GUI extends JFrame implements ActionListener
{
    /**
    private JMenuBar mb;
    private JMenu x, x1, x2;
    private JMenuItem i1, i2, i3, ii1, ii2, iii1;
    private JLabel label;

    public GUI(String title) {
        super(title);

        label = new JLabel("Nothing selected yet");
        mb = new JMenuBar();

        x = new JMenu("Alege actiune");
        x1 = new JMenu("Client nou");

        i2 = new JMenuItem("Normal");
        i3 = new JMenuItem("Student");
        ii1 = new JMenuItem("Copil");
        ii2 = new JMenuItem("Pensionar");
        iii1 = new JMenuItem("Elev");

        i2.addActionListener(this);
        i3.addActionListener(this);
        ii2.addActionListener(this);
        ii1.addActionListener(this);
        iii1.addActionListener(this);

        x1.add(i2);
        x1.add(i3);
        x1.add(ii1);
        x1.add(ii2);
        x1.add(iii1);
        x.add(x1);
        //x1.add(x2);
        mb.add(x);

        this.setJMenuBar(mb);
        this.add(label);
        this.setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
*/
