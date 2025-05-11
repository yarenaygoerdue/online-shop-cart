package aufgabe_0_5;

public class Hauptklasse5 {

	public static final String RESET = "\u001B[0m";
	public static final String ROT = "\u001B[31m";
	public static final String GRUEN = "\u001B[32m";
	public static final String GELB = "\u001B[33m";
	public static final String BLAU = "\u001B[34m";

	public static void main(String[] args) {

		Buch[] buecher = { new Buch("Ratz", "Java", 4500), new Buch("Heimberger", "Das Haus am Meer", 1295),
				new Buch("Kramer", "Pillepalle", 990) };

		Position<Buch> buchPos = new Position<>(buecher[1], 2);
		Einkaufswagen wagen = new Einkaufswagen();
		wagen.hinzufuegen(buchPos);

		SDKarte[] karten = { new SDKarte("SanDisk", 32, 499), new SDKarte("Kingston", 64, 900) };

		Position<SDKarte> pos1 = new Position<>(karten[0], 3);
		Position<SDKarte> pos2 = new Position<>(karten[1], 3);

		wagen.hinzufuegen(pos1);
		wagen.hinzufuegen(pos2);

		System.out.printf(ROT + "Unterschied: %.2f €\n" + RESET, pos1.berechneDifferenz(pos2) / 100.0);
		System.out.println();
		System.out.println(BLAU + "Artikel 1:\n" + pos2 + RESET);
		System.out.println();
		System.out.println(BLAU + "Artikel 2:\n" + pos2 + RESET);
		System.out.println();

		wagen.aktualisieren();
		System.out.println("\n" + GRUEN + "---- Inhalt des Einkaufswagens: ----" + RESET + "\n" + wagen);
		

	}

}


