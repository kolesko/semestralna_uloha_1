package com.github.stai02.semestralka2.logic;

import java.util.ArrayList;


/**
 * The Class Driver - trieda vodičov/poskytovateľov odvozu, subclass of Person
 * 
 * Táto trieda je tvorená základnými metódami get a set.
 *
 * @author Lenka Šťastná
 * @version pro školní rok 2017/2018
 */

public class Driver extends Person {

	/** The type of driving license. */
	private char type;

	/** The the driver's disposable time. */
	private Rozvrh disposableTime;

	/** The order. */
	private Order order;

	/** The rozvrh. */
	private Rozvrh rozvrh;

	/**
	 * Gets the type of driving license.
	 *
	 * @return the type of driving license
	 */
	public char getType() {
		return this.type;
	}
	
	/**
	 * Gets the driver's disposable time.
	 *
	 * @return the disposable time
	 */
	public Rozvrh getDisposableTime() {
		return this.disposableTime;
	}
	
	/**
	 * Gets the driver's timetable.
	 * 
	 * @return timetable
	 */
	public Rozvrh getRozvrh() {
		return rozvrh;
	}

	/**
	 * 
	 * 
	 * @param rozvrh
	 */
	public void setRozvrh(Rozvrh rozvrh) {
		this.rozvrh = rozvrh;
	}
	
	/**
	 * Gets the objednavky.
	 *
	 * @param name the name
	 * @return the objednavky
	 */
	public ArrayList getObjednavky(String name) {
		return null;
	}
	
	/**
	 * Prihlasenie.
	 */
	public void prihlasenie() {

	}

		

}
