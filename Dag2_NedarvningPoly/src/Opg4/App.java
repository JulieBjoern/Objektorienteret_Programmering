package Opg4;

public class App {

    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat(0, 0, 5);
        Rektangel rektangel = new Rektangel(1, 1, 4, 6);
        Cirkel cirkel = new Cirkel(2, 2, 3);
        Ellipse ellipse = new Ellipse(3, 3, 2, 4);

        // udskriv original position

        System.out.println("Original position:");
        System.out.println(kvadrat);
        System.out.println(rektangel);
        System.out.println(cirkel);
        System.out.println(ellipse);

        // flyt figurerne

        System.out.println("\nEfter parallelforskydning: ");
        kvadrat.parallelforskyd(5, -2);
        rektangel.parallelforskyd(-3, 4);
        cirkel.parallelforskyd(2, 2);
        ellipse.parallelforskyd(-1, -1);

        // udskriv ny position

        System.out.println(kvadrat);
        System.out.println(rektangel);
        System.out.println(cirkel);
        System.out.println(ellipse);

        // udskriv arealer

        System.out.println("\nArealer:");
        System.out.printf("\nKvadrat areal: " + kvadrat.beregnAreal());
        System.out.printf("\nRektangel areal: " + rektangel.beregnAreal());
        System.out.printf("\nCirkel areal: " + cirkel.beregnAreal());
        System.out.printf("\nEllipse areal: " + ellipse.beregnAreal());




    }
}
