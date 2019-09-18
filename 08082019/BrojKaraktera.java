package testPaket;

import java.util.Scanner;

public class BrojKaraktera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(brojKaraktera(sc.nextLine()));

	}
	static int brojKaraktera(String a) {
		int ct=0;
		for (int i=0; i<a.length();i++) {
			if (a.substring(i,i+1).equals("c")) ct+=1;
		}
		return ct;
	}
}
