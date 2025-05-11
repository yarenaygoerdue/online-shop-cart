package aufgabe_0_5;

public class Position<T extends Artikel> {

	private T produkt;
	private int menge;

	public Position(T artikel, int menge) {
		this.produkt = artikel;
		this.menge = menge;
	}

	public int berechneGesamtpreis() {
		return produkt.getPreis() * menge;
	}

	public int berechneDifferenz(Position<?> andere) {
		return andere.berechneGesamtpreis() - this.berechneGesamtpreis();
	}

	@Override
	public String toString() {
		return produkt.toString() + "\nAnzahl: " + menge;
	}

}



