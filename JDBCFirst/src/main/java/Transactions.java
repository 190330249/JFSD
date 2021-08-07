import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Transactions {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="insert into students(Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank)values(?, ?, ?, ?, ?, ?)";
		String query1="update students SET First_Name=? where Student_ID=?";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successful...");
			//Transaction setting AutoCommit as False
		      con.setAutoCommit(false);
		      System.out.println("Successfully Connected");
		      
			//inserting values
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, 7);
			stmt.setString(2,"CSE");
			stmt.setString(3,"Arjun");
			stmt.setString(4, "Pandey");
			stmt.setInt(5, 2009);
			stmt.setInt(6, 11);
			stmt.executeUpdate();
			//update command
			PreparedStatement stmt1 = con.prepareStatement(query1);
		    stmt1.setString(1, "Ramesh");//1st question mark -> First Name = Rajesh
		    stmt1.setInt(2, 6);
		    stmt1.executeUpdate();
		    //commit
		    con.commit();
		    System.out.println("Transaction completed successfully!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}