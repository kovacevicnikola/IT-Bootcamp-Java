package paket;

public class StudentOsnovnihStudija extends Student {
    String smerOsnovnihStudija;
    public StudentOsnovnihStudija(String ime, String prezime, int godRod, int godStud, double prosek,String smerOsnovnihStudija) {
      super(ime, prezime, godRod, godStud, prosek);
      this.smerOsnovnihStudija=smerOsnovnihStudija;
  
    }
	@Override
	public String toString() {
		return "StudentOsnovnihStudija [smerOsnovnihStudija=" + smerOsnovnihStudija + "]";
	}
}
