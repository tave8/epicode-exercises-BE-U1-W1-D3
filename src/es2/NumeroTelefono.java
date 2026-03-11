package es2;

public class NumeroTelefono {
    private String numeroTelefono;

    public NumeroTelefono(String numeroTelefono) {
        setNumeroTelefono(numeroTelefono);
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    private void setNumeroTelefono(String numeroTelefono) {
        // numero di telefono is too long or short
        boolean isTooLong = numeroTelefono.length() > 13;
        boolean isTooShort = numeroTelefono.length() < 9;

        if (isTooLong || isTooShort) {
            System.out.println("Numero di telefono '" + numeroTelefono + "' è troppo corto o lungo.");
        }
        // numero di telefono was already set
        else if (this.getNumeroTelefono() != null) {
            System.out.println("Numero di telefono è stato già impostato");
        } else {
            this.numeroTelefono = numeroTelefono;
        }
    }

    @Override
    public String toString() {
        return "NumeroTelefono{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
