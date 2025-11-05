import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Randomizer {
    private final JButton[] knappar;
    public Randomizer (Spel spel){
        this.knappar = spel.getKnappLista();
    }

    public void slumpabräde(){
        ArrayList<String> siffror = new ArrayList<>();
        for (int i = 1; i <=15; i++){
            siffror.add(String.valueOf(i));
        }
        Collections.shuffle(siffror);//

        for (int i = 0; i < 15; i++){
            knappar[i].setText(siffror.get(i));
        }
        knappar[15].setText("");
    }

    //lista ut hur jag gör hela brädet men två rutor är fel
    // for loop 1-14 sätt den toma knappen på index 14


}
