import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Spel extends JFrame {

    JPanel spelbräde = new JPanel();
    JButton[] knappLista = new JButton[16];
    public Spel(){
        this.add(spelbräde);
        spelbräde.setLayout(new GridLayout(4,4));
        for (int i = 0; i < 16; i++){
            JButton knapp = new JButton();
            knappLista[i] = knapp;
            for (JButton bricka : knappLista){
                spelbräde.add(knapp);
            }
        }
        setSize(300,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
