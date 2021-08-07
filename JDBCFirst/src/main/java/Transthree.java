import java.sql.*;
public class Transthree {

	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3306/klh";
		String user="root";
		String password="varudhini1979";
		//String query="insert into students(Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank)values(?, ?, ?, ?, ?, ?)";
		//String query1="update students SET First_Name=? where Student_ID=?";
		try {
			System.out.println("Connecting to Database-KLH"+" "+ url);
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successful...");
			//Transaction setting AutoCommit as False
		    con.setAutoCommit(false);
		    System.out.println("Successfully Connected");
			//update command
			Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery(query);
		    //addbatch
			stmt.addBatch("insert into students values(10,\"CSE\",\"Neil\",\"Shetty\",2002,7)");
			stmt.addBatch("insert into students values(11,\"CSE\",\"Kalyan\",\"Kumar\",2003,8)");
			System.out.println("Transaction Success");
			int[] count = stmt.executeBatch();
			con.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

