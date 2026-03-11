package es3;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private final Articolo[] articoli = new Articolo[10];

    public Carrello(Cliente cliente) {
        this.setCliente(cliente);
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        if (this.getCliente() != null) {
            System.out.println("il cliente non si può cambiare");
        } else {
            this.cliente = cliente;
        }
    }

    public void aggiungiArticolo(Articolo articolo) {
        //     aggiunge articolo
        this.articoli[0] = articolo;
    }

    public Articolo[] getArticoli() {
        return this.articoli;
    }

    public double calcCostoArticoli() {
        return Articolo.getPrezzoArticoli(this.getArticoli());
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(articoli) +
                '}';
    }

    public void stampa() {
        System.out.println(this);
    }
}
