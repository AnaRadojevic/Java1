package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = false;

    }

    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;

    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setcurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public int getcurrentProgram() {
        return this.currentProgram;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public boolean getturnOn() {
        return this.turnOn;
    }

    public void info() {
        System.out.println("Terenutni program je: " + getcurrentProgram());
        System.out.println("Zvuk je: " + getVolume());
        System.out.println("Ukljuceno: " + getturnOn());

    }

}
