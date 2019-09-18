package asdf;

public class Ocena {
	private int bodovi;
	private Predmet predmet;
	public Ocena(int bodovi, Predmet predmet) {
		super();
		this.bodovi = bodovi;
		this.predmet = predmet;
	}
	public int getBodovi() {
		return bodovi;
	}
	public Predmet getPredmet() {
		return predmet;
	}
	public int getOcena() {
		if (bodovi<50) return 5;
		else if (bodovi==100) return 10;
		else return bodovi/10+1;
	}
	public String toString() {
		return "Predmet" + predmet + ", ocena :" + getOcena();
	}
}
