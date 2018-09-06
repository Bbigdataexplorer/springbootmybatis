package com.example.springbootmybatis.model;

public class UserInfo {
	private int id;
	private String username;
	private int password;
	private int d_id;

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password=" + password +
				", d_id=" + d_id +
				'}';
	}
}
