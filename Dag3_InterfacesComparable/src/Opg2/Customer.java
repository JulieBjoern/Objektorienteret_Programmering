package Opg2;

public class Customer implements Comparable<Customer> {

    private String fornavn;
    private String efternavn;
    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public int getAlder() {
        return alder;
    }

    @Override
    public int compareTo(Customer andet) {

        int efternavnSammenligning = this.efternavn.compareTo(andet.efternavn);
        if (efternavnSammenligning != 0) {
            return efternavnSammenligning;
        }

        int fornavnSammenligning = this.fornavn.compareTo(andet.fornavn);
        if (fornavnSammenligning != 0) {
            return fornavnSammenligning;
        }

        // hvis både efternavn og fornavn er ens, sammenlign alder

        return Integer.compare(this.alder, andet.alder);

    }

    @Override
    public String toString() {
        return fornavn + " " + efternavn + ", " + alder + " år";

    }

}


