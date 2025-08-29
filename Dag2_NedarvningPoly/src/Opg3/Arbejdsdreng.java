package Opg3;


public class Arbejdsdreng extends Ansat {

    private double timeløn;

    public Arbejdsdreng(String navn, String adresse, double timeløn) {
        super(navn, adresse);
        this.timeløn = timeløn;
    }

    @Override
    public double beregnLøn() {
        return timeløn * 25; // 'arbejdsdrenge´ arbejder 25 timer om ugen
    }
}
