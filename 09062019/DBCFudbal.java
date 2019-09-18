package asdf;

import java.sql.*;

public class DBCFudbal {
	String connectionString;
	Connection con;
	public DBCFudbal(String conStr) {
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
	
	public void sviFudbaleri() {
		

		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECt Fudbaler.Ime, Tim.Naziv FROM Fudbaler, Tim WHERE Fudbaler.IdTim=Tim.IdTim");
			while (rs.next()) {
				System.out.println(rs.getString(1)+ " - "+ rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void fudbaleriMan() {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECt Fudbaler.Ime, Tim.Naziv FROM Fudbaler, Tim WHERE Fudbaler.IdTim=Tim.IdTim AND Tim.Naziv=\"Manchester United\"");
			while (rs.next()) {
				System.out.println(rs.getString(1)+ " - "+ rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void brojGolova() {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT Fudbaler.Ime, COUNT(Gol.IdGol) FROM Fudbaler, Gol WHERE Fudbaler.IdFud=Gol.IdGol GROUP BY (Gol.IdFud)");
			while (rs.next()) {
				System.out.println(rs.getString(1)+ " - "+ rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void maxGolova() {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT Fudbaler.Ime, COUNT(Gol.IdGol) FROM Fudbaler, Gol WHERE Fudbaler.IdFud=Gol.IdGol GROUP BY (Gol.IdFud) ORDER BY COUNT(Gol.idGol) DESC LIMIT 1");
			while (rs.next()) {
				System.out.println(rs.getString(1)+ " - "+ rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void zutiCrveni() {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT Fudbaler.Ime,COUNT(CASE WHEN Tip=\"zuti karton\" THEN 1 ELSE NULL END) AS \"Zuti\", COUNT(CASE WHEN Tip=\"crveni karton\" THEN 1 ELSE NULL END) AS \"Crveni\" FROM Karton, Fudbaler WHERE Karton.IdFud=Fudbaler.IdFud GROUP BY (Karton.IdFud)");
			while (rs.next()) {
				System.out.println(rs.getString(1)+ " - "+ rs.getString(2) + " - " + rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void ubaciFud(String ime, String imeT) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT Tim.IdTim FROM Tim WHERE Tim.Naziv="+imeT);
			rs.next();
			int idTim = rs.getInt(1);
			rs = stm.executeQuery("SELECT MAX(Fudbaler.IdFud) FROM Fudbaler");
			rs.next();
			int idFud = rs.getInt(1);
			PreparedStatement ps = con.prepareStatement("INSERT INTO Fudbaler (Ime, IdTim,IdFud) VALUES (?,?,?)");
			ps.setString(1, ime);
			ps.setInt(2, idTim);
			ps.setInt(3, (idFud+1));
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void ubaciTim(String imeTima, String imeMesta) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT MAX(IdTim) FROM Tim");
			rs.next();
			int idTim = rs.getInt(1);
			PreparedStatement ps = con.prepareStatement("INSERT INTO Tim (IdTim, Naziv,Mesto) VALUES (?,?,?)");
			ps.setInt(1, (idTim+1));
			ps.setString(2, imeTima);
			ps.setString(3, imeTima);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void deletThis(int idTima) {
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM Karton WHERE Karton.IdKar=(SELECT Karton.IdKar FROM Karton, Fudbaler WHERE Karton.IdFud=Fudbaler.IdFud AND Fudbaler.IdTim=?);\r\n" + 
					"DELETE FROM Gol WHERE Gol.IdGol=(SELECT Gol.IdGol FROM Gol, Fudbaler WHERE Gol.IdFud=Fudbaler.IdFud AND Fudbaler.IdTim=?);\r\n" + 
					"DELETE FROM Igrao WHERE Igrao.IdFud=(SELECT Fudbaler.IdFud FROM Fudbaler, Tim WHERE Tim.IdTim=?);\r\n" + 
					"DELETE FROM Fudbaler WHERE Fudbaler.IdTim=?;\r\n" + 
					"DELETE FROM Tim WHERE Tim.IdTim=?;");
			ps.setInt(1, idTima);
			ps.setInt(2, idTima);
			ps.setInt(3, idTima);
			ps.setInt(4, idTima);
			ps.setInt(5, idTima);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
