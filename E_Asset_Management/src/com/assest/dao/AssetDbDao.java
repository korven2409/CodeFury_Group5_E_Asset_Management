package com.assest.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.asset.beans.Asset;
import com.asset.beans.User;
import com.asset.helper.JdbcConnectorFactory;


public class AssetDbDao implements IAssetDbDao {
	Connection connection=null;
	@Override
	public boolean save(User user) throws ClassNotFoundException, SQLException {
		boolean result = false;
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/e_asset_management?autoReconnect=true&useSSL=false";
//		String sql;
		//Class.forName(driver);
		//Connection conn = DriverManager.getConnection(url,"root","root");
		connection=JdbcConnectorFactory.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("insert into user(`Name`,`Role`,`Telephone`,`Email`,`UserName`,`Password`) values(?,?,?,?,?,?)");
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getRole());
		pstmt.setString(3, user.getPhone());
		pstmt.setString(4, user.getEmail());
		pstmt.setString(5, user.getUserName());
		pstmt.setString(6, user.getPassword());
		if(pstmt.executeUpdate()==1) {
			System.out.println("Success");
			result = true;
		}
		connection=null;
		return result;
	}
	
	
	
	@Override
	public User findByUserName(String uname) throws SQLException {
		User user = null;
		connection=JdbcConnectorFactory.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select* from user where `UserName` =(?)");
		pstmt.setString(1, uname);
		int id;
		String name;
		String role;
		String phone;
		String email;
		String username;
		String password;
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			id = rs.getInt("Id");
			name = rs.getString("Name");
			role = rs.getString("Role");
			phone = rs.getString("Telephone");
			email = rs.getString("Email");
			username = rs.getString("UserName");
			password = rs.getString("Password");
			user = new User(id,name, role, phone, email, username, password);
		}
		
		return user;
	}



	@Override
	public List<Asset> showAllAssets() throws SQLException {
		List<Asset> assetList = new ArrayList<Asset>();
		Asset asset = null;
		connection=JdbcConnectorFactory.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("select* from asset");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			asset = new Asset();
			asset.setId(rs.getInt(1));
			asset.setName(rs.getString(2));
			asset.setType(rs.getString(3));
			asset.setDescription(rs.getString(4));
			asset.setDate(rs.getString(5));
			asset.setIsAvailable(rs.getString(6));
			asset.setLendingTime(rs.getString(7));
			asset.setFinePrice(rs.getInt(8));
			asset.setBanPenalty(rs.getString(9));
			assetList.add(asset);
		}
		
		
		return assetList;
	}



	@Override
	public boolean saveAsset(Asset asset) throws SQLException {
		boolean result = false;
		connection = JdbcConnectorFactory.getConnection();
		PreparedStatement pstmt = connection.prepareStatement("insert into asset(`Name`,`Type`,`Description`,`Date Added`,`isAvailable`,`lending time`,`fine price`,`ban penalty`) values(?,?,?,?,?,?,?,?)");
		pstmt.setString(1, asset.getName());
		pstmt.setString(2, asset.getType());
		pstmt.setString(3, asset.getDescription());
		pstmt.setString(4, asset.getDate());
		pstmt.setString(5, asset.getIsAvailable());
		pstmt.setString(6, asset.getLendingTime());
		pstmt.setInt(7, asset.getFinePrice());
		pstmt.setString(8, asset.getBanPenalty());
		if(pstmt.executeUpdate()==1){
			System.out.println("Success");
			result=true;
		}
		connection=null;
		return false;
	}

}
