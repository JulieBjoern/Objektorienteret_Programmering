package Opg1;

import java.util.ArrayList;

public class App {

    public static double samletLøn(ArrayList<Mekaniker> list) {
        double løn= 0;
        for (Mekaniker mekaniker : list) {
            løn += mekaniker.beregnLøn();

        }
        return løn;
    }

    public static void main(String[] args) {
        ArrayList<Mekaniker> ansatte = new ArrayList<>();
        ansatte.add(new Mekaniker("Hanne", "Vej 1", 2010, 200));
        ansatte.add(new Værkfører("Simona", "Vej 2", 2008, 220, 2015, 500));
        ansatte.add(new Synsmand("Lise", "Vej 3", 2012, 210, 10));

        double total = samletLøn(ansatte);
        System.out.println("Samlet ugeløn: " + total);
    }
}
