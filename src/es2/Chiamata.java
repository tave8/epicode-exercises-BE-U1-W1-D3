package es2;

public class Chiamata {
    private int durataMinuti;
    private NumeroTelefono numeroChiamato;

    public Chiamata(String rawNumeroChiamato, int durataMinuti) {
        this.numeroChiamato = new NumeroTelefono(rawNumeroChiamato);
        this.durataMinuti = durataMinuti;
    }


}
