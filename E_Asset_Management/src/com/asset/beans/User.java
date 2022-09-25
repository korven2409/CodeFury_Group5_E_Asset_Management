package com.asset.beans;

public class User {
	int id;
	String name;
	String role;
	String phone;
	String email;
	String userName;
	String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id,String name, String role, String phone, String email, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.phone = phone;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + ", phone=" + phone + ", email=" + email
				+ ", userName=" + userName + ", password=" + password + "]";
	}
	
	public String toJSON() {
		return "{\"id\":"+id+",\"name\":\""+name+"\",\"role\":\""+role+"\",\"phone\":\""+phone+"\",\"email\":\""+email+"\",\"userName\":\""+userName+"\",\"password\":\""+password+"\"}";
	}
	
}
