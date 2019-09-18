package svetiSava;

public class Main {

	public static void main(String[] args) {
		DBCFudbal db = new DBCFudbal("jdbc:sqlite:C:\\Users\\Dell\\Downloads\\FudbalskiSavez.db");
		db.connect();
		db.brojGolova();
		db.fudbaleriMan();
		db.maxGolova();
		db.sviFudbaleri();
		db.disconnect();

	}

}
