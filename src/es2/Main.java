package es2;

public class Main {
    static void main(String[] args) {
        SIM sim1 = new SIM("3519621756");
        sim1.aggiungiChiamata("33389232452", 100);
        sim1.increaseCredito(123);
        sim1.decreaseCredito(122);
        sim1.stampa();
    }
}
