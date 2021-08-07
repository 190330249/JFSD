import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class updatecommand {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="update students SET First_Name=? where Student_ID=?";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successful...");
			//inserting values
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1, "Nitya");
			stmt.setInt(2, 1);
			int records = stmt.executeUpdate();
		    System.out.println(String.format("Records affected", records));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
