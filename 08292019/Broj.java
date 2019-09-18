package paket;

public class Broj extends Izraz {
	public double vrednost;
	
	public Broj(double vrednost) {
		this.vrednost=vrednost;
	}
	@Override
	public String toString() {
		return "Broj [vrednost=" + vrednost + "]";
	}
	public double izracunaj() {
		return vrednost;
	}
}
