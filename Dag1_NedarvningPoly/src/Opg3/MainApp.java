package Opg3;

public class MainApp {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Æble", 100 );
        Product p2 = new Product(2, "Banan", 50 );
        Product p3 = new Product(3, "Appelsin", 200 );
        Product p4 = new Product(4, "Pære", 150 );
        Product p5 = new Product(5, "Nektarin", 300 );

        Customer c1 = new Customer("Hans Hansen", java.time.LocalDate.of(1980, 5, 15));
        Customer c2 = new Customer("Pia Petersen", java.time.LocalDate.of(1995, 8, 20));

        Order o1 = new Order(1);
        o1.createOrderLine(3, p1);
        o1.createOrderLine(2, p2);

        Order o2 = new Order(2);
        o2.createOrderLine(10, p3);
        o2.createOrderLine(8, p4);

        Order o3 = new Order(3);
        o3.createOrderLine(5, p5);
        o3.createOrderLine(4, p1);

        Order o4 = new Order(4);
        o4.createOrderLine(6, p2);
        o4.createOrderLine(7, p3);

        Order o5 = new Order(5);
        o5.createOrderLine(2, p4);
        o5.createOrderLine(1, p5);

        Order o6 = new Order(6);
        o6.createOrderLine(4, p1);
        o6.createOrderLine(3, p2);



        c1.addOrder(o1);
        c1.addOrder(o2);

        c2.addOrder(o3);
        c2.addOrder(o4);
        c2.addOrder(o5);
        c2.addOrder(o6);



        Discount d1 = new PercentDiscount(15);
        Discount d2 = new FixedDiscount(250, 1000);

        // tilknyt rabatter til knder

        c1.setDiscount(d1);
        c2.setDiscount(d2);

      // test af procent rabat
        System.out.println("Kunde: " + c1.getName());
        System.out.println("Total køb: " + c1.totalBuy());
        System.out.println("Total rabat: " + c1.totalDiscountAmount());
        System.out.println("Total køb efter rabat: " + c1.totalBuyWithDiscount());

        // test af fixed rabat

        System.out.println("\nKunde: " + c2.getName());
        System.out.println("Total køb: " + c2.totalBuy());
        System.out.println("Total rabat: " + c2.totalDiscountAmount());
        System.out.println("Total køb efter rabat: " + c2.totalBuyWithDiscount());








    }
}
