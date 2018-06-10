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
	
	/** The contact. */
	private String telephone;
	
	/** The constructor. */
	private Person person;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getname() {
		return name;
	}

	/**
	 * Gets the surname.
	 *
	 * @return the surname
	 */
	public String getsurname() {
		return surname;
	}

	/**
	 * Gets the contact.
	 *
	 * @return the telephone
	 */
	public String gettelephone() {
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
	public void setname(String name) {
		this.name=name;
	}
	
	/**
	 * Sets the surname.
	 *
	 * @param surname the new surname
	 */
	public void setsurname(String surname) {
		this.surname=surname;
	}
	
	/**
	 * Sets the telephone.
	 *
	 * @param telephone the new telephone
	 */
	public void settelephone(String telephone) {
		this.telephone=telephone;
	}

}
