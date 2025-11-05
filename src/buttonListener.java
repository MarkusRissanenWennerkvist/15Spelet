import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.atomic.AtomicInteger;

public class buttonListener implements ActionListener {
    private JButton[] knappLista;// sparar in parameter Jbutton listan
    private AtomicInteger tomtIndex;// sparar de toma indexet i samma lista
    private static boolean isAdjacant(int a, int b){// kollar ifall knappen som trycks är bredvid en tom knapp
        int radA = a / 4, columnA = a % 4;// rad a / 4 räknar raden av a medans column A % 4 räknar platsen på raden
        int radB = b / 4, columnB = b % 4;// rad b / 4 räknar raden av a medans column B % 4 räknar platsen på raden

        return Math.abs(radA - radB) + Math.abs(columnA - columnB) == 1;// retunerar ifall knappen som tryckts på är bredvid en tom knapp
    }

    public buttonListener(JButton[] knappLista, AtomicInteger tomtIndex){// konstruktor för knapplyssnaren inklusive inparamterarna som proceseras i denna metod
        this.knappLista = knappLista;
        this.tomtIndex = tomtIndex;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton klickad = (JButton) e.getSource();//hämtar klickad info dvs index
        int tryckIndex = (int) klickad.getClientProperty("index");//sparar klickad index
        int tomaIndex = tomtIndex.get(); // sparar tomt index

        if (klickad.getText().isEmpty()) return; //om man trycker på den toma knappen så sker ingenting
        if (!isAdjacant(tryckIndex,tomaIndex)) return;//om knappen man trycker på inte är bredvid en tom knapp så sker heller ingenting

        String temp = knappLista[tryckIndex].getText();//lagrar tillfälligt texten på den tryckta knappen
        knappLista[tryckIndex].setText("");//byter texten på den tryckta knappen till "" dvs tomt
        knappLista[tomaIndex].setText(temp);//sätter den toma knappens text till temp dvs bytet sker här
        tomtIndex.set(tryckIndex);//den toma knappens index blir den tryckta knappens då bytet nu skett

        if (CheckWinner.kollaVinsten(knappLista)){//ifall siffrorna / knapparna är i nummer ordning så
            CheckWinner.vinstMeddelande();//visas ett vinst meddelande på skärmen
        }
    }
}
