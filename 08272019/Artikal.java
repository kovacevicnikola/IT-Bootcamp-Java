package paket2;

public abstract class Artikal {
	private int id;
	private static int globalID=0;
	private double cena;
	private int kolicina;
	public Artikal(double cena, int kolicina) {
		super();
		this.id = globalID++;
		this.cena = cena;
		this.kolicina = kolicina;
	}
	public boolean kupi() {
		if (kolicina>0) {kolicina--; return true;}
		else return false;
	}
	public abstract String ime();
	public int getId() {
		return id;
	}
	public double getCena() {
		return cena;
	}
	public int getKolicina() {
		return kolicina;
	}
	@Override
	public String toString() {
		return "#"+id+": "+ime()+" - "+cena+"["+kolicina+"]";
	}
	
}
