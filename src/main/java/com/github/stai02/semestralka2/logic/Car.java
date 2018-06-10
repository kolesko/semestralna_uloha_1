package com.github.stai02.semestralka2.logic;

/**
 * The Class Car - constains basic get and set methods for car details.
 *
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */
public class Car {

	/** The license plate number. */
	private String SPZ;
	
	/** The type of driving license required to drive this car. */
	private String typ;
	
	/** The brand/manufacturer. */
	private String znacka;
	
	/** The model. */
	private String model;
	
	/** The client. */
	private Client client;
	
	/** The order. */
	private Order order;
	
	/**
	 * Class car constructor.
	 * 
	 * @param SPZ license plate number
	 * @param typ driving license type required to drive this car
	 * @param znacka name of the brand/manufacturer
	 * @param model car model
	 */
	public Car(String SPZ, String typ, String znacka, String model)
    {
        this.SPZ = SPZ;
        this.typ = typ;
        this.znacka = znacka;
        this.model = model;
    }
	
	/**
	 * Gets the license plate number.
	 * 
	 * @return license plate number
	 */
	public String getSPZ() {
		return SPZ;
	}

	/**
	 * Gets the type of driving license required to drive this car.
	 *
	 * @return driving license type required to drive this car
	 */
	public String getTyp() {
		return typ;
	}
	
	/**
	 * Gets the car model.
	 *
	 * @return the car model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Gets the brand/manufacturer name.
	 *
	 * @return the brand/manufacturer name
	 */
	public String getZnacka() {
		return znacka;
	}
	
	/**
	 * Gets the klient.
	 *
	 * @return the klient
	 */
	public Client getKlient() {
		return client;
	}
	
	//TODO Zmenit na List of orders
	
	/**
	 * Gets the order.
	 *
	 * @return the order
	 */
	public Order getOdvoz() {
		return order;
	}

	/**
	 * Sets the license plate number.
	 *
	 * @param SPZ the new license plate number
	 */
	public void setSPZ(String SPZ) {
		this.SPZ=SPZ;
	}

	/**
	 * Sets the type of driving license required to drive this car.
	 *
	 * @param typ the new type of driving license
	 */
	public void setTyp(String typ) {
		this.typ=typ;
	}
	
	/**
	 * Sets the car model.
	 *
	 * @param model the new model
	 */
	public void setModel(String model) {
		this.model=model;
	}
	
	/**
	 * Sets the brand/manufacturer name.
	 *
	 * @param znacka the new brand/manufacturer
	 */
	public void setZnacka(String znacka) {
		this.znacka=znacka;
	}
	
	/**
	 * Sets the klient.
	 *
	 * @param client the new klient
	 */
	public void setKlient(Client client) {
		this.client=client;
	}
	
	// TODO Zmenit na list
	/**
	 * Assigns new list of orders.
	 *
	 * @param order the new list of orders 
	 */
	public void setOdvoz(Order order) {
		this.order=order;
	}
	
	
	
	// TODO 
	/**
	 * Vyhladat.
	 *
	 * @return the string
	 */
	public String vyhladat() {
		return null;
	}
}
