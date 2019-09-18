package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Student {
	String connectionString;
	Connection con;
	public Student(String conStr) {
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
	public void dodajStudenta(int indeks,String ime,String prezime,String datumUpisa,String datumRodjenja,String mestoRodjenja){
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into dosije(indeks,ime,prezime,datum_upisa,datum_rodjenja,mesto_rodjenja) values (?,?,?,?,?,?)");
			ps.setInt(1, indeks);
			ps.setString(2, ime);
			ps.setString(3, prezime);
			ps.setString(4, datumUpisa);
			ps.setString(5, datumRodjenja);
			ps.setString(6,mestoRodjenja);
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectPredmete() {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM predmet");
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void selectBeograd() {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM dosije WHERE mesto_rodjenja=\"Beograd\"");
			
			while (rs.next()) {
				
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
			}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	public void selectMesta() {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT mesto_rodjenja FROM dosije WHERE mesto_rodjenja IS NOT NULL");
			
			while (rs.next()) {
				
				System.out.println(rs.getString(1));
			}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	public void select6() {
		try {
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("SELECT naziv FROM predmet WHERE bodovi>6");
		
		while (rs.next()) {
			
			System.out.println(rs.getString(1));
		}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void select15() {
		try {
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("SELECT sifra, naziv FROM predmet WHERE bodovi>8 AND bodovi<15");
		
		while (rs.next()) {
			
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void select76() {
		try {
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("SELECT * FROM ispit WHERE bodovi=81 OR bodovi=76 OR bodovi=59");
		
		while (rs.next()) {
			
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
		}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void dontSelect76() {
		try {
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("SELECT * FROM ispit WHERE NOT bodovi=81 AND NOT bodovi=76 AND NOT bodovi=59");
		
		while (rs.next()) {
			
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
		}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void selectCena() {
		try {
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("SELECT naziv, bodovi*1500 FROM predmet \r\n");
		
		while (rs.next()) {
			
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deletThis() {
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM Ispit WHERE Ocena>10 OR Ocena<5");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateThis(int id, String indeks) {
		try {
			PreparedStatement ps = con.prepareStatement("UPDATE dosije SET datum_rodjenja=? WHERE indeks=?");
			ps.setInt(2, id);
			ps.setString(1, indeks);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
