import java.sql.*;
public class databasemetadata {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="select * from students";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			DatabaseMetaData db=con.getMetaData();
			System.out.println("Driver Name : "+db.getDriverName());
			System.out.println("Database version : "+db.getDriverVersion());
			System.out.println("User Name : "+db.getUserName());
			System.out.println("Database Product Name : "+db.getDatabaseProductName());
			System.out.println("Database Product Version : "+db.getDatabaseProductVersion());
		}
		catch (SQLException e) {
		      e.printStackTrace();
		    }
	}
}
