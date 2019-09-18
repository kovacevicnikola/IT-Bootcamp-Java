package pakettri;

import java.util.Scanner;

public class SrednjaVrednost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [sc.nextInt()]; 
		unesiNiz(a);
		double x = srednjaVr(a);
		ispis(a,x);
	}
	static void unesiNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static double srednjaVr(int[] a) {
		double sum=0;
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/(a.length-1);
	}
	static void ispis(int a[], double x) {
		double najblizi=a[0], najblizi2=a[0];
		for (int i=0; i<a.length;i++) {
			if (a[i]>x) System.out.println(x);
			if (najblizi>a[i]&&najblizi<x) najblizi=a[i];
			if (najblizi2<a[i]&&najblizi>x) najblizi=a[i];
		} 
		if ((x-najblizi)>(najblizi2-x)) System.out.println(najblizi);
		else System.out.println(najblizi2);
		
	}
}
