package javaoop.Lezione;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scuola scuola = new Scuola();

        Scanner scanner = new Scanner(System.in);
        String action = null;

        do{
            action = scanner.next();
            switch (action) {
                case "add-class":
                    Classe classe = new Classe();
                    System.out.println("Id:");
                    String id = scanner.next();
                    classe.setId(Integer.parseInt(id));
                    scuola.creaClasse(classe);
                    break;
                case "add-studente":
                    System.out.println("Nome: ");
                    String nome = scanner.next();
                    System.out.println("Cognome: ");
                    String cognome = scanner.next();
                    System.out.println("Codice Fiscale: ");
                    String codiceFiscale = scanner.next();
                    System.out.println("Nome: ");
                    String scuolaId = scanner.next();

                    break;
                case "print-all":
                    break;

                default:
                    System.out.println("Scrivi add-class per aggiungere una classe, add-student per" +
                            "aggiungere uno studente, print-all per stampare tutto");
                    break;
            }
        } while (!"stop".equals(action));


        Classe classe = new Classe();
        Classe classe2 = new Classe();
        Studente studente1 = new Studente("asd","asd","123", "asdasd");
        Studente studente2 = new Studente("asd2","asd2","1232", "asdasd2");
        Studente studente3 = new Studente("asd3","asd3","1233", "asdasd3");
        Studente studente4 = new Studente("asd4","asd4","1234", "asdasd4");
        classe.addStudente(studente1);
        classe.addStudente(studente2);
        scuola.creaClasse(classe);
        classe2.addStudente(studente3);
        classe2.addStudente(studente4);
        scuola.stampaClassi();
    }
}
