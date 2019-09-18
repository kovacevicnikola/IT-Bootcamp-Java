package paket2;

public class CD extends AlbumArtikal {

	public CD(Album album, String izdavac, double cena, int kol) {
		super(izdavac, album, cena, kol);
		// TODO Auto-generated constructor stub
	}
	public String ime() {
		return super.getAlbum().getIzvodjac() + " - " + super.getAlbum().getNaziv() + "(CD)";
	}

}
