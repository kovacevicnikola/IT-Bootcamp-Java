package paketCetiri;

import java.util.Arrays;

public class ParNepar {

	public static void main(String[] args) {
		int [] a = {15, 2, 4, 21, 22, 42, 31};
		System.out.println(Arrays.toString(nepar(a)));

	}
	static int[] nepar(int[] a) {
		int[] x = new int[a.length];
		int k=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]%2==0) {x[k]=a[i]; k++;}
		}
		for (int i=0;i<a.length;i++) {
			if (a[i]%2!=0) {x[k]=a[i]; k++;}
		}
		return x;
	}
}
