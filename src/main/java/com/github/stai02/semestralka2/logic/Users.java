/**
 * 
 */
package com.github.stai02.semestralka2.logic;

import java.util.HashMap;

/**
 * The Class User - contains passwords and usernames for database connection
 * 
 * @author Matej Kolesár, Lenka Šťastná, Ivana Stanová, Julia Loseeva
 * @version June 2018
 */
public class Users {
	
	/** The username. */
	private String username;
	/** The password. */
	private String password;
	/** The list of users. */
	private HashMap<String, String> userList = new HashMap<String, String>();
	
	/**
	 * Class User constructor.
	 * 
	 * @param username of a database user
	 * @param password of a database user
	 */
	public void User(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the new username of a database user
	 */
	public void setUsername(String username) {
		this.username=username;
	}
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password of a database user
	 */
	public void setPassword(String password) {
		this.password=password;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	
	public String getPassword() {
		return password;
	}
	
	
	/**
	 * Adding user into the list of users.
	 *
	 * @param username and password
	 */
	
	public void addUser(String username, String password) {
		userList.put(username, password);
	}
	
	/**
	 * Removing user.
	 *
	 * @param removing user from a user list
	 */
	public void removeUser(String username) {
		if (userList.containsKey(username)) {
			userList.remove(username);
		}
	}
}
