import java.sql.*;
public class jdbconnection {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="select * from students";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next()) {
				System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getInt(5)+" "+result.getInt(6));
			}
			System.out.println("Connection Successful...");
		}
		catch (SQLException e) {
		      e.printStackTrace();
		    }
	}
}
