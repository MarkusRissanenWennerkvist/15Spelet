import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class NewGameListener implements ActionListener {

    private Randomizer randomizer;// slumpare
    private AtomicInteger emptyIndex;// tomt index

    public NewGameListener (Randomizer randomizer, AtomicInteger emptyIndex) {// konstruktor för inparameterarna i lyssnaren
        this.randomizer = randomizer;
        this.emptyIndex = emptyIndex;
    }

        @Override
        public void actionPerformed(ActionEvent e){// funktionen i knappen dvs slumpningen och placeringen av det toma indexet
            randomizer.slumpabräde();
            emptyIndex.set(15);
        }
    }


