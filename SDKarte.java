package aufgabe_0_5;

public class SDKarte extends Artikel {

	private String hersteller;
	private int kapazitaetGB;

	public SDKarte(String hersteller, int gb, int preis) {
        super(preis);
        this.hersteller = hersteller;
        this.kapazitaetGB = gb;
    }

	public String getHersteller() {
		return hersteller;
	}

	public int getKapazitaetGB() {
		return kapazitaetGB;
	}

	@Override
	public String toString() {
		return "\n[Speicherkarte] " + hersteller + ", " + kapazitaetGB + " GB | " + super.toString();
	}

}


