package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","root", "Sravan@18");
			Statement st = con.createStatement();
			
			int rSet = st.executeUpdate("update customers set balance = 80000 where customerId=2");
			
			if(rSet == 1) {
				System.out.println("UPDATE Successfull...!!");
			}else {
				System.out.println("UPDATE Unsuccessful....!!");
			}
			
			
			st.close();
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR !!!! :: "+e);
		}
	}
}
