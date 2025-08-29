package Opg5;

public class App {

    public static void main(String[] args) {

        Indkøbsvogn vogn = new Indkøbsvogn();

        Vare vare1 = new Fødevare(30, "Gullón Hookies Sandwich Biscuits", "Glutenfrie Kiks Med Creme", 62);
        Vare vare2 = new ElArtikel(3300, "Playstation 5", "Spillekonsol", 200);
        Vare vare3 = new Spiritus(329, "Graham's 20 Year Old Tawny", "Portvin", 20);
        Vare vare4 = new AndenVare(970, "Zadig & Voltaire This is Her!", "Eu de Parfum, 100 ml");

        vogn.tilføjVare(vare1);
        vogn.tilføjVare(vare2);
        vogn.tilføjVare(vare3);
        vogn.tilføjVare(vare4);

        vogn.udskrivKvittering();

    }

}
