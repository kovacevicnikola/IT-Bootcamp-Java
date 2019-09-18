package paketX;

public class Test {

	public static void main(String[] args) {
		Pravougaonik x = new Pravougaonik(2, "x");
		Pravougaonik y = new Pravougaonik(2, 3, "y");
		System.out.println(x.getA() + " " + x.getB());
		System.out.println(y.getA() + " " + y.getB());
		x.ispisiPravougaonik();
		y.ispisiPravougaonik();
		

	}

}
