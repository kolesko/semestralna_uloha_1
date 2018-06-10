package com.github.stai02.semestralka2.logic;


/**
 * The Class Person - constains basic get and set methods for person details.
 * Superclass of Driver and Client.
 *
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */
public class Person {

	/** The ID. */
	private int ID;
	
	/** The name. */
	private String name;
	
	/** The surname. */
	private String surname;
	
	/** The telephone number. */
	private String telephone;
	
	/** The constructor. */
	protected Person(int ID, String name, String surname, String telephone) {
		this.ID=ID;
		this.name=name;
		this.surname=surname;
		this.telephone=telephone;
	}
	
	/**
	 * Gets the ID.
	 *
	 * @return the ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the surname.
	 *
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Gets the telephone number.
	 *
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Vyhladat.
	 *
	 * @param ID the id
	 * @return the string
	 */
	public String vyhladat(int ID) {
		// TODO
		return name;
	}
	
	/**
	 * Sets the ID.
	 *
	 * @param ID the new ID
	 */
	public void setID(int ID) {
		this.ID=ID;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * Sets the surname.
	 *
	 * @param surname the new surname
	 */
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	/**
	 * Sets the telephone number.
	 *
	 * @param telephone the new telephone number
	 */
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}

}
