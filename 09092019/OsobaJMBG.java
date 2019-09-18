package svetiSava;

public class OsobaJMBG extends OsobaD {
	private String JMBG;
	public OsobaJMBG(OsobaJMBG osoba) {
		super(osoba);
		// TODO Auto-generated constructor stub
	}

	public OsobaJMBG(String ime, String prezime, String adresa, String JMBG) {
		super(ime, prezime, adresa, new Datum(Integer.parseInt(JMBG.substring(0,2)), Integer.parseInt(JMBG.substring(2, 4)), Integer.parseInt(("1"+JMBG.substring(4,7)))));
		this.JMBG=JMBG;
		// TODO Auto-generated constructor stub
	}

}
