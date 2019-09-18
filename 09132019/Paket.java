package istovar;

import java.util.ArrayList;

public class Paket extends Tovar{
	ArrayList<Tovar> tovar = new ArrayList<>();

	public Paket() {
		super();
	}
	
	public void dodaj(Tovar x) {
		tovar.add(x);
	}

	public String vrsta() {
		String sum="paket ";
		return sum+tovar;
	}
	
	public double tezina() {
		double sum=0;
		for (Tovar el: tovar) {
			sum+=el.tezina();
		}
		return sum;
	}
	public String toString() {
		return "paket"+tovar;
	}
	
	
}
