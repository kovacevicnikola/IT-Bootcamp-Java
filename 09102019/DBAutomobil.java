package prodavnicaAutomobila;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBAutomobil {
	String connectionString;
	Connection con;
	private String currUser;
	public DBAutomobil(String conStr) {
		connectionString = conStr;
	}
	public void connect() {
		try {
			con = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void disconnect() {
		try {
			if (con!=null&&!con.isClosed()) con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean validator(String s) {
		for (char el: s.toCharArray()) {
			if (el==' ') {System.out.println("Bez razmaka");return false;}
		}
		return true;
	}
	
	public boolean login(String user, String pass) {
		
		if (validator(user)&&validator(pass)) {
			try {
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("SELECT * FROM Korisnik WHERE username=\""+user+"\" AND password=\""+pass+"\"");
				if (rs.next()!=false) {this.currUser=user; return true;}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		return false;
	}
	public boolean register(String user, String pass) {
		if (validator(user)&&validator(pass)) {
			try {
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("SELECT * FROM Korisnik WHERE username=\""+user+"\"");
				if (rs.next()==false) {
					PreparedStatement ps = con.prepareStatement("INSERT INTO Korisnik (Username, Password) VALUES (?, ?);");
					ps.setString(1, user);
					ps.setString(2, pass);
					ps.execute();
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	public boolean uplata() {
		Scanner sc = new Scanner(System.in);
		try {
			int sum=0;
			int cena=0;
			int id=0;
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT Automobil.IdAuto, Automobil.cena, Uplata.iznos FROM Automobil, Uplata, Prodaja WHERE Automobil.IdAuto=Uplata.IdAuto AND Prodaja.Username=\""+this.currUser+"\";");
			while (rs.next()) {
				sum+=rs.getInt(3);
				cena=rs.getInt(2);
				id = rs.getInt(1);
			}
			rs = stm.executeQuery("SELECT Automobil.IdAuto, Automobil.cena, Uplata.iznos FROM Automobil, Uplata, Prodaja WHERE Automobil.IdAuto=Uplata.IdAuto AND Prodaja.username=\""+this.currUser+"\";");
			while (rs.next()) {
				System.out.println("Automobil ID " + rs.getInt(1) + " uplaceno: " + rs.getInt(3) + "/" + rs.getInt(2));
			}
			System.out.println("Unesite iznos uplate");
			int upl = Integer.parseInt(sc.nextLine());
			if (upl+sum<=cena) {
			PreparedStatement ps = con.prepareStatement("INSERT INTO Uplata (IdAuto, Iznos, Datum) VALUES (?,?,?)");
			ps.setInt(1, id);
			ps.setInt(2, upl);
			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			ps.execute();
			System.out.println("Uplata uspesna, trenutno stanje je "+(upl+sum)+"/"+cena); 
			return true;}
			else {
				PreparedStatement ps = con.prepareStatement("INSERT INTO Uplata (IdAuto, Iznos, Datum) VALUES (?,?,?)");
				ps.setInt(1, id);
				ps.setInt(2, (upl+sum-cena));
				ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
				ps.execute();
				System.out.println("Kusur je "+ (upl+sum-cena));
				return true;
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean kupovina() {
		Scanner sc = new Scanner(System.in);
		Statement stm;
		try {
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT Automobil.IdAuto, Automobil.cena, Automobil.idModel FROM Nabavka, Automobil, Prodaja WHERE Automobil.IdAuto=Nabavka.IdAuto AND Automobil.IdAuto!=prodaja.IdAuto");
			while (rs.next()) {
				System.out.println("ID " + rs.getInt(1) + " cena " + rs.getInt(2));
			}
			System.out.println("Unesite ID automobila za kupovinu");
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO Prodaja (IdAuto, username, Datum) VALUES (?,?,?)");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ps.setString(2, this.currUser);
			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			ps.execute();
			stm = con.createStatement();
			stm.execute("UPDATE Model SET BrProdatih=BrProdatih+1 WHERE idModel=(SELECT IdModel FROM Automobil WHERE IdAuto="+id+")");
			System.out.println("Kupovina uspesna");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
