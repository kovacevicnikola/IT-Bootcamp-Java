package PozoristeX;

public class Glumac extends Zaposleni {

	public Glumac(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String imePosla() {
		// TODO Auto-generated method stub
		return "Glumac";
	}
	public String toString() {
		return super.getIme()+"("+imePosla()+ ", "+ super.getPozoriste().getSkraceniNaziv()+")";
	}
}
