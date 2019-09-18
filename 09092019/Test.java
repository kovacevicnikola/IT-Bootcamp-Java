package svetiSava;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Broj osopa?");
		int x = sc.nextInt();
		sc.nextLine();
		Osoba[] niz = new Osoba[x];
		for (int i=0; i<x;i++) {
			System.out.println("Ime osope: ");
			String ime = sc.nextLine();
			System.out.println("Prezime osope: ");
			String prezime = sc.nextLine();
			System.out.println("Adresa osope: ");
			String adresa = sc.nextLine();
			System.out.println("1 za datum, 2 za jmbg");
			switch(sc.nextInt()) {
			case 1: 
				System.out.println("Uneti datum u formatu dd.mm.yyyy.");
				sc.nextLine();
				String datum = sc.nextLine();
				String[] datumsp = datum.split("[.]");
				if (validator(datum)) {
				for (int j=0; j<niz.length;j++) {
					if (niz[j]==null) {niz[j]= new OsobaD(ime, prezime, adresa, new Datum(Integer.parseInt(datumsp[0]),Integer.parseInt(datumsp[1]),Integer.parseInt(datumsp[2])));
					break;
					} 
					
				}
				
				} else System.out.println("Nemere datum");
				break;
			case 2:
				System.out.println("JMBG: ");
				sc.nextLine();
				for (int j=0; j<niz.length;j++) {
					if (niz[j]==null) {niz[j]= new OsobaJMBG(ime,prezime,adresa, sc.nextLine()); break;}
				}
			}
		}
		for (Osoba el: niz) {
			if (el.numeroloskiBroj()!=7&&!el.metabolizam(new Datum(9,10,2019)).contains("0")) {
				System.out.println(el);
				System.out.println(el.numeroloskiBroj());
				System.out.println(el.metabolizam(new Datum(9,10,2019)));
			}
		}

	}
	public static boolean validator(String x) {
		if (x.split("[.]")[0].equals("29")&&!(Integer.parseInt(x.split("[.]")[2])%4==0&&(Integer.parseInt(x.split("[.]")[2])%100==0))) return false;
		if (x.split("[.]")[0].length()!=2||x.split("[.]")[1].length()!=2) return false;
		else return true;
	}
}
