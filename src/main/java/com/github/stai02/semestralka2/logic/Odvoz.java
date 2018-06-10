package com.github.stai02.semestralka2.logic;

// TODO: Auto-generated Javadoc
/**
 *  Class Order - contains order details.
 *
 *@author     Lenka Šťastná, Ivana Stanová, Julia Loseeva, Matej Kolesár
 *@version    1.0
 *@created    June 2018
 */
public class Odvoz {

	/** The id. */
	private int ID;
	
	/** The miesto Z. */
	private String miestoZ;
	
	/** The miesto kam. */
	private String miestoKam;
	
	/** The ide klient. */
	private boolean ideKlient;
	
	/** The cas. */
	private int cas;
	
	/** The auto. */
	private Auto auto;
	
	/** The vodič. */
	private Vodič vodič;
	
	/** The klient. */
	private Klient klient;
	
	/**
	 *  Creates an order based on given parameters and writes created order to database.
	 *
	 * @param miestoZ the miesto Z
	 * @param miestoKam the miesto kam
	 * @param ideKlient the ide klient
	 * @param cas the cas
	 * @param auto the auto
	 * @param vodič the vodič
	 * @param klient the klient
	 */	
	public Odvoz(String miestoZ, String miestoKam, boolean ideKlient, int cas, Auto auto, Vodič vodič, Klient klient) {
		/*
		 * select posledneho id z DB
		 */
		int dbid = 0;
		this.ID = dbid;
		this.miestoZ = miestoZ;
		this.miestoKam = miestoKam;
		this.ideKlient = ideKlient;
		this.cas = cas;
		this.auto = auto;
		this.vodič = vodič;
		this.klient = klient;
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
	 *
	 * @param id the new id
	 */
	public void setID(int id) {
		this.ID = id;
	}

	/**
	 * This method returns the place .
	 *
	 * @return miestoZ
	 */
	public String getMiestoZ() {
		return miestoZ;
	}

	/**
	 * Gets the miesto kam.
	 *
	 * @return miestoKam
	 */
	public String getMiestoKam() {
		return miestoKam;
	}

	/**
	 * Gets the ide klient.
	 *
	 * @return the ide klient
	 */
	public boolean getIdeKlient() {
		return ideKlient;
	}

	/**
	 * Gets the cas.
	 *
	 * @return the cas
	 */
	public int getCas() {
		return cas;
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