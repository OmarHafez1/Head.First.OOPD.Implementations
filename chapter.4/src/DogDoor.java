import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
public class DogDoor {
    private boolean open = false;
    private List<Bark> allowedBarks = new ArrayList<Bark>();
    public void open() {
        System.out.println("The dog door opens.");
        open = true;
        closeAutomaticallyAfter(5000);
    }
    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }
    private void closeAutomaticallyAfter(long time) {
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, time);
    }
    public boolean isOpen() {
        return open;
    }
    public void addAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }
    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }
}
