package com.github.stai02.semestralka2.logic;

import java.util.Collection;

/**
 * The Class Client - contains client-specific details, subclass of Person.
 *
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */

public class Client extends Person {

	/** The constructor. */
	public Client(int ID, String name, String surname, String telephone) {
		super(ID, name, surname, telephone);		
	}
		
	/** The car. */
	private Collection<Car> car;

	/**
	 * Zadaj poziadavku.
	 */
	public void zadajPoziadavku() {

	}

}
