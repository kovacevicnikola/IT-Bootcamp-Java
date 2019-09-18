package paketCetiri;

import java.util.Scanner;

public class Tribonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		System.out.println(tribonaci(sc.nextInt()));

	}
	public static int tribonaci(int a) {
		if (a==1||a==2) return 1;
		else if (a==0) return 0;
		else return tribonaci(a-1)+tribonaci(a-2)+tribonaci(a-3);
	}
}
