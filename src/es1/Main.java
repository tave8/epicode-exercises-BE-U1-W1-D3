package es1;

public class Main {
    static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(10, 10);
        Rettangolo rettangolo2 = new Rettangolo(10, 20);
        Rettangolo rettangolo3 = rettangolo1.makeClone();

        // Rettangolo.stampaRettangoli(rettangolo1, rettangolo2);
        rettangolo3.stampa();

    }
}
