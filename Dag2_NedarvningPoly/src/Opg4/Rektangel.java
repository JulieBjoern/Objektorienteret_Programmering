package Opg4;

public class Rektangel extends Figur {

    private double højde;
    private double bredde;

    public Rektangel(double x, double y, double højde, double bredde) {
        super(x, y);
        this.højde = højde;
        this.bredde = bredde;
    }


    public double beregnAreal() {

        return højde * bredde;
    }

    @Override
    public String toString() {
        return "Rektangel: " + super.toString() + ", Højde = " + højde + ", Bredde = " + bredde;
    }

}
