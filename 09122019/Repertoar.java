package PozoristeX;

import java.util.ArrayList;

public class Repertoar {
	private Pozoriste pozoriste;
	private ArrayList<Predstava> predstave= new ArrayList<Predstava>();
	public Repertoar(Pozoriste pozoriste) {
		super();
		this.pozoriste = pozoriste;
	}
	public void dodaj(Predstava x) {
		predstave.add(x);
	}
	public void ukloni(String x) {
		for (Predstava el: predstave) {
			if (x.equals(el.getNaziv())) predstave.remove(el);
		}
	}
	public String toString() {
		String sum = pozoriste.toString()+" ";
		for (Predstava el: predstave) {
			sum+=el.toString()+"\n";
		}
		return sum;
	}
}
