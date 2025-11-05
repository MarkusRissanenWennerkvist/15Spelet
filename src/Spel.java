import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

public class Spel extends JFrame {

    private JPanel spelbräde = new JPanel();
    private JPanel knappMeny = new JPanel();
    private JButton[] knappLista = new JButton[16];
    private AtomicInteger tomtIndex = new AtomicInteger(15);
    private JButton vinst = new JButton("Skapa vinst läge?");
    private JButton nyttSpel = new JButton("Nytt spel");

    public Spel(){

        super("15-spelet");
        setLayout(new BorderLayout(8,8));
        this.add(spelbräde, BorderLayout.CENTER);
        this.add(knappMeny, BorderLayout.NORTH);
        spelbräde.setLayout(new GridLayout(4,4));
        for (int i = 0; i < 16; i++){
            JButton knapp = new JButton();
            knapp.putClientProperty("index", i);
            knappLista[i] = knapp;
            spelbräde.add(knapp);
        }
        knappMeny.add(nyttSpel);
        knappMeny.add(vinst);

        Randomizer random = new Randomizer(this);
        ActionListener knapplyssnare = new buttonListener(knappLista, tomtIndex);
        ActionListener newGameL = new NewGameListener(random, tomtIndex);
        ActionListener winSetupL = new winSetUpListener(random, tomtIndex);
        for (JButton knapp : knappLista){
            knapp.addActionListener(knapplyssnare);
        }
        nyttSpel.addActionListener(newGameL);
        vinst.addActionListener(winSetupL);

        random.slumpabräde();
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JButton[] getKnappLista() {
        return knappLista;
    }
}
