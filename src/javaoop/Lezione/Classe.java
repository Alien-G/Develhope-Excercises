package javaoop.Lezione;

import java.util.ArrayList;
import java.util.List;

public class Classe {

    private List<Studente> studenti = new ArrayList<>();

    private Integer id;

    public void addStudente(Studente studente) {
        studenti.add(studente);
    }


    public void printStudenti() {
        System.out.println(studenti);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Classe [studenti=" + studenti + "]";
    }
}