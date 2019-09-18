package paketCetiri;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (palindrom(sc.nextLine().toLowerCase())) System.out.println("Palindrom");
		else System.out.println("Nije palindrom");

	}
	static boolean palindrom(String x) {
		String[] a = x.split(" ");
		String sum="";
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		for (int i=0, j=sum.length()-1;i<sum.length()/2;i++, j--) {
			if (sum.charAt(i)!=sum.charAt(j)) return false;
		}
		return true;
	}

}
