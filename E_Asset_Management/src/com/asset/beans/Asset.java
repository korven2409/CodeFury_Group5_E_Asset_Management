package com.asset.beans;

import java.sql.Date;

public class Asset {
	int id;
	String name;
	String type;
	String description;
	String date;
	String isAvailable;
	String lendingTime;
	int finePrice;
	String banPenalty;
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Asset(int id, String name, String type, String description, String date, String isAvailable,
			String lendingTime, int finePrice, String banPenalty) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
		this.date = date;
		this.isAvailable = isAvailable;
		this.lendingTime = lendingTime;
		this.finePrice = finePrice;
		this.banPenalty = banPenalty;
	}
	
//	public Asset(int id, String name, String type, String description, String date, String isAvailable) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.type = type;
//		this.description = description;
//		this.date = date;
//		this.isAvailable = isAvailable;
//	}
	public int getId() {
		return id;
	}
	public String getLendingTime() {
		return lendingTime;
	}
	public void setLendingTime(String lendingTime) {
		this.lendingTime = lendingTime;
	}
	public int getFinePrice() {
		return finePrice;
	}
	public void setFinePrice(int finePrice) {
		this.finePrice = finePrice;
	}
	public String getBanPenalty() {
		return banPenalty;
	}
	public void setBanPenalty(String banPenalty) {
		this.banPenalty = banPenalty;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Asset [id=" + id + "; name=" + name + "; type=" + type + "; description=" + description + "; date="
				+ date + "; isAvailable=" + isAvailable + "; lendingTime=" + lendingTime + "; finePrice=" + finePrice
				+ "; banPenalty=" + banPenalty + "]";
	}
	public String toJSON() {
		return "{\"id\":"+id+",\"name\":\""+name+"\",\"type\":\""+type+"\",\"description\":\""+description+"\",\"date\":\""+date+"\",\"isAvailable\":\""+isAvailable+"\"}";
	}
}
