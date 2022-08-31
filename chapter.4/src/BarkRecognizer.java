import java.util.Iterator;

public class BarkRecognizer {
    DogDoor door;
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }
    public void recognize(Bark bark) {
        System.out.println("Bark recognizer heard a " + bark.getSound());
        var allowedBards = door.getAllowedBarks();
        for(Iterator<Bark> iterater = allowedBards.iterator(); iterater.hasNext();) {
            Bark allowedBark = (Bark)iterater.next();
            if(allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }
        System.out.println("This Dog is not allowed.");
    }
}
