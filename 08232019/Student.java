package paket;

public class Student extends Covek {
    int godStud;
    double prosek;
    public Student(String ime, String prezime, int godRod, int godStud, double prosek) {
      super(ime, prezime, godRod);
      this.godStud=godStud;
      this.prosek=prosek;
    }
	@Override
	public String toString() {
		return "Student [godStud=" + godStud + ", prosek=" + prosek + "]";
	}
}
