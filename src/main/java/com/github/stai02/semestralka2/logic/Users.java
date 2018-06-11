/**
 * 
 */
package com.github.stai02.semestralka2.logic;

import java.util.HashMap;

/**
 * The Class User - contains
 * 
 * @author Matej Kolesár, Lenka Šťastná, Ivana Stanová, Julia Loseeva
 * @version June 2018
 */
public class Users {
	
	private String username;
	private String password;
	private HashMap<String, String> userList = new HashMap<String, String>();
	
	public void User(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void addUser(String username, String password) {
		userList.put(username, password);
	}
	
	public void removeUser(String username) {
		if (userList.containsKey(username)) {
			userList.remove(username);
		}
	}
}
