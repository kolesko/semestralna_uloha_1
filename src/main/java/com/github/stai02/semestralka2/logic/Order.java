package com.github.stai02.semestralka2.logic;

import java.sql.Date;
import java.util.Collection;

/**
 *  Class Order - contains order details.
 *
 *@author     Lenka Šťastná, Ivana Stanová, Julia Loseeva, Matej Kolesár
 *@version    1.0
 *@created    June 2018
 */
public class Order {

	/** The ID. */
	private int ID;
	
	/** The place from which the ride will take place. */
	private String place;
	
	/** Whether the client is also participating. */
	private String clientGoes;
	
	/** The date. */
	private  Collection<Date> date;
	
	/** The time. */
	private String time;
	
	/** The car. */
	private String carid;
	
	/** The driver. */
	private int driverid;
	
	/** The client. */
	private int clientid;
	
	/**
	 *  Creates an order based on given parameters and writes created order to database.
	 *
	 * @param placeFrom the miesto Z
	 * @param placeTo the destination
	 * @param clientGoes whether the client is also participating
	 * @param time the time
	 * @param car the car
	 * @param driver the driver
	 * @param client the client
	 */	
	public Order(int id, Collection<Date> date, String placeFrom, String placeTo, boolean clientGoes, String timeFrom, String timeTo, String carid) {
		this.ID = id;
		this.date = date;
		this.time = timeFrom + "-" + timeTo;
		this.place = placeFrom + "-" + placeTo;
		if (clientGoes == true) {
			this.clientGoes = "Yes";
		} else this.clientGoes = "No";
		this.carid = carid;
		//this.driverid = driverid;
		//this.clientid = clientid;
	}
	
	/**
	 * Gets the ID of an order. 
	 * 
	 * @return ID of an order
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * Sets an ID to the order.
	 *
	 * @param id the new ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * Get place 
	 * This method returns the place from where the ride will take place.
	 * 
	 * @return placeFrom 
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * Get place 
	 * This method returns the place from where the ride will take place.
	 * 
	 * @return placeFrom 
	 */
	public String getClientGoes() {
		return clientGoes;
	}

	/**
	 * Get Date 
	 * 
	 * @return Date 
	 */
	public Collection<Date> getDate() {
		return date;
	}

	/**
	 * Get time 
	 * 
	 * @return time 
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Get place 
	 * This method returns the place from where the ride will take place.
	 * 
	 * @return placeFrom 
	 */
	public String getCarid() {
		return carid;
	}
	
	/**
	 * Sets the car´sID
	 *
	 * @param Carid the new car´sId
	 */
	public void setCarid(String carid) {
		this.carid=carid;
	}
	/**
	 * Sets the license plate number.
	 *
	 * @param SPZ the new license plate number
	 */
	public void setDate(Collection<Date> date) {
		this.date=date;
	}
	/**
	 * Sets the time.
	 *
	 * @param time the new time
	 */
	public void setTime(String time) {
		this.time=time;
	}
	/**
	 * Sets the license plate number.
	 *
	 * @param SPZ the new license plate number
	 */
	public void setPlace(String place) {
		this.place=place;
	}
	/**
	 * Sets the license plate number.
	 *
	 * @param SPZ the new license plate number
	 */
	public void setSPZ(String SPZ) {
		this.SPZ=SPZ;
	}
}
