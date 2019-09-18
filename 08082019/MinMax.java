package testPaket;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[sc.nextInt()][sc.nextInt()];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(Arrays.toString(minMax(a)));
	}
	static int[] minMax(int[][] a) {
		int min=a[0][0];
		int max=a[0][0];
		int[] x = new int[2];
		for (int i=0; i<a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]>max) max=a[i][j];
				if (a[i][j]<min) min=a[i][j];
			}
		}
		x[0]=min;
		x[1]=max;
		return x;
		}
	}


