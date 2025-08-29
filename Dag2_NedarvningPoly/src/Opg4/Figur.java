package Opg4;

public abstract class  Figur {

    private double x;
    private double y;

    public Figur(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double beregnAreal();

    public void parallelforskyd (double deltaX, double deltaY) {

        this.x += deltaX; // += betydr at vi lægger deltaX til den nuværende værdi af x, altså x = x + deltaX
        this.y += deltaY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "X = " + x + ", Y = " + y + ", Areal = " + beregnAreal();
    }
}
