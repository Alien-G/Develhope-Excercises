package LezioniconLuca;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	// I CAMPI VANNO "SEMPRE" PRIVATI
	private String nome;
	private String cognome;
	// non ha senso che eta abbia un setter
	private int eta;
	private int ricoveriInOspedale = 0;
	// ci possono essere campi che io non voglio ne far settare ne far "leggere"
	private int andatoInBagno = 0;

	// di solito non si fa
	public Persona() {
		nome = "pinco";
		cognome = "pallino";
		eta = 15;
	}

	// nessun tipo di ritorno -> falso, ritorna un istanza della classe Persona
	// nome in maiuscolo
	// nome che matcha il nome della classe

	public Persona(String n, String cognome, int e) {
		nome = n;
		this.cognome = cognome;
		eta = e;
	}

	// tutti i metodi 'getter' si chiamano get + nomeattributo
	// i metodi che non prendono niente in input sono INUTILI
	// per chiamare questo metodo io NECESSITO di un istanza di Persona
	public String getNome() {
		return nome;
		// return this.nome;
	}

	public void setNome(String newNome) {
		nome = newNome;
	}

	public String getCognome() {
		return cognome;
		// return this.nome;
	}

	public void setCognome(String newCognome) {
		nome = newCognome;
	}

	public int getEta() {
		return eta;
	}

	// siccome non voglio che chi usa la classe Persona possa modificare
	// direttamente gli anni
	// aggiungo un metodo NON STATICO che permette di aumentarli uno alla volta
	public void compieGliAnni() {
		eta += 1;
	}

	// NO
	// public void setEta(int k) {
	// eta = k;
	// }

	// esempio:
	// i metodi statici si possdono chiamare senza bisogno di creare classi
	public static void printNome(String nome) {

		// non esiste
		// List.size();

		// devo creare una lista per accedere al metodo NON STATICO .size()
		List<String> list = new ArrayList<>();
		list.size();

		System.out.println(nome);
	}

	// static
	public static int size(List<String> lista) {
		return 0;
	}

	// non static, in input implicitamente prendo l'oggetto sul quale sto chiamando
	// il metodo
	public int size() {
		return 0;
	}
}
