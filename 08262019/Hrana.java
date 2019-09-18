package domaci;

public class Hrana extends Namirnica{

	private double tezina;
	private double belancevine;
	private double masti;
	private double ugljHidrati;
	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljHidrati) {
		super(ime);
		this.tezina = tezina;
		this.belancevine = belancevine;
		this.masti = masti;
		this.ugljHidrati = ugljHidrati;
	}
	public double getTezina() {
		return tezina;
	}
	public double getBelancevine() {
		return belancevine*tezina;
	}
	public double getMasti() {
		return masti*tezina;
	}
	public double getUgljHidrati() {
		return ugljHidrati*tezina;
	}
	public double energVr() {
		return (getBelancevine()*16.7+getMasti()*37.6+getUgljHidrati()*17.2)/100;
	}
	@Override
	public String toString() {
		return super.toString()+"(" + tezina + "gr ," + energVr() + " kJ)";
	}
	
	

}
