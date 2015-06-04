package app;

public class Main {

    public static void main(String[] args) {

        Auto a = new Auto();// Referenz auf Auto-Objekt (Exemplar)
        a.fahre();
        a.setFarbe("rot");

        String farbe = a.getFarbe();
        System.out.println(farbe);
        Auto a2 = new Auto();
        System.out.println(a2.getFarbe());
        System.out.println(a.getGeschwindigkeit());
    }

}
