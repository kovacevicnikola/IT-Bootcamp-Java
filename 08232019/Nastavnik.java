package paket;

import java.util.Arrays;

public class Nastavnik extends Zaposleni{
    String omiljeniPredmet;
    String[] predmeti;
    public Nastavnik(String ime, String prezime, int godRod, int godZap, int plata, String omiljeniPredmet, String[] predmeti) {
    super(ime, prezime, godRod, godZap, plata);
    this.omiljeniPredmet=omiljeniPredmet;
    this.predmeti=predmeti;
    
}
	@Override
	public String toString() {
		return "Nastavnik [omiljeniPredmet=" + omiljeniPredmet + ", predmeti=" + Arrays.toString(predmeti) + "]";
	}
}
