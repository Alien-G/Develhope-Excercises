package javaoop.Lezione;

import java.util.ArrayList;
import java.util.List;

public class Scuola {
    List<Classe> classi = new ArrayList<>();

    public void creaClasse(Classe classe) {
       classi.add(classe);
    }

    public void stampaClassi() {
        System.out.println(classi);
    }
}
