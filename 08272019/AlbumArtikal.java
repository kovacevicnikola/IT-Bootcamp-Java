package paket2;

public abstract class AlbumArtikal extends Artikal{
	private String izdavac;
	private Album album;
	
	public AlbumArtikal(String izdavac, Album album, double cena, int kolicina) {
		super(cena, kolicina);
		this.izdavac=izdavac;
		this.album=album;
	}
	public abstract String ime(); 
	public Album getAlbum() {
		return album;
	}
}
