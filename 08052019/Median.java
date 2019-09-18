package pakettri;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// trokiraju mi funkcije za medijanu i sredinu, ali ne mogu da skapiram zasto
		// logika mi deluje okej, al vracaju pogresne vrednosti
		Scanner sc = new Scanner(System.in);
		int[] a = new int [sc.nextInt()]; 
		unesiNiz(a);
		sortirajNiz(a);
		System.out.println(median(a));
		System.out.println(arSredina(a));
	}
	static void unesiNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static void sortirajNiz(int[] a) {
		for (int i=a.length-1;i>0;i--) {
			int checked=a[i];
			for (int j=a.length-2;j>=0;j--) {
				if (a[j]>checked) {
					int temp=a[j];
					a[j]=checked;
					a[i]= temp;
					
					
				}
			}
		}
	}
	static double median(int[] a) {
		if (a.length%2!=0) {
			double x = a[(a.length/2)-1];
			return x;
		} else {
			int x=a[a.length/2];
			int y=a[a.length/2+1];
			return x/y;
		}
	}
	static double arSredina(int[] a) {
		double sum=0;
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/(a.length-1);
	}
}
