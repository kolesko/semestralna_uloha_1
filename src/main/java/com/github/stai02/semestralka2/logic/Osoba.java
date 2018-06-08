package com.github.stai02.semestralka2.logic;


public class Osoba {

	private int iD;
	private String meno;
	private String priezvisko;
	private String kontakt;
	private Osoba osoba;
	
	public int getID() {
		return iD;
	}

	public String getMeno() {
		return meno;
	}

	public String getPriezvisko() {
		return priezvisko;
	}

	public String getKontakt() {
		return kontakt;
	}

	public String vyhladat(int ID) {
		// TODO
		return meno;
	}
	
	public void setID(int iD) {
		this.iD=iD;
	}
	
	public void setMeno(String meno) {
		this.meno=meno;
	}
	
	public void setPriezvisko(String priezvisko) {
		this.priezvisko=priezvisko;
	}
	
	public void setKontakt(String kontakt) {
		this.kontakt=kontakt;
	}

}
