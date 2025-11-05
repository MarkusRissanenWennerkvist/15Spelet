import javax.swing.*;
import java.util.ArrayList;

public class CheckWinner {


    public static boolean kollaVinsten(JButton[] knapplista){
        for (int i = 0; i < 15; i++){//for loop från 0 till 15
            String expectedNumber = String.valueOf(i+1);//väntat nummer (i ordningen 1-15)
            String actualNumber = knapplista[i].getText();//faktiska nummret (i ordningen 1-15)

            if (!actualNumber.equals(expectedNumber)){// ifall någon siffra i ordningen inte är korrekt så retuneras falskt
                return false;
            }

        }
        return knapplista[15].getText().isEmpty();// annars så sätts den toma indexen sist
    }

    public static void vinstMeddelande(){// och ett vinst meddelande visas då man vunnit
        JOptionPane.showMessageDialog(null,"Grattis du vann!");
    }

}
