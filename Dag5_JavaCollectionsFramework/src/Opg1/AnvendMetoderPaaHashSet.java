package Opg1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnvendMetoderPaaHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.addAll(List.of(34,12,23,45,67,34,98));

        System.out.println("Liste af tal i HashSet: " + set);

        set.add(23);

        System.out.println("Indsæt tallet 23: " + set);

        set.remove(67);

        System.out.println("Fjern tallet 67: " + set);

        System.out.println("Indeholder mængden tallet 23? " + set.contains(23));

        System.out.println("Antal elementer i mængden: " + set.size());
    }
}
