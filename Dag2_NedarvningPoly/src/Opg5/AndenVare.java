package Opg5;

public class AndenVare extends Vare {

    public AndenVare(double pris, String navn, String beskrivelse) {
        super(pris, navn, beskrivelse);
    }

    @Override
    public double beregnSalgspris() {
        return pris * 1.25; // 25% moms
    }

    @Override
    public String toString() {
        return super.toString() + " (Standard vare)";
    }

}
