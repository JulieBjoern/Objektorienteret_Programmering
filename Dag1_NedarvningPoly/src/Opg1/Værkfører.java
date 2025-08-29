package Opg1;

public class Værkfører extends Mekaniker {
    private int udnævnelsesÅr;
    private double tillægPrUge;

    public Værkfører(String navn, String adresse, int svendeprøveÅr, double timeløn, int udnævnelsesÅr, double tillægPrUge) {
        super(navn, adresse, svendeprøveÅr, timeløn);
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.tillægPrUge = tillægPrUge;
    }

    public int getUdnævnelsesÅr() {
        return udnævnelsesÅr;
    }

    public double getTillægPrUge() {
        return tillægPrUge;
    }

    public void setUdnævnelsesÅr(int udnævnelsesÅr) {
        this.udnævnelsesÅr = udnævnelsesÅr;
    }

    public void setTillægPrUge(double tillægPrUge) {
        this.tillægPrUge = tillægPrUge;
    }

    @Override
    public double beregnLøn() {
        return super.beregnLøn() + tillægPrUge;
    }
}
