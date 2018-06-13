package com.github.stai02.semestralka2.logic;

import java.util.Collection;

/**
 * The Class Client - contains client-specific details, subclass of Person.
 *
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */

public class Client extends Person {

	/** The constructor. 
	 * @param ID client´s ID
	 * @param name name of the client
	 * @param surname surname of the client
	 * @param telephone client´s telehone number*/
	public Client(int ID, String name, String surname, String telephone) {
		super(ID, name, surname, telephone);		
	}
		
	/** The collection car. */
	private Collection<Car> car;

}
