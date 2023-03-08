public class Pkw extends Fahrzeug{

    private int anzahlSitze;

    public Pkw() {
        this.anzahlSitze = 4;
        System.out.println("Konstruktor aus Pkw");
    }

    public Pkw(int anzahlSitze, int geschwindigkeit) {
        // Konstruktor der Oberklasse aufrufen
        super(geschwindigkeit);
        this.anzahlSitze = anzahlSitze;
        System.out.println("Konstruktor aus Pkw");
    }

    public int getSitze() {
        return anzahlSitze;
    }

    public void setSitze(int anzahl) {
        anzahlSitze = anzahl;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSitze: "+ anzahlSitze;
    }

}
