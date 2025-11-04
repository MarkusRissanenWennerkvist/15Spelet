import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Spel extends JFrame {

    private JPanel spelbräde = new JPanel();
    private JButton[] knappLista = new JButton[16];

    public Spel(){
        this.add(spelbräde);
        spelbräde.setLayout(new GridLayout(4,4));
        for (int i = 0; i < 16; i++){
            JButton knapp = new JButton();
            knappLista[i] = knapp;
            spelbräde.add(knapp);
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
