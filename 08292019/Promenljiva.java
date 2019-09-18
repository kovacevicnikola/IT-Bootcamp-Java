package paket;

public class Promenljiva extends Izraz{
	protected String ime;
	protected double vrednost;
	public Promenljiva(String ime, double vrednost) {
		super();
		this.ime = ime;
		this.vrednost = vrednost;
	}
	@Override
	public double izracunaj() {
		return vrednost;
	}
	@Override
	public String toString() {
		return "Promenljiva [ime=" + ime + ", vrednost=" + vrednost + "]";
	}
	
}
