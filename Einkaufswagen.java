package aufgabe_0_5;

import java.util.Formatter;

public class Einkaufswagen {

	private static final int MAX = 10;
	private Position<?>[] inhalte = new Position<?>[MAX];
	private int gesamtwert = 0;
	private int aktuell = 0;

	public boolean hinzufuegen(Position<?> pos) {
		if (aktuell < MAX) {
			inhalte[aktuell++] = pos;
			gesamtwert += pos.berechneGesamtpreis();
			return true;
		}
		return false;
	}

	public void aktualisieren() {
		gesamtwert = 0;
		for (int i = 0; i < aktuell; i++) {
			gesamtwert += inhalte[i].berechneGesamtpreis();
		}
	}

	@Override
	public String toString() {
		String ausgabe = "";
		Formatter f = new Formatter();
		for (int i = 0; i < aktuell; i++) {
			ausgabe += inhalte[i].toString() + "\n";
		}
		ausgabe += "\n ->Gesamtbetrag: " + f.format("%.2f €", gesamtwert / 100.0);
		f.close();
		return ausgabe;
	}

}


