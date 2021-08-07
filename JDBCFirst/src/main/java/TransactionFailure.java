import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class TransactionFailure {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		//String query="insert into students(Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank)values(?, ?, ?, ?, ?, ?)";
		String query1="update students SET First_Name=? where Student_ID=?";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successful...");
			//Transaction setting AutoCommit as False
		    con.setAutoCommit(false);
		    System.out.println("Successfully Connected");
			//update command
			PreparedStatement stmt1 = con.prepareStatement(query1);
		    stmt1.setString(1, "karan");//1st question mark -> First Name = Rajesh
		    stmt1.setInt(2, 6);
		    stmt1.executeUpdate();
		    //rollback
		    con.rollback();
		    System.out.println("Transaction failure");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

