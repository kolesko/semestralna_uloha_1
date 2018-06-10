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
	private String placeFrom;
	
	/** The destination. */
	private String placeTo;
	
	/** Whether the client is also participating. */
	private boolean clientGoes;
	
	/** The time. */
	private int time;
	
	/** The car. */
	private Car car;
	
	/** The driver. */
	private Driver driver;
	
	/** The client. */
	private Client client;
	
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
	public Order(String placeFrom, String placeTo, boolean clientGoes, int time, Car car, Driver driver, Client client) {
		/*
		 * select posledneho id z DB
		 */
		int dbid = 0;
		this.ID = dbid;
		this.placeFrom = placeFrom;
		this.placeTo = placeTo;
		this.clientGoes = clientGoes;
		this.time = time;
		this.car = car;
		this.driver = driver;
		this.client = client;
		zapisOdvozDoDb();
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
	public String getPlaceFrom() {
		return placeFrom;
	}

	/**
	 * Sets the place from where the ride will take place.
	 * 
	 * @param placeFrom the new place from where the ride will take place
	 */
	public void setPlaceFrom(String placeFrom) {
		this.placeFrom= placeFrom ;
	}
	
	/**
	 * Gets the destination.
	 *
	 * @return placeTo
	 */
	public String getPlaceTo() {
		return placeTo;
	}
	
	/**
	 * Sets the destination.
	 *
	 * @param placeTo the new destination
	 */
	public void getPlaceTo(String placeTo) {
		this.placeTo=placeTo;
	}

	/**
	 * Returns whether the client also participates in the ride or not.
	 *
	 * @return the clientGoes
	 */
	public boolean getClientGoes() {
		return clientGoes;
	}

	/**
	 * Sets whether the client also participates in the ride or not.
	 *
	 * @param clientGoes the new value of whether the client also participates in the ride or not
	 */
	public void setClientGoes(boolean clientGoes) {
		this.clientGoes=clientGoes;
	}
	
	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
	
	/**
	 * Sets the time of the order.
	 *
	 * @param time the new time
	 */
	public void setTime(int time) {
		this.time=time;
	}
	
	/**
	 * Gets the car.
	 *
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}
	
	/**
	 * Sets the car.
	 *
	 * @param car the new car
	 */
	public void setCar(Car car) {
		this.car=car;
	}
	
	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	
	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(Client client) {
		this.client=client;
	}
	
	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public Driver getDriver() {
		return driver;
	}
	
	/**
	 * Sets the driver.
	 *
	 * @param driver the new driver
	 */
	public void setDriver(Driver driver) {
		this.driver=driver;
	}

	/**
	 * Vyhladat.
	 *
	 * @param ID the id
	 * @return the string
	 */
	public String vyhladat(int ID) {
		/*
		 * select do db cez ID
		 */
		return "vrateny string z DB";
	}

	/**
	 * Zapis odvoz do db.
	 */
	private void zapisOdvozDoDb() {
	     /*
	      * insert vytvoreneho odvozu do db
	      */
	}
}
