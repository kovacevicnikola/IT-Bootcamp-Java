package paket;

public class Asistent extends Nastavnik {
    @Override
	public String toString() {
		return "Asistent [smer=" + smer + "]";
	}
	String smer;
    public Asistent(String ime, String prezime, int godRod, int godZap, int plata, String omiljeniPredmet, String[] predmeti, String smer) {
      super( ime,  prezime,  godRod,  godZap,  plata,  omiljeniPredmet,  predmeti);
      this.smer=smer;
    }
}
