import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class deletecommand {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="delete from students where Student_ID=?";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successful...");
			//inserting values
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, 6);
			int records = stmt.executeUpdate();
		    System.out.println(String.format("Records affected", records));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
