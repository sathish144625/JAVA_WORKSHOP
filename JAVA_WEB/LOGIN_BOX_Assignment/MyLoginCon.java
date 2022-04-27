import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyLoginCon {
	public  void connectAndQuery()
	{
		try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/logindb?" + "user=root&password=");
		String name = new String("");
		String pass = new String("");
				
		Statement stmt = conn.createStatement();
		
		ResultSet rs =stmt.executeQuery("select name, password from user");
		
		while(rs.next()) {
			name = rs.getString("Name");
			pass = rs.getString("Password");
		}
	//	if(!request.getParameter("user").equals("")) {
			
   //}
		//conn.close();
		}
		catch(Exception Ex)
		{
			Ex.printStackTrace();
			System.out.println("ERROR" + Ex.getLocalizedMessage());
		}
		finally
		{
			
		}
		
	}

}
