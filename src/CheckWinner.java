import javax.swing.*;
import java.util.ArrayList;

public class CheckWinner {


    public static boolean kollaVinsten(JButton[] knapplista){
        for (int i = 0; i < 15; i++){
            String expectedNumber = String.valueOf(i+1);
            String actualNumber = knapplista[i].getText();

            if (!actualNumber.equals(expectedNumber)){
                return false;
            }

        }
        return knapplista[15].getText().isEmpty();
    }

    public static void vinstMeddelande(){
        JOptionPane.showMessageDialog(null,"Grattis du vann!");
    }

}
