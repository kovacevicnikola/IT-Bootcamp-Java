package paket2;

import java.sql.Date;
import java.time.LocalDate;

public class Album {
	private String naziv;
	private String izvodjac;
	private LocalDate datum;
	private Numera[] lista;
	public Album(String naziv, String izvodjac, LocalDate datum) {
		super();
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		this.lista = new Numera[10];
	}
	public String getNaziv() {
		return naziv;
	}
	public String getIzvodjac() {
		return izvodjac;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public Numera getNumera(int idx) {
		return lista[idx];
	}
	public void dodaj(Numera x) {
		for (int i=0;i<lista.length;i++) {
			if (lista[i]==null) lista[i]=x; break;
		}
	}
	public void dodaj(String name, String trajanje) {
		for (int i=0;i<lista.length;i++) {
			if (lista[i]==null) lista[i]=new Numera(name, "x", trajanje); break;
		}
	}
	
}
