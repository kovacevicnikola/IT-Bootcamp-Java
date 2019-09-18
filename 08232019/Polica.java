package domaci;

import java.util.Arrays;

public class Polica {
	Knjiga[] red;

	public Polica() {
		super();
		this.red = new Knjiga[10];
	}
	public void dodajKnjigu(Knjiga x) {
		for (int i=0;i<red.length;i++) {
			if (red[i]==null) {
				red[i]=x;
				break;
			}
		}
	}
	public Knjiga nadjiKnjigu(String x) {
		for (int i=0;i<red.length;i++) {
			if (red[i].getNaziv().equals(x)) {
				Knjiga y = red[i];
				red[i]=null;
				return y;
			}
		}
		return null;
	}
	@Override
	public String toString() {
		return "Polica [red=" + Arrays.toString(red) + "]";
	}
}
