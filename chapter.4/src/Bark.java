public class Bark {
    private String sound;
    public Bark(String sound) {
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }

    public boolean equals(Object bark) {
        if(bark instanceof Bark) {
            Bark otherBark = (Bark) bark;
            return sound.equalsIgnoreCase(otherBark.getSound());
        }
        return false;
    }

}
