package pakettri;

import java.util.Scanner;

public class Duplikati {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [sc.nextInt()]; 
		unesiNiz(a);
		duplikati(a);
	}
	static void unesiNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		}
	static void duplikati(int[] a) {
		for (int i=0; i<a.length;i++) {
			for (int j=i+1; j<a.length-1;j++) {
				if (a[i]==a[j]) System.out.println("Duplikat "+ a[i]); break;
			}
		}
	}
}
