public class Fahrzeug {

    // mit Schlüsselwort  protected ist die Variable auch für alle erbenden Klassen sichtbar
    int geschwindigkeit;

    public Fahrzeug() {
        this.geschwindigkeit = 5;
        System.out.println("Konstruktor aus Fahrzeug");
    }

    public  Fahrzeug(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
        System.out.println("Konstruktor aus Fahrzeug");
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "geschwindigkeit=" + geschwindigkeit +
                '}';
    }

}
