package app;

public class Person {
    private int finger=10;
    private int gebrochenefinger;    
    private String name;


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public int getFinger() {
        return finger;
    }

    /**
     * @return the gebrochenefinger
     */
    public int getGebrochenefinger() {
        return gebrochenefinger;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void breche_finger(int zu_brechende_finger){
        this.finger = getFinger()-zu_brechende_finger;
        this.gebrochenefinger = zu_brechende_finger;
    }    

}