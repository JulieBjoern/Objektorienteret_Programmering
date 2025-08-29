package Opg4;

public class Cirkel extends Figur {

    private double radius;

    public Cirkel(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }


    public double beregnAreal() {

        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cirkel: " + super.toString() + ", Radius = " + radius;
    }
}

