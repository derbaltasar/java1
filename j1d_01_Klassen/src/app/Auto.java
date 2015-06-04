package app;

/**
 * Klassendefinition
 *
 * @author Student
 *
 */
public class Auto {

    /*
     * Instanzvariablen, Eigenschaften , Attribute, Membervariablen
     */
    private String farbe = "";
    private int geschwindigkeit;

    /*
     * ---------------- Methoden Definition-----------------------
     */
    public void fahre() {
        System.out.println("Auto fährt...");
    }

	//--- set/ get
    public void setFarbe(String farbe) {
        this.farbe = farbe;

    }

    public String getFarbe() {
        return this.farbe;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

}
