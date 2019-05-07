
package media;


public class Radio {
    private double fmFreqvency;
    private int amFreqvency;
    private char band;
    
    public Radio(){
    this.fmFreqvency = 90.8;
        this.amFreqvency = 600;
        this.band = 'F';
    
    
    }

    public Radio(double fmFreqvency, int amFreqvency, char band) {
        this.fmFreqvency = fmFreqvency;
        this.amFreqvency = amFreqvency;
        this.band = band;
    }
    
    
    

    public double getFmFreqvency() {
        return fmFreqvency;
    }

    public void setFmFreqvency(double fmFreqvency) {
        this.fmFreqvency = fmFreqvency;
    }

    public int getAmFreqvency() {
        return amFreqvency;
    }

    public void setAmFreqvency(int amFreqvency) {
        this.amFreqvency = amFreqvency;
    }

    public char getBand() {
        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }
     public void info() {
        System.out.println("FM: " + getFmFreqvency());
        System.out.println("AM: " + getAmFreqvency());
        System.out.println("Band: " + getBand());

    }
    
    
    
}
