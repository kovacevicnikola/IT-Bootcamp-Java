package paket2;

import java.util.Arrays;

public class Prodavnica {
	private String ime;
	private String lokacija;
	private Artikal[] inventar;
	public Prodavnica(String ime, String lokacija) {
		super();
		this.ime = ime;
		this.lokacija = lokacija;
		this.inventar = new Artikal[10];
	}
	public Artikal[] pretrazi(String tekst) {
		int ct=0;
		for (Artikal el: inventar) {
			if (el!=null&&el.ime().toLowerCase().contains(tekst.toLowerCase())) ct+=1;
		}
		Artikal[] niz = new Artikal[ct];
		ct=0;
		for (int i=0;i<inventar.length;i++) {
			if (inventar[i]!=null&&inventar[i].ime().toLowerCase().contains(tekst.toLowerCase())) {niz[ct]=inventar[i]; ct++;}
		}
		return niz;
	}
	public void dodaj(Artikal a) {
		boolean m=false;
		for (int i=0; i<inventar.length;i++) {
			if (inventar[i]==null) {inventar[i]=a; m=true; break;}
			
		}
		if (!m) {
			Artikal[] noviNiz = new Artikal[2*inventar.length];
			for (int i=0;i<inventar.length;i++) {
				noviNiz[i]=inventar[i];
			}
			noviNiz[inventar.length]=a;
			inventar=noviNiz;
		}
	}
	
	public String getIme() {
		return ime;
	}
	public String getLokacija() {
		return lokacija;
	}
	@Override
	public String toString() {
		String sum="";
		sum+= ime + ": " + lokacija + "[";
		for (Artikal el: inventar) {
			if (el!=null) sum+="\n \t" +el.toString();
		}
		return sum;
	}
	
	
}
