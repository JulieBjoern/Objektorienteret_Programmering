package Opg1.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Bent", 25), new Person("Susan", 34),
                new Person("Mikael", 60), new Person("Klaus", 44),
                new Person("Birgitte", 17), new Person("Liselotte", 9));
        List<Person> persons = new ArrayList<Person>(list);
        System.out.println(persons);
        System.out.println();


//		Den første person der hedder Klaus
//		System.out.println(findFirst(persons, p -> p.getName().equals("Klaus")));
//		Den første person der har et navn med længden 4
//		System.out.println(findFirst(persons, p -> p.getName().length() ==4 ));

//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1

        // a) Finder den første person i listen af personer med alderen 44.

        System.out.println("a) Person med alder 44:");
        System.out.println(findFirst(persons, p -> p.getAge() == 44));

        // b) Finder den første person i listen af personer med et navn der starter med 'S'.

        System.out.println("b) Person med navn der starter med 'S':");
        System.out.println(findFirst(persons, p -> p.getName().startsWith("S")));

        //  c) Finder den første person med navn der indeholder mere end et 'i'

        System.out.println("c) Person med navn der indeholder mere end et 'i':");



        // d) Finder den første person i listen af personer med en alder der er lig længden af navnet.


    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    // metoden: findAll skal returnere en liste med alle personer

    public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
        List<Person> result = new ArrayList<>();
        for (Person p : list) {
            if (filter.test(p)) {
                result.add(p);
            }
        }
        return result;
    }
}
