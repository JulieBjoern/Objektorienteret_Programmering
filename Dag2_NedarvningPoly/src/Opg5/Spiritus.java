package Opg5;

public class Spiritus extends Vare {
    private double alkoholprocent;

    public Spiritus(double pris, String navn, String beskrivelse, double alkoholprocent) {
        super(pris, navn, beskrivelse);
        this.alkoholprocent = alkoholprocent;
    }

    @Override
    public double beregnSalgspris() {
        double momsProcent = pris > 90 ? 1.20 : 0.80;

//        if (pris > 90) {
//            momsProcent = 1.20; // 120% moms
//        } else {
//            momsProcent = 0.80; // 80% moms
//        }

        return pris * (1 + momsProcent);
    }

    public double getAlkoholprocent() {
        return alkoholprocent;
    }

    @Override
    public String toString() {
        return super.toString() + " Spiritus [Alkoholprocent = " + alkoholprocent + "]";
    }
}