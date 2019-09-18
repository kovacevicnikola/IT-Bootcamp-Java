package svetiSava;

public class OsobaD extends Osoba {
	private Datum datumRodjenja;


	public OsobaD(String ime, String prezime, String adresa, Datum datumRodjenja) {
		super(ime, prezime, adresa);
		this.datumRodjenja = datumRodjenja;
		// TODO Auto-generated constructor stub
	}
	public OsobaD(OsobaD osoba) {
		super(osoba);
		this.datumRodjenja = osoba.datumRodjenja;
	}
	@Override
	public String toString() {
		return "OsobaD [datumRodjenja=" + datumRodjenja + ", toString()=" + super.toString();
	}
	
	public String metabolizam(Datum x) {
		String[] sp = this.datumRodjenja.toString().split("[.]");
		String sum="";
		for (String el: sp) {
			sum+=el;
		}
		String[] sp2 = x.toString().split("[.]");
		String sum2="";
		for (String el: sp2) {
			sum2+=el;
		}
		int novi = Integer.parseInt(sum)+Integer.parseInt(sum2);
		String strNovi="";
		if (novi<1000000) strNovi="0";
		strNovi+=novi;
		return strNovi;
		
	}
	public int numeroloskiBroj() {
		String[] sp = datumRodjenja.toString().split("[.]");
		int sum=0;
		for (String el: sp) {
			if (!el.equals("")) sum+= Integer.parseInt(el);
		}
		while (sum>10) {
			String ss = "";
			ss+=sum;
			String[] spp = ss.split("");
			sum=0;
			for (String el: spp) {
				sum+=Integer.parseInt(el);
			}
		}
		return sum;
	}
	
}
