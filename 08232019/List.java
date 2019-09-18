package domaci;

public class List {
	int broj;
	String tekst;
	public List(int broj, String tekst) {
		super();
		this.broj = broj;
		this.tekst = tekst;
	}
	
	public boolean uporedi(List x, char y) {
		switch(y) {
		case '=': return x.broj==this.broj;
		case '>': return x.broj>this.broj;
		case '<': return x.broj<this.broj;
		default: return false;
		}
	}
	public static boolean uporedi(List x, List y, char z) {
		switch(z) {
		case '=': return x.broj==y.broj;
		case '>': return x.broj>y.broj;
		case '<': return x.broj<y.broj;
		default: return false;
		}
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getBroj() {
		return broj;
	}
}
