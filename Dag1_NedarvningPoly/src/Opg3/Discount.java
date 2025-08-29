package Opg3;


// alle klasser der nedarver fra Discount skal implementere 'getDiscount¨ metoden
// Discount er en abstrakt klasse, så den kan ikke instantieres direkte

public abstract class Discount {

    public abstract double getDiscount(double price);
}

