package Opg3;

public abstract class Ansat extends Person {

    public Ansat(String navn, String adresse) {
        super(navn, adresse);
    }

    public abstract double beregnLøn();
}
