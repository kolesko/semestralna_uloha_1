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

	//TODO
	/** The list of orders assigned to this driver. */
	private ArrayList<Order> order;

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
	 * Sets the type of driving license.
	 *
	 * @param type the new type of driving license 
	 */
	public void setType(char type) {
		this.type = type;
	}
	
	/**
	 * Sets the driver's disposable time.
	 *
	 * @param disposableTime the new disposable time
	 */
	public void getDisposableTime(Rozvrh disposableTime) {
		this.disposableTime = disposableTime;
	}
	
	/**
	 * Sets the driver's timetable
	 * 
	 * @param rozvrh the new timetable
	 */
	public void setRozvrh(Rozvrh rozvrh) {
		this.rozvrh = rozvrh;
	}
	
	//TODO list of orders assigned to the driver
	/**
	 * Gets the list of orders assigned to the driver.
	 *
	 * @param name the driver's name
	 * @return the orders
	 */
	public ArrayList<Order> getObjednavky(String name) {
		return null;
	}
	
}
