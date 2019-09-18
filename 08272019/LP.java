package paket2;

public class LP extends AlbumArtikal {
	private int tezina;

	public LP(Album album, String izdavac, double cena, int kol, int tezina) {
		super(izdavac, album, cena, kol);
		this.tezina=tezina;
		// TODO Auto-generated constructor stub
	}
	public String ime() {
		
		return super.getAlbum().getIzvodjac() + " - " + super.getAlbum().getNaziv() + "("+ tezina+"[g]LP)";
	
}
}