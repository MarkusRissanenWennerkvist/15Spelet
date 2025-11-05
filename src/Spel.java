import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

public class Spel extends JFrame {

    private JPanel spelbräde = new JPanel();// spelbrädes panel
    private JPanel knappMeny = new JPanel();// meny panel för meny knapparna
    private JButton[] knappLista = new JButton[16];// knapplistan för de 16 knapparna på brädet
    private AtomicInteger tomtIndex = new AtomicInteger(15);// variabel för de toma indexet
    private JButton vinst = new JButton("Skapa vinst läge?");// vinst läges knappen
    private JButton nyttSpel = new JButton("Nytt spel");// ny spel knappen

    public Spel(){// konstruktorn för hela spelet

        super("15-spelet");// titel
        setLayout(new BorderLayout(8,8));// meny layout + upplägg för spelbrädet
        this.add(spelbräde, BorderLayout.CENTER);// lägger till spelbräde i mitten
        this.add(knappMeny, BorderLayout.NORTH);// lägger till knappmenyn åvanför
        spelbräde.setLayout(new GridLayout(4,4));// skapar rutnätet för de 16 knapparna på brädet
        for (int i = 0; i < 16; i++){// loop som skapar 16 knappar och sättter dem i sin knapp lista
            JButton knapp = new JButton();
            knapp.putClientProperty("index", i);
            knappLista[i] = knapp;
            spelbräde.add(knapp);
        }
        knappMeny.add(nyttSpel);// lägger till knapparna på menyn
        knappMeny.add(vinst);

        Randomizer random = new Randomizer(this);// skapar slumparen
        ActionListener knapplyssnare = new buttonListener(knappLista, tomtIndex);// skapar tre knapp lyssnare med olika funktioner
        ActionListener newGameL = new NewGameListener(random, tomtIndex);
        ActionListener winSetupL = new winSetUpListener(random, tomtIndex);
        for (JButton knapp : knappLista){// lägger till denb första på varje knapp i knapplistan
            knapp.addActionListener(knapplyssnare);
        }
        nyttSpel.addActionListener(newGameL);// lägger till funktionalitet på de två andra
        vinst.addActionListener(winSetupL);

        random.slumpabräde();// slumpar brädet
        setSize(500,400);// sätter strorlken på panelen
        setLocationRelativeTo(null);// sätter den i mitten av skärmen
        setVisible(true);// gör allt synligt
        setDefaultCloseOperation(EXIT_ON_CLOSE);// låter programet avslutat när man tryvker på X knappen i det högra hörnet
    }

    public JButton[] getKnappLista() {// retunerar knapp lista till de andra metoderna som behöver den
        return knappLista;
    }
}
