package Opg1;

public class Mekaniker extends Person {

    private int svendeprøveÅr;
    private double timeløn;

    public Mekaniker(String navn, String adresse, int svendeprøveÅr, double timeløn) {
        super(navn, adresse);
        this.svendeprøveÅr = svendeprøveÅr;
        this.timeløn = timeløn;
    }

    // Overload

    public Mekaniker(String navn, String adresse) {
        super(navn, adresse);
        this.svendeprøveÅr = 2020;
        this.timeløn = 200;
    }


    // Ovenstående er en smule redundant, da vi kan lave en Mekaniker uden at angive svendeprøveår og timeløn.
    // Kan laves sådan i stedet:

//    public Mekaniker(String navn, String adresse) {
//        this(navn, adresse, 2020, 200);
//    }


    public int getSvendeprøveÅr() {
        return svendeprøveÅr;
    }

    public double getTimeløn() {
        return timeløn;
    }

    public void setSvendeprøveÅr(int svendeprøveÅr) {
        this.svendeprøveÅr = svendeprøveÅr;
    }

    public void setTimeløn(double timeløn) {
        this.timeløn = timeløn;
    }

    public double beregnLøn() {
        return timeløn * 37;
    }
}

