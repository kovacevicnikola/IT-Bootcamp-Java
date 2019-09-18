package istovar;

import java.util.ArrayList;

public class Kamion {
	private String regBroj;
	private ArrayList<Tovar> tovar=new ArrayList<>();
	private double nosivost;

	public Kamion(String regBroj, double nosivost) {
		super();
		this.regBroj = regBroj;

		this.nosivost = nosivost;

	}
	public double teret() {
		double sum=0;
		for (Tovar el: tovar) {
			sum+=el.tezina();
		}
		return sum;
	}
	
	public boolean stavi(Tovar x) {
		if (teret()+x.tezina()<=nosivost) {
			tovar.add(x);
			return true;
		}  else {
			return false;
		}
	}
	
	public void skini() {
		tovar.remove(tovar.size()-1);
	}
	public String toString() {
		String sum=regBroj+"( "+teret()+"/ "+nosivost+") \n";
		for (Tovar el: tovar) {
			sum+="\n \t"+el.toString()+el.tezina();
		}
		return sum;
	}
}
