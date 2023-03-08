public class Lkw extends Fahrzeug{

    private String ladung;
    private float zuladungsgewicht;

    public Lkw() {
        System.out.println("Konstruktor aus Lkw");
    }

    public Lkw(String ladung, float zuladungsgewicht) {
        this.ladung = ladung;
        this.zuladungsgewicht = zuladungsgewicht;
    }

    public String getLadung() {
        return ladung;
    }

    public void setLadung(String ladung) {
        this.ladung = ladung;
    }

    public float getZuladungsgewicht() {
        return zuladungsgewicht;
    }

    public void setZuladungsgewicht(float zuladungsgewicht) {
        this.zuladungsgewicht = zuladungsgewicht;
    }
}
