import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class NewGameListener implements ActionListener {

    private Randomizer randomizer;
    private AtomicInteger emptyIndex;

    public NewGameListener (Randomizer randomizer, AtomicInteger emptyIndex) {
        this.randomizer = randomizer;
        this.emptyIndex = emptyIndex;
    }

        @Override
        public void actionPerformed(ActionEvent e){
            randomizer.slumpabräde();
            emptyIndex.set(15);
        }
    }


