package titlovi;

public class Test {

	public static void main(String[] args) throws Exception {
		switch (args[0]) {
		case "2":
			SubRip x = new SubRip(args[1], args[2]);
			x.load();
			x.srtToDVD();
			System.out.println("End of conversion");
			break;
		case "4": 
			SubRip z = new SubRip(args[1], args[2]);
			z.load();
			z.dvdToSrt();
			System.out.println("End of conversion");
	}
	}
}
