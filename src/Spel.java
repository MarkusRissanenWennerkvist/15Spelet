import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Spel extends JFrame {

    private JPanel brickor = new JPanel();
    private JButton knapp1 = new JButton();
    private JButton knapp2 = new JButton();
    private JButton knapp3 = new JButton();
    private JButton knapp4 = new JButton();
    private JButton knapp5 = new JButton();
    private JButton knapp6 = new JButton();
    private JButton knapp7 = new JButton();
    private JButton knapp8 = new JButton();
    private JButton knapp9 = new JButton();
    private JButton knapp10 = new JButton();
    private JButton knapp11 = new JButton();
    private JButton knapp12 = new JButton();
    private JButton knapp13 = new JButton();
    private JButton knapp14 = new JButton();
    private JButton knapp15 = new JButton();
    private JButton knapp16 = new JButton();

    JButton[] brickArray = new JButton[16];

    //skapa panel med 16 platser och 15 knappar (grid layout)

    public Spel(){



        this.add(brickor);

        knapp1.addMouseListener(musLyssnare);
        knapp2.addMouseListener(musLyssnare);
        knapp3.addMouseListener(musLyssnare);
        knapp4.addMouseListener(musLyssnare);
        knapp5.addMouseListener(musLyssnare);
        knapp6.addMouseListener(musLyssnare);
        knapp7.addMouseListener(musLyssnare);
        knapp8.addMouseListener(musLyssnare);
        knapp9.addMouseListener(musLyssnare);
        knapp10.addMouseListener(musLyssnare);
        knapp11.addMouseListener(musLyssnare);
        knapp12.addMouseListener(musLyssnare);
        knapp13.addMouseListener(musLyssnare);
        knapp14.addMouseListener(musLyssnare);
        knapp15.addMouseListener(musLyssnare);
        knapp16.addMouseListener(musLyssnare);

        brickor.setLayout(new GridLayout(4,4));
        brickor.add(knapp1);
        brickor.add(knapp2);
        brickor.add(knapp3);
        brickor.add(knapp4);
        brickor.add(knapp5);
        brickor.add(knapp6);
        brickor.add(knapp7);
        brickor.add(knapp8);
        brickor.add(knapp9);
        brickor.add(knapp10);
        brickor.add(knapp11);
        brickor.add(knapp12);
        brickor.add(knapp13);
        brickor.add(knapp14);
        brickor.add(knapp15);
        brickor.add(knapp16);

        brickArray[0] = knapp1;
        brickArray[1] = knapp2;
        brickArray[2] = knapp3;
        brickArray[3] = knapp4;
        brickArray[4] = knapp5;
        brickArray[5] = knapp6;
        brickArray[6] = knapp7;
        brickArray[7] = knapp8;
        brickArray[8] = knapp9;
        brickArray[9] = knapp10;
        brickArray[10] = knapp11;
        brickArray[11] = knapp12;
        brickArray[12] = knapp13;
        brickArray[13] = knapp14;
        brickArray[14] = knapp15;
        brickArray[15] = knapp16;


        for (int i = 0; i < brickArray.length; i++){
            brickArray[i].setText(":)");
        }


        setLocationRelativeTo(null);
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    MouseListener musLyssnare = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Object komponent  = e.getSource();
            if (komponent instanceof  JButton){
                JButton knapp = (JButton) komponent;
                System.out.println("Du tryckte på en knapp!");
            }
        }
    };

}
