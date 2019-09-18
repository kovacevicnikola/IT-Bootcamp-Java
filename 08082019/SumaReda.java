package testPaket;

import java.util.Arrays;
import java.util.Scanner;

public class SumaReda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[sc.nextInt()][sc.nextInt()];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(sumaReda(a,sc.nextInt()));
	
	}
	static int sumaReda(int[][] a, int n) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum+=a[i][n];
		}
		return sum;
	}
}
