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
	 * Get place from and to the transportation is set
	 * 
	 * @return place 
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * Get clientGoes, if client is transported
	 * 
	 * 
	 * @return clientGoes 
	 */
	public String getClientGoes() {
		return clientGoes;
	}

	/**
	 * Get Date of the transportation
	 * 
	 * @return Date of the transportation
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
	 * Get the car´s ID 
	 * 
	 * @return carId 
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
	 * Sets the date of the transportation
	 *
	 * @param Date the new date of transportation
	 */
	public void setDate(Collection<Date> date) {
		this.date=date;
	}
	/**
	 * Sets the time of the trasportation
	 *
	 * @param time the new time of transportation
	 */
	public void setTime(String time) {
		this.time=time;
	}
	/**
	 * Sets the place
	 *
	 * @param place the new place from and to client wants to go
	 */
	public void setPlace(String place) {
		this.place=place;
	}
	/**
	 * Sets if the client goes in the car
	 *
	 * @param clientGoes the new clientGoes
	 */
	public void setClientGoes(String clientGoes) {
		this.clientGoes=clientGoes;
	}
	}
