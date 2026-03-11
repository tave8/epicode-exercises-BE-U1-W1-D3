package es3;

public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String nome, String cognome, String email, String dataIscrizione, String codice) {
        this.setNome(nome);
        this.setCognome(cognome);
        this.setEmail(email);
        this.setDataIscrizione(dataIscrizione);
        this.setCodice(codice);
    }

    public Cliente(String nome, String cognome, String email, String dataIscrizione) {
        this(nome, cognome, email, dataIscrizione, null);
    }

    public Cliente(String nome, String cognome, String email) {
        this(nome, cognome, email, null, null);
    }

    public Cliente(String nome, String cognome) {
        this(nome, cognome, null, null, null);
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            System.out.println("nome non può essere vuoto");
        } else {
            this.nome = nome;
        }
    }

    public void setCognome(String cognome) {
        if (cognome.isEmpty()) {
            System.out.println("cognome non può essere vuoto");
        } else {
            this.cognome = cognome;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
}
