import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class winSetUpListener implements ActionListener {

    private Randomizer randomizer;
    private AtomicInteger emptyIndex;

    public winSetUpListener(Randomizer randomizer, AtomicInteger emptyIndex){
        this.randomizer = randomizer;
        this.emptyIndex = emptyIndex;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        randomizer.ordnabräde();
        emptyIndex.set(14);
    }

}
