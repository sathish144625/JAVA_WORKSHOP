import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.IOException;



public class myDBCon {
	
	public  void connectAndQuery()
	{
		try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ebookshop?" + "user=root&password=");
				
		Statement stmt = conn.createStatement();
		
		boolean  s =  stmt.execute("insert into books values(1007,'java books to book','java',77.77,77)");
		
		
		
		
		}
		catch(Exception Ex)
		{
			Ex.printStackTrace();
			System.out.println("ERROR IN MYDBCON CLASS " + Ex.getLocalizedMessage());
		}
		finally
		{
			
		}
		
	}
	
	

}
