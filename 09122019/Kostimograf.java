package PozoristeX;

import PozoristeX.Zaposleni;

public class Kostimograf extends Zaposleni {

	public Kostimograf(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String imePosla() {
		// TODO Auto-generated method stub
		return "Kostimograf";
	}
	public String toString() {
		return super.getIme()+"("+imePosla()+ ", "+ super.getPozoriste().getSkraceniNaziv()+")";
	}
}
