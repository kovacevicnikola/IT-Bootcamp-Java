package muzike;

import java.util.Date;

public class Album {
	private String naziv;
	private String izvodjac;
	private	Date datum;
	private MuzickaNumera[] nizPesama;
	
	public Album(String naziv, String izvodjac, Date datum) {
		super();
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		this.nizPesama = new MuzickaNumera[5];
	}
	
	public void dodaj(MuzickaNumera pesma) {
		boolean x = false;
		for (int i=0; i<nizPesama.length;i++) {
			if (nizPesama[i]==null) {
				x=true;
				nizPesama[i]=pesma; 
				break;
			}

		}
		if (!x) {
			MuzickaNumera[] noviNiz = new MuzickaNumera[nizPesama.length*2];
			for (int i=0;i<nizPesama.length;i++) {
				noviNiz[i] = nizPesama[i];
			}
				noviNiz[nizPesama.length] = pesma;
				this.nizPesama=noviNiz;
		}
	}
	public void dodaj(String name, String trajanje) {
		dodaj(new MuzickaNumera(name, this.izvodjac, trajanje));
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}

	public String getTrajanje() {
		int sum0=0;
		int sum1=0;
		for (int i=0;i<nizPesama.length;i++) {
			if (nizPesama[i]!=null) {
			String[] strArr = nizPesama[i].getTrajanje().split(":");
			sum0 += Integer.parseInt(strArr[0]);
			sum1 += Integer.parseInt(strArr[1]);
			}
		}
		sum0+= sum1/60;
		sum1= sum1%60;
		return  Integer.toString(sum0) + ":" + Integer.toString(sum1);
	}
	public Date getDatum() {
		return datum;
	}
	public MuzickaNumera getMuzickaNumera(int index) {
		return nizPesama[index];
	}
	public MuzickaNumera getMuzickaNumera(String ime) {
		for (MuzickaNumera el: nizPesama) {
			if (el.getNaziv().equals(ime)) return el;
		}
		return null;
	}
	public String toString() {
		String sum="";
		sum= izvodjac + " - " + naziv + " (" + datum.getYear() + ") " + " [ ";
		for (int i = 0; i<nizPesama.length;i++) {
			if (nizPesama[i]!=null) sum+= "\n \t" + nizPesama[i].toString();
		}
		sum+= "] : " + this.getTrajanje();
		return sum;
	}

	public MuzickaNumera[] getNizPesama() {
		return nizPesama;
	}
}
