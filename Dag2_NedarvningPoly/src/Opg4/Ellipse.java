package Opg4;

public class Ellipse extends Figur {

    private double radius1;
    private double radius2;

    public Ellipse(double x, double y, double radius1, double radius2) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }


    public double beregnAreal() {
        return Math.PI * radius1 * radius2;
    }

    @Override
    public String toString() {
        return "Ellipse: " + super.toString() + " Radius1 = " + radius1 + " Radius2 = " + radius2;
    }
}
