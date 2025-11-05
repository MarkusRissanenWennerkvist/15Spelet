import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

public class Spel extends JFrame {

    private JPanel spelbräde = new JPanel();
    private JButton[] knappLista = new JButton[16];
    private AtomicInteger tomtIndex = new AtomicInteger(15);

    public Spel(){
        this.add(spelbräde);
        spelbräde.setLayout(new GridLayout(4,4));
        for (int i = 0; i < 16; i++){
            JButton knapp = new JButton();
            knapp.putClientProperty("index", i);
            knappLista[i] = knapp;
            spelbräde.add(knapp);
        }
        ActionListener knapplyssnare = new buttonListener(knappLista, tomtIndex);
        for (JButton knapp : knappLista){
            knapp.addActionListener(knapplyssnare);
        }
        Randomizer random = new Randomizer(this);
        random.slumpabräde();
        setSize(300,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JButton[] getKnappLista() {
        return knappLista;
    }
}
