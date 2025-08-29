package Opg2;

public class App {

    public static Customer lastCustomer(Customer[] customers) {

        if (customers == null || customers.length == 0) {   // tjekker om arrayet er tomt eller null
            return null;
        }

        Customer last = customers[0];
        for (Customer customer : customers) {
            if (customer.compareTo(last) > 0) {
                last = customer;
            }
        }
        return last;


    }

    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {

        if (customers == null || customers.length == 0 || customer == null) { // tjekker om arrayet er tomt eller null
            return new Customer[0];
        }

        int count = 0; // først tæller man hvor mange der er "efter" ift. alfabetisk orden + alder

        for (Customer c : customers) {
            if (c.compareTo(customer) > 0) {
                count++;
            }
        }

        Customer[] result = new Customer[count]; // herefter opretter man et array med den størrelse

        int index = 0;
        for (Customer c : customers) {
            if (c.compareTo(customer) > 0) {
                result[index++] = c;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("Lars", "Hansen", 25),
                new Customer("Anna", "Jensen", 30),
                new Customer("Peter", "Hansen", 20),
                new Customer("Zoe", "Andersen", 22),
                new Customer("Mette", "Jensen", 28)
        };

        Customer last = lastCustomer(customers);
        System.out.println("\nSidste kunde: " + last);

        Customer givneKunde = customers[0]; // Lars Hansen, 25

        Customer[] afterCustomers = afterCustomer(customers, givneKunde);  // array med alle kunder efter "Lars Hansen, 25"
        System.out.println("\nKunder efter " + givneKunde + ":");

        for (Customer c : afterCustomers) { // for:each loop til at printe alle kunderne i det nye array
            System.out.println(c);
        }

    }
}


