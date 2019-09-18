package pakettri;

import java.util.Scanner;

public class FaliBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [sc.nextInt()]; 
		unesiNiz(a);
		sortirajNiz(a);
		System.out.println(proveriNiz(a));
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
	static int proveriNiz(int[] a) {
		for (int i=a.length-1;i>0;i--) {
			    for(int j=a.length-2;j>=0;j--) {
			    	if (a[j]!=a[i]+1) {
			    		int num = a[j]-1;
			    		return num;
			    	}
			    }
			    
		}
		return 0;
	}
}
