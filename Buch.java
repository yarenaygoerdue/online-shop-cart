package aufgabe_0_5;

public class Buch extends Artikel {

	private String autor;
	private String titel;

	public Buch(String autor, String titel, int preis) {
		super(preis);
		this.autor = autor;
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitel() {
		return titel;
	}

	@Override
	public String toString() {
		return "[Buch]: \"" + titel + "\" von " + autor + " | " + super.toString();
	}

}


