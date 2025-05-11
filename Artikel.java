package aufgabe_0_5;

import java.util.Formatter;

public abstract class Artikel {

	private int preisInCent;

	public Artikel(int preis) {
		setPreis(preis);
//		this.preisInCent = preisInCent; 
	}

	public int getPreis() {
		return preisInCent;
	}

	public void setPreis(int preis) {
		this.preisInCent = preis;
	}

	public String toString() {
		Formatter f = new Formatter();
		String ausgabe = "Preis: " + f.format("%.2f €", preisInCent / 100.0);
		f.close();
		return ausgabe;
	}

}


