package pakettri;

import java.util.Arrays;
import java.util.Scanner;

public class TreciNiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [sc.nextInt()];
		unesiNiz(a);
		int[] b = new int [sc.nextInt()];
		unesiNiz(b);
		int[] c;
		if (a.length>b.length) c = new int[a.length];
		else c = new int[b.length+1];
		duplikati(a,b,c);
		System.out.println(Arrays.toString(c));
	}
	static void unesiNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static void duplikati(int[] a, int[] b, int[] c) {
		if (a.length>b.length) {
		for (int i=0; i<a.length;i++) {
			for (int j=0; j<b.length;j++) {
				if (a[i]==b[j]) c[i]=b[j];
			}
		}
		} else {
				for (int i=0; i<b.length;i++) {
					for (int j=0; j<a.length;j++) {
						if (a[j]==b[i]) c[i]=b[j];
			}
			}
		}
	}
}
