package com.github.stai02.semestralka2.logic;

import java.util.Collection;

// TODO: Auto-generated Javadoc
/**
 * The Class Timetable.
 * 
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */
public class Timetable {


	/** The den. */
	private Collection<Den> den;

	/** The time. */
	private Collection<Time> time;

	/** The driver. */
	private Collection<Driver> driver;

	/**
	 * Sets the den.
	 * 
	 * @param den Collection
	 */
	public void setDen(Collection<Den> den) {
		this.den=den;
	}
	
	/**
	 * Gets the den.
	 * 
	 * @return the den
	 */
	public Collection<Den> getDen() {
         return den;
	}
	
	/**
	 * Sets the time.
	 * 
	 * @param time Collection
	 */
	public void setTime(Collection<Time> time) {
		this.time=time;
	}
	
	/**
	 * Gets the time.
	 * 
	 * @return the time
	 */
	public Collection<Time> getTime() {
         return time;
	}
	
	/**
	 * Sets the driver.
	 * 
	 * @param driver Collection
	 */
	public void setDriver(Collection<Driver> driver) {
		this.driver=driver;
	}
	
	/**
	 * Gets the driver.
	 * 
	 * @return the driver
	 */
	public Collection<Driver> getDriver() {
         return driver;
	}
	
	

}
