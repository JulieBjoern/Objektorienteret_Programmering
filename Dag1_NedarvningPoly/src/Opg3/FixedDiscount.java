package Opg3;

public class FixedDiscount extends Discount {

    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {

        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }


    @Override
    public double getDiscount(double price) {
        return price > discountLimit ? fixedDiscount : 0;
    }
    // conditional operator i stedet for if-else
    // kolon betyder 'else' i conditional operator
}




