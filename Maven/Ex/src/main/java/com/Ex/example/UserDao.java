package com.Ex.example;
import java.sql.Connection;
import java.sql.*;



public class UserDao extends DBConnection{
	public int save(EndUser user) {
		//How to insert a user into the database
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = DBConnection.getDBConnection();
		int row = 0;
		String sql = "insert into user(userName,userPassword,userRealName) values(?,?,?)";
		try {
			EndUser en = new EndUser();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserRealName());
			row = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.closeDB(con, pstmt, rs);
		}
		return row;
	}
	
	public EndUser find(EndUser user) {
		//Find a user from the database to verify registration
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DBConnection.getDBConnection();
		EndUser user2 = null;
		String sql = "select * from user where userName=? and userPassword=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getUserPassword());
			rs = pstmt.executeQuery();
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.closeDB(con, pstmt, rs);
		}
		return user2;
	}

}
