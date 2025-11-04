import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.atomic.AtomicInteger;

public class buttonListener implements ActionListener {
    private JButton[] knappLista;
    private AtomicInteger tomtIndex;
    private static boolean isAdjacant(int a, int b){
        int radA = a / 4, columnA = a % 4;
        int radB = b / 4, columnB = b % 4;

        return Math.abs(radA - radB) + Math.abs(columnA - columnB) == 1;
    }

    public buttonListener(JButton[] knappLista, AtomicInteger tomtIndex){
        this.knappLista = knappLista;
        this.tomtIndex = tomtIndex;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton klickad = (JButton) e.getSource();
        int tryckIndex = (int) klickad.getClientProperty("index");
        int tomaIndex = tomtIndex.get();

        if (klickad.getText().isEmpty()) return;
        if (!isAdjacant(tryckIndex,tomaIndex)) return;

        String temp = knappLista[tryckIndex].getText();
        knappLista[tryckIndex].setText("");
        knappLista[tomaIndex].setText(temp);
        tomtIndex.set(tryckIndex);
    }
}
