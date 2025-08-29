package Opg5;

public class ElArtikel extends Vare {
    private double energiforbrugPrTime;

    public ElArtikel(double pris, String navn, String beskrivelse, double energiforbrugPrTime) {
        super(pris, navn, beskrivelse);
        this.energiforbrugPrTime = energiforbrugPrTime;
    }

    @Override
    public double beregnSalgspris() {
        double moms = pris * 0.30; // 30% moms
        if (moms < 3.0) {
            moms = 3.0; // Minimum 3 kr. i moms
        }
        return pris + moms;
    }

    public double getEnergiforbrugPrTime() {
        return energiforbrugPrTime;
    }

    @Override
    public String toString() {
        return super.toString() + " El artikel [Energiforbrug pr. time = " + energiforbrugPrTime + "]";
    }

}
