package paket;

public class Profesor extends Nastavnik {
    String titula;
    public Profesor(String ime, String prezime, int godRod, int godZap, int plata, String omiljeniPredmet, String[] predmeti, String titula){
      super(ime, prezime, godRod, godZap,  plata,  omiljeniPredmet, predmeti);
      this.titula=titula;
      
    }
	@Override
	public String toString() {
		return "Profesor [titula=" + titula + "]";
	}
    }
