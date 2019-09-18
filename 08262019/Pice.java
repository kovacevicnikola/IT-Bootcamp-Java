package domaci;

public class Pice extends Namirnica{
	private double kolicina;
	private double enVr;
	public Pice(String ime, double kolicina, double enVr) {
		super(ime);
		this.kolicina = kolicina;
		this.enVr = enVr;
	}
	public double getKolicina() {
		return kolicina;
	}
	public double energVr() {
		return kolicina*enVr;
	}
	@Override
	public String toString() {
		return "[" +id + "] " + ime + "(" + kolicina + "l, " + energVr() + "kJ)";
	}

}
