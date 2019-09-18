package paket;

public abstract class BinarnaOperacija extends Izraz{
	protected Izraz leviOperand;
	protected Izraz desniOperand;
	public BinarnaOperacija(Izraz leviOperand, Izraz desniOperand) {
		super();
		this.leviOperand = leviOperand;
		this.desniOperand = desniOperand;
	}
	@Override
	public String toString() {
		return "BinarnaOperacija [leviOperand=" + leviOperand + ", desniOperand=" + desniOperand + "]";
	}
	
}
