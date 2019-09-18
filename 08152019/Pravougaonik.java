package paketX;

public class Pravougaonik {

	private double a;
	private double b;
	private String ime;
	
	public Pravougaonik(double a, double b, String ime) {
		this.a = a;
		this.b = b;
		this.ime = ime;
	}
	public Pravougaonik(double a, String ime) {
		this.a= a;
		this.b=a;
		this.ime = ime;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getObim() {
		return 2*this.a+2*this.b;
	}
	public double getPovrsina() {
		return a*b;
	}
	public void ispisiPravougaonik() {
		System.out.println("Pravougaonik "+this.ime+":");
		System.out.println("Duzina prve stranice je " + a);
		System.out.println("Duzina druge stranice je " + b);
		System.out.println("Povrsina je " + this.getPovrsina());
		System.out.println("Obim je "+ this.getObim());
	}
}
