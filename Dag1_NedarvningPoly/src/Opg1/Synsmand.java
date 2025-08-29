package Opg1;

public class Synsmand extends Mekaniker {
    private int antalSynPrUge;

    public Synsmand(String navn, String adresse, int svendeprøveÅr, double timeløn, int antalSynPrUge) {
        super(navn, adresse, svendeprøveÅr, timeløn);
        this.antalSynPrUge = antalSynPrUge;
    }

    @Override
    public double beregnLøn() {
        return super.beregnLøn() + (antalSynPrUge * 29);
    }
}
