package es2;

import java.util.Arrays;

public class SIM {
    private final NumeroTelefono numeroTelefono;
    private double credito = 0;
    // sinistra: chiamata più recente; destra: chiamata più vecchia.
    private final Chiamata[] listaChiamate = new Chiamata[5];

    public SIM(String rawNumeroTelefono) {
        this.numeroTelefono = new NumeroTelefono(rawNumeroTelefono);
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono.getNumeroTelefono();
    }

    public double getCredito() {
        return this.credito;
    }

    public void increaseCredito(double amountToAdd) {
        if (amountToAdd < 0) {
            System.out.println("quantità da sottrarre non può essere negativa");
        } else {
            this.credito += amountToAdd;
        }
    }

    public void decreaseCredito(double amountToSubstract) {
        double newCredito = this.getCredito() - amountToSubstract;
        if (amountToSubstract < 0) {
            System.out.println("quantità da sottrarre non può essere negativa");
        } else if (newCredito < 0) {
            System.out.println("il credito non può andare in negativo");
        } else {
            this.credito -= amountToSubstract;
        }
    }

    /**
     * Aggiunge una nuova chiamata ed elimina la più vecchia.
     * TODO: to complete
     */
    public void aggiungiChiamata(String rawNuovoNumeroTelefono, int minutiChiamata) {
        // Chiamata nuovaChiamata = new Chiamata(rawNuovoNumeroTelefono, minutiChiamata);
        // // parti da seconda chiamata.
        // // fermati alla penultima.
        // // shifta a destra la lista chiamate
        // for (int i = 1; i < listaChiamate.length - 1; i++) {
        //
        // }
        // // la prima chiamata è quella nuova
        // this.listaChiamate[0] = nuovaChiamata;
    }

    public void stampa() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SIM{" +
                "numeroTelefono=" + numeroTelefono +
                ", credito=" + credito +
                ", listaChiamate=" + Arrays.toString(listaChiamate) +
                '}';
    }
}
