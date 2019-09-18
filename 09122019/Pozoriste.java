package PozoristeX;

public class Pozoriste {
	private static int globalId=0;
	private int id;
	private String naziv;
	public Pozoriste(String naziv) {
		super();
		this.id = globalId++;
		this.naziv = naziv;
	}
	public int getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getSkraceniNaziv() {
		String[] x = naziv.split(" ");
		String sum="";
		for (String el: x) {
			sum+=el.substring(0, 1);
		}
		return sum.toUpperCase();
	}
	@Override
	public String toString() {
		return naziv+"["+id+"]\n";
	}
}
