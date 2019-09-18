package domaci;

public class Knjiga {
	String naziv;
	List[] listovi;
	public Knjiga(String naziv, List[] listovi) {
		super();
		this.naziv = naziv;
		this.listovi = null;
	}
	public String getNaziv() {
		return naziv;
	}
	public List[] getListovi() {
		return listovi;
	}
	public void dodajList(List x) {
		if (x.getBroj()>listovi.length-1) {
			List[] noviNiz = new List[x.getBroj()-1];
			for (List el: listovi) {
				if (el!=null) {
					noviNiz[el.getBroj()-1]=el;
				}
			listovi[x.getBroj()-1]=x;
			}

		} else {
			listovi[x.getBroj()-1]=x;
		}
	}
	public List getList(int i) {
		return listovi[i-1];
	}
	
}
