package es3;

public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private long quantitaInMagazzino;


    public Articolo(double prezzo, String codice, long quantitaInMagazzino, String descrizione) {
        this.setPrezzo(prezzo);
        this.setCodice(codice);
        this.setQuantitaInMagazzino(quantitaInMagazzino);
        this.setDescrizione(descrizione);
    }

    public Articolo(double prezzo, String codice, long quantitaInMagazzino) {
        this(prezzo, codice, quantitaInMagazzino, "");
    }

    public Articolo(double prezzo, String codice) {
        this(prezzo, codice, 0, "");
    }

    public Articolo(double prezzo) {
        this(prezzo, null, 0, "");
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setQuantitaInMagazzino(long quantitaInMagazzino) {
        if (quantitaInMagazzino < 0) {
            System.out.println("quantità in magazzino non può essere negativa");
        } else {
            this.quantitaInMagazzino = quantitaInMagazzino;
        }
    }


    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo < 0) {
            System.out.println("prezzo non può essere negativo");
        } else {
            this.prezzo = prezzo;
        }
    }

    public String getCodice() {
        return this.codice;
    }

    public void setCodice(String codice) {
        if (this.getCodice() != null) {
            System.out.println("non puoi aggiornare il codice articolo");
        } else {
            this.codice = codice;
        }
    }

    public static double getPrezzoArticoli(Articolo[] articoli) {
        double sum = 0;
        for (Articolo articolo : articoli) {
            sum += articolo.getPrezzo();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codice='" + codice + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", quantitaInMagazzino=" + quantitaInMagazzino +
                '}';
    }
}
