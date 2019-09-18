package paket;

public class StudentMasterStudija extends Student{
  String smerMasterStudija;
    public StudentMasterStudija(String ime, String prezime, int godRod, int godStud, double prosek,String smerMasterStudija) {
      super(ime, prezime, godRod, godStud, prosek);
      this.smerMasterStudija=smerMasterStudija;
  
    }
	@Override
	public String toString() {
		return "StudentMasterStudija [smerMasterStudija=" + smerMasterStudija + "]";
	}
}
