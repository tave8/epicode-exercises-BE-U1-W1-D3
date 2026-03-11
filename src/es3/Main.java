package es3;

public class Main {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Giuseppe", "Tavella");
        Carrello carrello1 = new Carrello(cliente1);
        Articolo articolo1 = new Articolo(34.56);
        carrello1.aggiungiArticolo(articolo1);

        carrello1.stampa();
    }
}
