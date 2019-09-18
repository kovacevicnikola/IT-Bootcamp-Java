package paketCetiri;

import java.util.Scanner;

public class Compress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(compress(sc.nextLine()));
	}
	static String compress(String a) {
		char current='1',current2='2';
		String sum="";
		int ct=0;
		int i;
		for (i=0; i<a.length(); i++) {
			if(i%2!=0) current = a.charAt(i);
			else current2 = a.charAt(i);
			
			if (current==current2) ct+=1;
			
			else if (current!=current2&&ct<4) {
				for (int j=0;j<ct;j++) {
					
					if (i%2!=0)sum+=current2;
					else sum+=current;
				}
				ct=1;
			}
			else if (current!=current2&&ct>3) {
				if (i%2!=0) sum+=current2;
				else sum+=current;
				sum+="("+ct+")";
				ct=1;
			}
		}
		if (i%2==0) {
			for (i=0; i<ct; i++) {
				sum+=current2;
			}
		}
		else 
			{for (i=0; i<ct; i++) {
			sum+=current;
		}}
		return sum;
	}
}
