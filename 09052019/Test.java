package jdbc;

import java.sql.Date;
import java.time.LocalDate;

import banka.DBBanka;

public class Test {

	@SuppressWarnings("deprecation")	
	public static void main(String[] args) {
		Student db = new Student("jdbc:sqlite:C:\\Users\\Dell\\Downloads\\studentskabaza.db");
		db.connect();
		db.selectPredmete();
		db.selectBeograd();
		db.selectMesta();
		db.select6();
		db.select15();
		db.select76();
		db.dontSelect76();
		db.selectCena();
		db.deletThis();
		db.disconnect();
	}

}
