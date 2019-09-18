package asdf;

public class Student {
	private String potpis;
	private String jmbg;
	private Ocena[] ocene;
	
	public double getProsecnaOcena() {
		double sum=0;
		int ct=0;
		for (Ocena o: ocene) {
			if(o!=null) {sum+=o.getOcena(); ct+=1;}
		}
		return sum/ct;
	}
	public String getDatumRodjenja() {
		if (Integer.parseInt(jmbg.substring(4,7))>900) {
			return jmbg.substring(0, 2) + "." + jmbg.substring(2, 4) + ".1" + jmbg.substring(4, 7);}
		else {
			return jmbg.substring(0, 2) + "." + jmbg.substring(2, 4) + ".2" + jmbg.substring(4, 7);
		}
	}
	public String getIme() {
		return potpis.split(" ")[0];
	}
	public String getPrezime() {
		return potpis.split(" ")[1];
	}
	public String najboljaOcena() {
		Predmet x = null;
		int max = 0;
		for (Ocena o: ocene) {
			if (o!=null) {
				if (o.getOcena()>max) {max=o.getOcena(); x = o.getPredmet();}
			}
		}
		return x.getIme();
	}
	static boolean starijiOd(Student s, int god) {
		if (Integer.parseInt(s.getJmbg().substring(4,7))>900) {
			if (1019-Integer.parseInt(s.getJmbg().substring(4,7))>=god) return true; 
			else return false;
			}
			
		else {
			if (19-Integer.parseInt(s.getJmbg().substring(4,7))>=god) return true; 
			else return false;
			}
		}
		
	
	static Student[] prosekVeciOd(Student[] nizStudenata, double ocena) {
		Student[] noviNiz;
		int ct = 0;
		for (Student s: nizStudenata) { 
			if (s.getProsecnaOcena()>ocena) ct+=1;
		}
		noviNiz = new Student[ct];
		for (Student s: nizStudenata) {
			if (s.getProsecnaOcena()>ocena) {
				for (int i=0;i<noviNiz.length;i++) {
					if (noviNiz[i]==null) {noviNiz[i]=s; break;}
				}
			}
		}
		return noviNiz;
	}
	public String getPotpis() {
		return potpis;
	}
	public String getJmbg() {
		return jmbg;
	}
	public Ocena[] getOcene() {
		return ocene;
	}
	public Student(String potpis, String jmbg, Ocena[] ocene) {
		super();
		this.potpis = potpis;
		this.jmbg = jmbg;
		this.ocene = ocene;
	}
}
