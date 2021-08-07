import java.sql.*;
public class metadata {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		String query="select * from students";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement stmt=con.prepareStatement("Select * from students");
			ResultSet result=stmt.executeQuery(query);
			ResultSetMetaData r=result.getMetaData();
			System.out.println("No of Columns : "+r.getColumnCount());
			System.out.println("Column Type Name : "+r.getColumnTypeName(2));
			for(int i=1;i<=r.getColumnCount();i++)
				System.out.println("Column Name "+i+": "+r.getColumnName(i));
			System.out.println("Display Size of the column : "+r.getColumnDisplaySize(1));
			System.out.println("Column Type : "+r.getColumnType(2));
			System.out.println("Column Label : "+r.getColumnLabel(2));
		}
		catch (SQLException e) {
		      e.printStackTrace();
		    }
	}
}
