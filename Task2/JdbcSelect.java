package Demo;

import java.sql.*;

public class JdbcSelect {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?useSSL=false","root", "Sravan@18");
			Statement st = con.createStatement();
			ResultSet rSet = st.executeQuery("select * from customers");
			while(rSet.next()) {
				System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+" "+rSet.getInt(3));
				
			}
		
			rSet.close();
			st.close();
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR !!!! :: "+e);
		}
	}
}

