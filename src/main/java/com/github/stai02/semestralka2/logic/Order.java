package com.github.stai02.semestralka2.logic;

/**
 *  Class Order - contains order details.
 *
 *@author     Lenka Šťastná, Ivana Stanová, Julia Loseeva, Matej Kolesár
 *@version    1.0
 *@created    June 2018
 */
public class Order {

	private int ID;
	private String miestoZ;
	private String miestoKam;
	private boolean ideKlient;
	private int cas;
	private Car car;
	private Driver driver;
	private Client client;
	
	/**
	 *  Creates an order based on given parameters and writes created order to database.
	 * 
	 * @param miestoZ
	 * @param miestoKam
	 * @param ideKlient
	 * @param cas
	 * @param car
	 * @param driver
	 * @param client
	 */	
	public Order(String miestoZ, String miestoKam, boolean ideKlient, int cas, Car car, Driver driver, Client client) {
		/*
		 * select posledneho id z DB
		 */
		int dbid = 0;
		this.ID = dbid;
		this.miestoZ = miestoZ;
		this.miestoKam = miestoKam;
		this.ideKlient = ideKlient;
		this.cas = cas;
		this.car = car;
		this.driver = driver;
		this.client = client;
		zapisOdvozDoDb();
	}
	
	/**
	 * This methods returns ID of an order. 
	 * 
	 * @return ID of an order
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * This method assigns an ID to the order.
	 * @param id
	 */
	public void setID(int id) {
		this.ID = id;
	}

	/**
	 * This method returns the place from where the ride will take place.
	 * 
	 * @return miestoZ
	 */
	public String getMiestoZ() {
		return miestoZ;
	}

	/**
	 * This method returns t
	 * 
	 * @return miestoKam
	 */
	public String getMiestoKam() {
		return miestoKam;
	}

	/**
	 * 
	 * @return
	 */
	public boolean getIdeKlient() {
		return ideKlient;
	}

	/**
	 * 
	 * @return
	 */
	public int getCas() {
		return cas;
	}

	/**
	 * 
	 * @param ID
	 * @return
	 */
	public String vyhladat(int ID) {
		/*
		 * select do db cez ID
		 */
		return "vrateny string z DB";
	}

	/**
	 * 
	 */
	private void zapisOdvozDoDb() {
	     /*
	      * insert vytvoreneho odvozu do db
	      */
	}
}
