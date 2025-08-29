package Opg5;

import java.util.ArrayList;

public class Indkøbsvogn {
    private ArrayList<Vare> varer;

    public Indkøbsvogn() {
        this.varer = new ArrayList<>();
    }

    public void tilføjVare(Vare vare) {
        varer.add(vare);
    }

    public double beregnSamletPris() {
        double samletPris = 0;
        for (Vare vare : varer) {
            samletPris += vare.beregnSalgspris();
        }
        return samletPris;
    }

    public ArrayList<Vare> getVarer() {
        return new ArrayList<>(varer); // returnerer en kopi fordi vi ikke vil have at den originale liste kan ændres udefra👺
    }

    public void udskrivKvittering() {

        double samletMoms = 0; // Variabel til at holde styr på samlet moms

        System.out.println("--- Kvittering ---\n");
        for (Vare vare : varer) {
            samletMoms += vare.beregnSalgspris() - vare.getPris(); // beregn moms for hver vare og læg til samlet moms
            System.out.println(vare);
            System.out.println("Salgspris (inkl. moms) : " + vare.beregnSalgspris() + ",- DKK\n");

        }

        System.out.println("------------------\n");
        System.out.println("Samlet moms : " + samletMoms + ",- DKK\n" );


        System.out.println("Pris i alt (inkl. moms) : " + beregnSamletPris() + ",- DKK\n" );
        System.out.println("------------------\n");


    }
}
