package com.github.stai02.semestralka2.logic;


// TODO: Auto-generated Javadoc
/**
 * The Class Person.
 */
public class Person {

	/** The i D. */
	private int iD;
	
	/** The meno. */
	private String meno;
	
	/** The priezvisko. */
	private String priezvisko;
	
	/** The kontakt. */
	private String kontakt;
	
	/** The person. */
	private Person person;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getID() {
		return iD;
	}

	/**
	 * Gets the meno.
	 *
	 * @return the meno
	 */
	public String getMeno() {
		return meno;
	}

	/**
	 * Gets the priezvisko.
	 *
	 * @return the priezvisko
	 */
	public String getPriezvisko() {
		return priezvisko;
	}

	/**
	 * Gets the kontakt.
	 *
	 * @return the kontakt
	 */
	public String getKontakt() {
		return kontakt;
	}

	/**
	 * Vyhladat.
	 *
	 * @param ID the id
	 * @return the string
	 */
	public String vyhladat(int ID) {
		// TODO
		return meno;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param iD the new id
	 */
	public void setID(int iD) {
		this.iD=iD;
	}
	
	/**
	 * Sets the meno.
	 *
	 * @param meno the new meno
	 */
	public void setMeno(String meno) {
		this.meno=meno;
	}
	
	/**
	 * Sets the priezvisko.
	 *
	 * @param priezvisko the new priezvisko
	 */
	public void setPriezvisko(String priezvisko) {
		this.priezvisko=priezvisko;
	}
	
	/**
	 * Sets the kontakt.
	 *
	 * @param kontakt the new kontakt
	 */
	public void setKontakt(String kontakt) {
		this.kontakt=kontakt;
	}

}
