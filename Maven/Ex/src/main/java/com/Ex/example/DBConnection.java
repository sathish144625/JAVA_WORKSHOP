package com.Ex.example;
import java.sql.Connection;
import java.sql.*;

public class DBConnection extends EndUser {
	private static String driverName = "com.mysql.jdbc.Driver";//mysql database driver
	private static String userName = "root";//Database user name
	private static String userPwd = "";//Database password
	private static String dbName = "log";//Database name
	
	public static Connection getDBConnection() {
		
		String url1 = "jdbc:mysql://localhost/log";
		String url2 = "?user="+userName+"&password="+userPwd;
		String url3 = "&useUnicode=true&characterEncoding=utf-8";
		String url = url1+url2+url3; //Form database connection word
		Connection con = null;
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	0}
	
	//Close resource objects of database connection
	public static void closeDB(Connection con,PreparedStatement pstm,ResultSet rs) {
		if(rs != null) try{
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(pstm != null) try {
			pstm.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(con != null) try{
		     con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}