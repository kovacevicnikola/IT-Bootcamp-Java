package paketCetiri;

import java.util.Scanner;

public class Samoglasnici {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(samoglasnici(sc.nextLine().toLowerCase()));

	}
	static String samoglasnici(String a) {
		String[] x = a.split(" ");
		int[] y = new int[x.length];
		for (int i=0; i<x.length; i++) {
			for (int j=0;j<x[i].length();j++) {
				if (x[i].charAt(j)=='a'||
					x[i].charAt(j)=='e'||
					x[i].charAt(j)=='i'||
					x[i].charAt(j)=='o'||
					x[i].charAt(j)=='u') {
					y[i]+=1;
				}
			}
		}
		int max=0;
		int pos=0;
		for (int i=0;i<y.length;i++) {
			if (y[i]>max) {max=y[i]; pos=i;}
		}
		return x[pos];
	}
}
