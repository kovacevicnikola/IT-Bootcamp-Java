package trougao;

public class Trougao {
	private Tacka pocetnaTacka;
	private double a;
	private double b;
	private double c;
	
	public Trougao(Tacka pocetnaTacka, double a, double b, double c) {
		if (validator(a,b,c)) {
			this.pocetnaTacka = pocetnaTacka;
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else System.out.println("Trougao sa unesenim vrednostima ne postoji.");
	}

	private boolean validator(double a, double b, double c) {
		if (a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0) return true;
		else return false;
	}
	
	public boolean jednakokraki() {
		if (this.a==this.b||this.a==this.c||this.b==this.c) return true;
		else return false;
	}
	
	public double povrsina(double a, double b, double c) {
		return ((a+b+c)/2);
	}
	
	public double obim(double a, double b, double c) {
		return a+b+c;
	}
	
	public void setStranica(int x, double z) {
		switch (x) {
			case 1: if (validator(z,this.b, this.c)) {this.a = z; break;}
			case 2: if (validator(this.a, z, this.c)) {this.b = z; break;}
			case 3: if (validator(this.a, this.b, z)) {this.c = z; break;}
			default: System.out.println("Nevalidan unos.");
		}
	}
	
	public boolean proveraTacke(Tacka b) {
		if (this.pocetnaTacka.getX()==b.getX() && this.pocetnaTacka.getY()==b.getY()) return true;
		else return false;
	}
	
	public void getTrougao() {
		if (pocetnaTacka!=null) {
		System.out.println("Trougao sa pocetkom u " + this.pocetnaTacka.getXY());
		System.out.println("Stranice trougla su " + this.a +", " + this.b + ", " + this.c);
		System.out.println("Povrsina: " + povrsina(this.a, this.b, this.c));
		System.out.println("Obim: " + obim(this.a, this.b, this.c));
	} else System.out.println("Trougao nije kreiran pravilno.");
		}
	public Tacka getTacka() {
		return pocetnaTacka;
	}
	
	public void setTacka(Tacka x) {
		this.pocetnaTacka = x;
	}
}