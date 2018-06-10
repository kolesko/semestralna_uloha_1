package com.github.stai02.semestralka2.logic;

// TODO: Auto-generated Javadoc
/**
 * Class Car - constains basic get and set methods for car details.
 *
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */
public class Car {

	/** The spz. */
	private String SPZ;
	
	/** The typ. */
	private String typ;
	
	/** The znacka. */
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
	 * This method returns license plate number.
	 * 
	 * @return license plate number
	 */
	public String getSPZ() {
		return SPZ;
	}

	/**
	 * Gets the typ.
	 *
	 * @return the typ
	 */
	public String getTyp() {
		return typ;
	}
	
	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Gets the znacka.
	 *
	 * @return the znacka
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
	
	/**
	 * Gets the odvoz.
	 *
	 * @return the odvoz
	 */
	public Order getOdvoz() {
		return order;
	}

	/**
	 * Sets the spz.
	 *
	 * @param SPZ the new spz
	 */
	public void setSPZ(String SPZ) {
		this.SPZ=SPZ;
	}

	/**
	 * Sets the typ.
	 *
	 * @param typ the new typ
	 */
	public void setTyp(String typ) {
		this.typ=typ;
	}
	
	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(String model) {
		this.model=model;
	}
	
	/**
	 * Sets the znacka.
	 *
	 * @param znacka the new znacka
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
	
	/**
	 * Sets the odvoz.
	 *
	 * @param order the new odvoz
	 */
	public void setOdvoz(Order order) {
		this.order=order;
	}
	
	/**
	 * Vyhladat.
	 *
	 * @return the string
	 */
	public String vyhladat() {
		return null;
	}
}
