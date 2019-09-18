package domaci;

import java.util.Arrays;

public class Meni extends Namirnica {
	private Namirnica[] niz;
	private int brNam;

	public Meni(int kapacitet) {
		super("Meni");
		this.niz = new Namirnica[kapacitet];
		// TODO Auto-generated constructor stub
	}

	@Override
	public double energVr() {
		double sum = 0;
		for (Namirnica el: niz) {
			if (el!=null) sum+=el.energVr();
		}
		return sum;
	}

	@Override
	public String toString() {
		String sum = "Meni (" + energVr() + "kJ):\n";
		for (Namirnica el: niz) {
			if (el!=null) sum+= el.toString()+ "\n";
		}
		return sum;
	}

	public boolean dodaj(Namirnica x) {
		if (brNam < niz.length) {
			niz[brNam] = x;
			brNam++;
			return true;
		} else {
			return false;
		}
	}

}
