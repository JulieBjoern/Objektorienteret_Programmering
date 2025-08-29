package Opg1;

import java.util.Arrays;

public class App {

    public static Measurable max(Measurable[] objects) {

        if (objects == null || objects.length == 0) {  // tjekker om arrayet er tomt eller null
            return null;
        }

        Measurable max = objects[0];

        for (Measurable obj : objects) {
            if (obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }

        return max;

    }

    public static double average(Measurable[] objects) {

        if (objects == null || objects.length == 0) {  // tjekker om arrayet er tomt eller null
            return 0;
        }

        double sum = 0;

        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }

        return sum / objects.length; // lenght er antallet af objekter i arrayet

    }

    public static void main(String[] args) {

        Chili[] chilies = {
                new Chili("Jalapeño", 3500),
                new Chili("Habanero", 100000),
                new Chili("Carolina Reaper", 2000000),
                new Chili("Ghost Pepper", 1041427),
                new Chili("Scotch Bonnet", 100000),
                new Chili("Peberfrugt", 1)
        };

        System.out.println("🌶️Chili liste🌶️: ");
        System.out.println(Arrays.toString(chilies));

        double avg = average(chilies);
        System.out.println("\nGennemsnitlig styrke: " + avg + " Scoville");

        Measurable stærkeste = max(chilies);
        System.out.println("\nStærkeste chili: " + stærkeste);
    }
}
