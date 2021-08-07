import java.sql.*;
public class jdbcprpdstmt {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="insert into students(Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank)values(?, ?, ?, ?, ?, ?)";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successful...");
			//inserting values
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, 6);
			stmt.setString(2,"CSE");
			stmt.setString(3,"karan");
			stmt.setString(4, "Thapar");
			stmt.setInt(5, 2010);
			stmt.setInt(6, 10);
			int records = stmt.executeUpdate();
		    System.out.println(String.format("Records affected", records));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
