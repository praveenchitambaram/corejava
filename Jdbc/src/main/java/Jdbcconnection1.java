
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.*;

public class Jdbcconnection1 {
	public static void main(String args[]) {
		// update();
		// deletes();
		// DatabaseMetaData();
		// image();
		 RetrieveImage();

	}

	public static void jdbcconnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from employee ");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");

			PreparedStatement stmt = con.prepareStatement("insert into Employee values(?,?,?,?,?)");
			stmt.setInt(1, 10);// 1 specifies the first parameter in the query
			stmt.setString(2, "Ratan");
			stmt.setInt(3, 30000);
			stmt.setInt(4, 2);
			stmt.setString(5, "sales");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void update() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");
			PreparedStatement stmt = con.prepareStatement("update employee set name=? where eno=?");
			stmt.setString(1, "dinesh");// 1 specifies the first parameter in the query i.e. name
			stmt.setInt(2, 10);

			int i = stmt.executeUpdate();
			System.out.println(i + " records updated");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void deletes() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");
			PreparedStatement stmt = con.prepareStatement("delete from employee where eno=?");
			stmt.setInt(1, 10);

			int i = stmt.executeUpdate();
			System.out.println(i + " records deleted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void ResultSetMetaData() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println("Total Columns" + rsmd.getColumnCount());
			System.out.println("Column Name Of 1st Column" + rsmd.getColumnName(2));
			System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void DatabaseMetaData() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");
			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void image() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");

			PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?)");
			ps.setString(1, "Praveen");
			FileInputStream fin = new FileInputStream("d:\\praveen.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void RetrieveImage() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");

			PreparedStatement ps = con.prepareStatement("select * from imgtable");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// now on 1st row

				Blob b = rs.getBlob(2);// 2 means 2nd column data
				byte barr[] = b.getBytes(1, (int) b.length());// 1 means first image

				FileOutputStream fout = new FileOutputStream("d:\\praveen.jpg");
				fout.write(barr);

				fout.close();
			} // end of if
			System.out.println("ok");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void storefile() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"praveen2299");

			PreparedStatement ps = con.prepareStatement("insert into filetable values(?,?)");

			File f = new File("d:\\demo\\test.txt");
			FileReader fr = new FileReader(f);

			ps.setInt(1, 101);
			ps.setCharacterStream(2, fr, (int) f.length());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}