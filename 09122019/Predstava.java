package PozoristeX;

import java.util.ArrayList;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni= new ArrayList<Zaposleni>();
	public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
		super();
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		this.zaposleni.add(reditelj);
	}
	public boolean dodaj(Glumac g) {
		if (g.getPozoriste().equals(pozoriste)) {zaposleni.add(g);
		return true;} else return false;
		}
	public boolean dodaj(Kostimograf k) {
		int ct=0;
		for (Zaposleni el: zaposleni) {
			if (el instanceof Kostimograf) {
				ct++;
			}}
		if (ct<3&&k.getPozoriste().equals(pozoriste)) {zaposleni.add(k); return true;}
		else return false;
		
	}
	public String getNaziv() {
		return naziv;
	}
	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	@Override
	public String toString() {
		String sum=naziv+": ";
		for (Zaposleni el: zaposleni) {
			sum+=el.toString()+"\n";
		}
		return sum;
	}
	
}
