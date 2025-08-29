package Opg5;

public class Fødevare extends Vare {
    private int holdbarhedsdage;

    public Fødevare(double pris, String navn, String beskrivelse, int holdbarhedsdage) {
        super(pris, navn, beskrivelse);
        this.holdbarhedsdage = holdbarhedsdage;
    }

    @Override
    public double beregnSalgspris() {
        return pris * 1.05; // 5% moms
    }

    public int getHoldbarhedsdage() {
        return holdbarhedsdage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fødevare [Holdbarhedsdage = " + holdbarhedsdage + "]";

    }

}
