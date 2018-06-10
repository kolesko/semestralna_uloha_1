package com.github.stai02.semestralka2.logic;

import java.util.ArrayList;


/**
 * The Class Driver - contains driver-specific details, subclass of Person
 * 
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */

public class Driver extends Person {

	/** The type of driving license. */
	private char type;

	/** The the driver's disposable time. */
	private Timetable disposableTime;

	//TODO
	/** The list of orders assigned to this driver. */
	private ArrayList<Order> orders;

	/** The timetable. */
	private Timetable timetable;
	
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
	public Timetable getDisposableTime() {
		return this.disposableTime;
	}
	
	/**
	 * Gets the driver's timetable.
	 * 
	 * @return timetable
	 */
	public Timetable getTimetable() {
		return timetable;
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
	public void getDisposableTime(Timetable disposableTime) {
		this.disposableTime = disposableTime;
	}
	
	/**
	 * Sets the driver's timetable
	 * 
	 * @param timetable the new timetable
	 */
	public void setTimetable(Timetable timetable) {
		this.timetable = timetable;
	}
	
	//TODO list of orders assigned to the driver
	/**
	 * Gets the list of orders assigned to the driver.
	 *
	 * @param name the driver's name
	 * @return the orders
	 */
	public ArrayList<Order> getObjednavky(String name) {
		return orders;
	}
	
	//TODO
	/**
	 * Sets the list of orders assigned to the driver.
	 *
	 * @param orders the new list of orders
	 */
	public void setObjednavky(ArrayList<Order> orders) {
		this.orders=orders;
	}
	
}
