import java.sql.*;
public class callablestatements {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		//String query="insert into students(Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank)values(?, ?, ?, ?, ?, ?)";
		//String query1="update students SET First_Name=? where Student_ID=?";
		try {
			System.out.println("shit Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successful...");
			CallableStatement stmt=con.prepareCall("{call Proc5(?,?,?)}");
			//insert values into the tables
		    stmt.setInt(1, 1);
		    stmt.setString(2, "Ajith");
		    stmt.setString(3, "Hyderabad");
		    stmt.execute();
		    stmt.setInt(1, 2);
		    stmt.setString(2, "Arnavi");
		    stmt.setString(3, "Vijaywada");
		    stmt.execute();
		    stmt.setInt(1, 3);
		    stmt.setString(2, "Srinidhi");
		    stmt.setString(3, "Itanagar");
		    stmt.execute();
		    stmt.setInt(1, 4);
		    stmt.setString(2, "Nithya");
		    stmt.setString(3, "Mumbai");
		    stmt.execute();
		    stmt.setInt(1, 5);
		    stmt.setString(2, "Nikhila");
		    stmt.setString(3, "Lucknow");
		    stmt.execute();
		    System.out.println("Success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

