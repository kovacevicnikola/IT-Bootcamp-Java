package paket;

public class Sabiranje extends BinarnaOperacija{

	public Sabiranje(Izraz leviOperand, Izraz desniOperand) {
		super(leviOperand, desniOperand);
		// TODO Auto-generated constructor stub
	}
	public double izracunaj() {
		double vrednostLevogIzraza=leviOperand.izracunaj();
		double vrednostDesnogIzraza=desniOperand.izracunaj();
		return vrednostLevogIzraza+vrednostDesnogIzraza;
	}
	@Override
	public String toString() {
		return "Sabiranje [leviOperand=" + leviOperand + ", desniOperand=" + desniOperand + ", izracunaj()="
				+ izracunaj();
	}
}
