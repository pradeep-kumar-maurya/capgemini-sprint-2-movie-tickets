package com.cap.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column(length = 4)
	private int account_no;
	@Column(length = 20)
	private String name;
	@Column(length = 10)
	private int current_balance;
	@Column(length = 20)
	private String username;
	@Column(length = 15)
	private String password;
	
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrent_balance() {
		return current_balance;
	}
	public void setCurrent_balance(int current_balance) {
		this.current_balance = current_balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
