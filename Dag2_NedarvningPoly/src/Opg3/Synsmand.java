package Opg3;


public class Synsmand extends Mekaniker {


    public Synsmand(String navn, String adresse, int svendeprøveÅr, double timeløn) {

        super(navn, adresse, svendeprøveÅr, timeløn);

    }

    @Override
    public double beregnLøn() {
        return super.beregnLøn(); // Synsmanden får ikke ekstra løn for syn, her bruges samme løn som mekanikeren
    }
}

// Er denne klasse overhovedet nødvendig? Synsmanden har ikke nogen ekstra attributter eller metoder i forhold til Mekaniker.👺