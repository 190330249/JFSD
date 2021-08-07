import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class OperationsScrollableResultSet {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="select * from students";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result=stmt.executeQuery(query);
			//update
			result.absolute(4);
			result.updateString(2, "ECE");
			result.updateRow();
			System.out.println("Updated Successfully!");
			//insert
			result.afterLast();
			result.moveToInsertRow();
			result.updateInt(1, 17);
			result.updateString(2, "CSE");
			result.updateString(3, "Zeba");
			result.updateString(4, "Wasim");
			result.updateInt(5, 2005);
			result.updateInt(6, 15);
			result.insertRow();
			System.out.println("Inserted Successfully!");
			//delete
			result.absolute(13);
			result.deleteRow();
			System.out.println("Deleted Successfully!");
		}
		catch (SQLException e) {
		      e.printStackTrace();
		    }
	}
}
