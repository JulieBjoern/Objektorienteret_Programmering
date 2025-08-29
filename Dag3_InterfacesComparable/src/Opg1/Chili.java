package Opg1;

public class Chili implements Measurable {

    private String navn;
    private double styrke; // scoville 1-2 millioner

    public Chili(String navn, double styrke) {
        this.navn = navn;

        if (styrke < 1 || styrke > 2000000) {
            throw new IllegalArgumentException("Styrke skal være mellem 1 og 2 millioner Scoville");
        }

        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public double getStyrke() {
        return styrke;
    }


    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setStyrke(double styrke) {
        if (styrke < 1 || styrke > 2000000) {
            throw new IllegalArgumentException("Styrke skal være mellem 1 og 2 millioner Scoville");
        }
        this.styrke = styrke;
    }


    @Override
    public double getMeasure() {
        return styrke;
    }

    @Override
    public String toString() {
        return navn + " (" + styrke + " Scoville)";
    }

}
