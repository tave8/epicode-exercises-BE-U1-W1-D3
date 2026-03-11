package es1;

public class Rettangolo {
    private final double altezza;
    private final double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcPerimetro() {
        return (this.getAltezza() + this.getLarghezza()) * 2;
    }

    public double calcArea() {
        return this.getAltezza() * this.getLarghezza();
    }


    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println(rettangolo);
    }

    public static void stampaRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        Rettangolo[] rettangoli = {rettangolo1, rettangolo2};
        System.out.println(rettangolo1);
        System.out.println(rettangolo2);
        System.out.println("------");
        System.out.println("SOMMA AREE: " + calcAree(rettangoli));
        System.out.println("SOMMA PERIMETRI: " + calcPerimetri(rettangoli));
    }

    public static double calcAree(Rettangolo[] rettangoli) {
        double somma = 0;
        for (Rettangolo rettangolo : rettangoli) {
            somma += rettangolo.calcArea();
        }
        return somma;
    }

    public static double calcPerimetri(Rettangolo[] rettangoli) {
        double somma = 0;
        for (Rettangolo rettangolo : rettangoli) {
            somma += rettangolo.calcPerimetro();
        }
        return somma;
    }

    //     GETTERS & SETTERS
    public double getAltezza() {
        return this.altezza;
    }


    public double getLarghezza() {
        return this.larghezza;
    }

    public Rettangolo makeClone() {
        return new Rettangolo(
                this.getAltezza(),
                this.getLarghezza()
        );
    }

    public void stampa() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "area=" + this.calcArea() +
                ", perimetro=" + this.calcPerimetro() +
                '}';
    }

}
