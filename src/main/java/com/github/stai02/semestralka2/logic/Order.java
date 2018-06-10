package com.github.stai02.semestralka2.logic;

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
	private String date;
	
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
	public Order(int id,String date, String placeFrom, String placeTo, boolean clientGoes, String timeFrom, String timeTo, String carid) {
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
	 * This method returns the place from where the ride will take place.
	 * 
	 * @return placeFrom 
	 */
	public String getPlace() {
		return place;
	}

	public String getClientGoes() {
		return clientGoes;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getCarid() {
		return carid;
	}
}
