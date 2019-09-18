package paket;

public class Covek {
    private String ime;
    private String prezime;
    private int godRod;
    //nece da mi kompajluje, podvlaci mi svs super metode ali mislim da mi je sintaksa za iste okej; proveravam i popravljam veceras ako uspem
    public Covek (String ime, String prezime, int godRod) {
      this.ime =ime;
      this.prezime=prezime;
      this.godRod=godRod;
    
}
	@Override
	public String toString() {
		return "Covek [ime=" + ime + ", prezime=" + prezime + ", godRod=" + godRod + "]";
	}
}