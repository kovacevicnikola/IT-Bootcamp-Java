package pakettri;

import java.util.Scanner;

public class BrojUNizu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [sc.nextInt()]; 
		unesiNiz(a);
		uNizu(a);
	}
	static void unesiNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static void uNizu(int[] a) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean z = false;
		for (int i=0;i<a.length;i++) {
			if (x==a[i]) z=true;

		}
		if (z) System.out.println("U nizu je");
		else System.out.println("Nije u nizu");
		
	}
}
