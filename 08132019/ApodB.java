package paketCetiri;

public class ApodB {

	public static void main(String[] args) {
		int[] a = {1, 2, 8};
		int[] b = {15, 14, 2, 8, 9, 6, 1};
		if (podskup(a,b)) System.out.println("Podskup");
		else System.out.println("Nije podskup");
	}
	static boolean podskup(int[] a, int[] b) {
		
		for (int i=0;i<a.length;i++) {
			boolean x = false;
			int y = a[i];
			for (int j=0;j<b.length; j++) {
				if (y==b[j]) {x=true; break;}
			}
			if (!x) return false; //ovaj uslov ne radi ako stavim (x==false), i nikako mi nije jasno zasto
		}
		return true;
	}
}
