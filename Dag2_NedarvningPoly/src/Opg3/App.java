package Opg3;


import java.util.ArrayList;

public class App {

    public static double samletLøn(ArrayList<Ansat> ansatte) {
        double løn= 0;
        for (Ansat ansat : ansatte) {
            løn += ansat.beregnLøn();

        }
        return løn;
    }

    public static void main(String[] args) {

        ArrayList<Ansat> ansatte = new ArrayList<>();
        ansatte.add(new Mekaniker("Hanne", "Vej 1", 2010, 200));
        ansatte.add(new Værkfører("Simona", "Vej 2", 208, 2020, 50));
        ansatte.add(new Synsmand("Lise", "Vej 3", 2012, 210));
        ansatte.add(new Arbejdsdreng("Emma", "Vej 4", 150));


        double total = samletLøn(ansatte);
        System.out.println("Samlet ugeløn: " + total);
    }
}
