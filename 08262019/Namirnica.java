package domaci;

public abstract class Namirnica extends Energent{
	protected String ime;
	protected int id;
	private static int globalID=0;
	
	public Namirnica(String ime) {
		this.ime=ime;
		this.id=globalID++;
	}

	@Override
	public String toString() {
		return "[" + id + "] " + ime;
	}

	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}
	
}
