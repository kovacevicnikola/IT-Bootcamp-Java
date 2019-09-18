package istovar;

public class Predmet extends Tovar {
	private String vrsta;
	private double tezina;
	
	public Predmet(String vrsta, double tezina) {
		super();
		this.vrsta = vrsta;
		this.tezina = tezina;
	}

	@Override
	public String vrsta() {
		// TODO Auto-generated method stub
		return vrsta;
	}

	@Override
	public double tezina() {
		
		return tezina;
	}

}
