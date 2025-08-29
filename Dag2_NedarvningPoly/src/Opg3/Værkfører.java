package Opg3;

public class Værkfører extends Ansat {
    private int udnævnelsesÅr;
    private double timeløn;
    private double tillægPrUge;

    public Værkfører(String navn, String adresse, double timeløn, int udnævnelsesÅr, double tillægPrUge) {
        super(navn, adresse);
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.tillægPrUge = tillægPrUge;
        this.timeløn = timeløn;
    }


    public double beregnLøn() {
        return timeløn * 37 + tillægPrUge;
    }
}
