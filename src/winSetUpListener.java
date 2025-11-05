import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class winSetUpListener implements ActionListener {

    private Randomizer randomizer;// slumpare
    private AtomicInteger emptyIndex;// tomt index

    public winSetUpListener(Randomizer randomizer, AtomicInteger emptyIndex){// konstruktor för lyssnarens inparameterar
        this.randomizer = randomizer;
        this.emptyIndex = emptyIndex;
    }
    @Override
    public void actionPerformed(ActionEvent e){// ordnande av vinst läge och placerande utav det toma indexet på plats 14
        randomizer.ordnabräde();
        emptyIndex.set(14);
    }

}
