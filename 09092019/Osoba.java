package svetiSava;

public abstract class Osoba {
	private String ime;
	private String prezime;
	private String adresa;
	
	public Osoba(String ime, String prezime, String adresa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
	}
	public Osoba(Osoba osoba) {
		this.ime = osoba.ime;
		this.prezime = osoba.prezime;
		this.adresa = osoba.adresa;
	}
	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + "]";
	}
	public abstract int numeroloskiBroj();
	public abstract String metabolizam(Datum x);
}
