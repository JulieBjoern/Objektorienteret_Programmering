package Opg4;

public class Kvadrat extends Figur {

    private double sidelængde;

    public Kvadrat(double x, double y, double sidelængde) {
        super(x, y);
        this.sidelængde = sidelængde;
    }


    public double beregnAreal() {

        return sidelængde * sidelængde;
    }

    @Override
    public String toString() {
        return "Kvadrat: " + super.toString() + ", Sidelængde = " + sidelængde;
    }

}
