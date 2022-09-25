package com.asset.helper;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectorFactory {
	static Connection conn=null;
	public static Connection getConnection(){
		if(conn==null) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/e_asset_management?autoReconnect=true&useSSL=false";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		return conn;
		
}
}