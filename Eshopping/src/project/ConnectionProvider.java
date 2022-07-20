package project;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
	
		public static Connection getCon() {
			Connection con = null;
			
			try {
				String url="jdbc:mysql://localhost:3306/ospjsp";
				String uname="root";
				String pass="Bhavesh@1234";
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url,uname,pass);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return con;
		}
	}

