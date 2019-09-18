package paket;

public class Sluzbenik extends Zaposleni {
    String odsek;
    public Sluzbenik(String ime, String prezime, int godRod, int godZap, int plata, String odsek) {
      super( ime,  prezime,  godRod,  godZap,  plata);
      this.odsek=odsek;
    }
	@Override
	public String toString() {
		return "Sluzbenik [odsek=" + odsek + "]";
	}
}
