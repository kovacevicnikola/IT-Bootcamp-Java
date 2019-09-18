package pakettri;

import java.util.Random;
import java.util.Scanner;

public class RandomUNizu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		randNiz(a);
		uNizu(a);
	}

	static void randNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int max = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(max);
		}
	}

	static void uNizu(int[] a) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean z = false;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i])
				z = true;

		}
		if (z) System.out.println("U nizu je");
		else System.out.println("Nije u nizu");
	}
}
	
