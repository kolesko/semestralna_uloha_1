package com.github.stai02.semestralka2.logic;

import java.util.ArrayList;


// TODO: Auto-generated Javadoc
/**
 * Class Driver - trieda vodičov/poskytovateľov odvozu, dedia od osoby
 * 
 * Táto trieda je tvorená základnými metódami get a set.
 *
 * @author Lenka Šťastná
 * @version pro školní rok 2017/2018
 */

public class Driver extends Person {

	/** The typ VP. */
	private char typVP;

	/** The disponibilny cas. */
	private Rozvrh disponibilnyCas;

	/** The order. */
	private Order order;

	/** The rozvrh. */
	private Rozvrh rozvrh;

	/**
	 * Prihlasenie.
	 */
	public void prihlasenie() {

	}

	/**
	 * Gets the objednavky.
	 *
	 * @param meno the meno
	 * @return the objednavky
	 */
	public ArrayList getObjednavky(String meno) {
		return null;
	}

	/**
	 * Gets the typ VP.
	 *
	 * @return the typ VP
	 */
	public char getTypVP() {
		return 0;
	}

	/**
	 * Gets the disponibilny cas.
	 *
	 * @return the disponibilny cas
	 */
	public Rozvrh getDisponibilnyCas() {
		return null;
	}

}
