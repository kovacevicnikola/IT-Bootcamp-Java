package prodavnicaAutomobila;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DBAutomobil db = new DBAutomobil("jdbc:sqlite:C:\\Users\\Nick\\Downloads\\Prodavnica.db");
		db.connect();
		System.out.println("Unesite username i password odvojene enterom");
		if (db.login(sc.nextLine(), sc.nextLine())) {
			System.out.println("Uspesno logovanje, izaberite 1 za uplatu i 2 za kupovinu");

			switch (sc.nextLine()) {
				case "1": db.uplata(); break;
				case "2": db.kupovina(); break;
			}
		}
		
		db.disconnect();
	}

}
