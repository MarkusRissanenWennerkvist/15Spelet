import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Randomizer {// slumpare
    private final JButton[] knappar;// lista för knappar
    public Randomizer (Spel spel){// konstruktor för att kunna ta in knapplistan från spel
        this.knappar = spel.getKnappLista();
    }

    public void slumpabräde(){// slumpnings metoden
        ArrayList<String> siffror = new ArrayList<>();//Array lista med siffror
        for (int i = 1; i <=15; i++){// for loop som lägger till 1-15 i listan
            siffror.add(String.valueOf(i));
        }
        Collections.shuffle(siffror);// skakar om de befintliga siffrorna

        for (int i = 0; i < 15; i++){// placerar de omskakade siffrorna på knapparna i knapplistan
            knappar[i].setText(siffror.get(i));
        }
        knappar[15].setText("");// sätter den sista knappen som tom
    }

    public void ordnabräde(){// skapar vinst läge för demonstrationen
        for (int i = 0; i <= 14; i++){
            knappar[i].setText(String.valueOf(i + 1));//placerar siffror på rätt plats förutom den sista
        }
        knappar[14].setText("");// 15 blir tom och tom blir 15 (nästan rätt för vinst ala vinst läge)
        knappar[15].setText("15");
    }


}
