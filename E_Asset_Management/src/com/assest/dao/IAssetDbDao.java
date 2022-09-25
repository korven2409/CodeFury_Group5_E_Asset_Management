package com.assest.dao;

import java.sql.SQLException;
import java.util.List;

import com.asset.beans.Asset;
import com.asset.beans.User;

public interface IAssetDbDao {
	boolean save(User user) throws ClassNotFoundException, SQLException;
	public User findByUserName(String uname) throws SQLException;
	public List<Asset> showAllAssets() throws SQLException;
	boolean saveAsset(Asset asset) throws SQLException;
}
