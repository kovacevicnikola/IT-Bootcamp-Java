package paket2;

public class Numera {
	private String naziv;
	private String izvodjac;
	private String trajanje;
	public Numera(String naziv, String izvodjac, String trajanje) {
		super();
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.trajanje = trajanje;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getIzvodjac() {
		return izvodjac;
	}
	public String getTrajanje() {
		return trajanje;
	}
	public String toString() {
		return null;
	}
}
