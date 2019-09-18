package paket;

public class Zaposleni extends Covek {
     int godZap;
     int plata;
     public Zaposleni(String ime, String prezime, int godRod, int godZap, int plata) {
      super(ime,prezime,godRod);
      this.godZap=godZap;
      this.plata=plata;
}
	@Override
	public String toString() {
		return "Zaposleni [godZap=" + godZap + ", plata=" + plata + "]";
	}
}