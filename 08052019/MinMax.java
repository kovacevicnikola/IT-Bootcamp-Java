package pakettri;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [sc.nextInt()]; 
		unesiNiz(a);
		System.out.println(Arrays.toString(minMax(a)));
	}
	static void unesiNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	}
	static int[] minMax(int[] a) {
		int min = 1000;
		int max = 0;
		for (int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
		int[] x = new int[2];
		x[0] = min;
		x[1] = max;
		return x;
	}

}
