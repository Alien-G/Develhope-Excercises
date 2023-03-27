package javaoop.Lezione;

public class Studente {

    // Fields always need to be private.
    private String nome;
    private String cognome;
    private String matricola;
    private String codiceFiscale;

    //constructor method, no need for "String, Integer",
    // this method does return a class instance (in this case a Student instance) no need for return.
    // just public/private and the same name (case-sensitive).
    // this refers specifically to the instance of the class. ex. this.name refers
    // to private String nome.
    public Studente(String nome, String cognome, String matricola, String codiceFiscale) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.codiceFiscale = codiceFiscale;
    }

    // all getters are called get+attribute name
    // public methods can be called anywhere without creating specific classes,
    // public methods that do not have input are useless

    public String getNome() {
        return nome;
    }
    public void setNome() {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCogome() {
        this.cognome = cognome;
    }
    public String getMatricola() {
        return matricola;
    }
    public void setMatricola() {
        this.matricola = matricola;
    }
    public String getCodicefiscale() {
        return codiceFiscale;
    }
    public void setCodicefiscale() {
        this.codiceFiscale = codiceFiscale;
    }
    @Override
    public String toString() {
        return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", codiceFiscale="
                + codiceFiscale + "]";
    }

}