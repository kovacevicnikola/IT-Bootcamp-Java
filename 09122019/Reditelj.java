package PozoristeX;

public class Reditelj extends Zaposleni {


	public Reditelj(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String imePosla() {
		return "Reditelj";
	}
	public String toString() {
		return super.getIme()+"("+imePosla()+ ", "+  super.getPozoriste().getSkraceniNaziv()+")";
	}

}
