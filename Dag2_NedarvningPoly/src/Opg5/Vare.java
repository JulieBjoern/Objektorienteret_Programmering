package Opg5;

public abstract class Vare {

    protected double pris; // excl. moms
    protected String navn;
    protected String beskrivelse;

    public Vare(double pris, String navn, String beskrivelse) {
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public abstract double beregnSalgspris();

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    @Override
    public String toString() {
        return "Vare [Pris = " + pris + ", Navn = " + navn + ", Beskrivelse = " + beskrivelse + "]";
    }

}
