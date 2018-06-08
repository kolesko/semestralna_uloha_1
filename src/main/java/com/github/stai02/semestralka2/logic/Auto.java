package com.github.stai02.semestralka2.logic;

/**
 * Class Auto - trieda =auto
 * 
 * Základné metoódy get a set.
 *
 * @author Lenka Šťastná
 * @version pro školní rok 2017/2018
 */
public class Auto {

	private String SPZ;
	private String typ;
	private String znacka;
	private String model;
	private Klient klient;
	private Odvoz odvoz;
	
	public Auto(String SPZ, String typ, String znacka, String model)
    {
        this.SPZ = SPZ;
        this.typ = typ;
        this.znacka = znacka;
        this.model = model;
    }
	
	public String getSPZ() {
		return SPZ;
	}

	public String getTyp() {
		return typ;
	}
	
	public String getModel() {
		return model;
	}
	public String getZnacka() {
		return znacka;
	}
	public Klient getKlient() {
		return klient;
	}
	public Odvoz getOdvoz() {
		return odvoz;
	}

	public void setSPZ(String SPZ) {
		this.SPZ=SPZ;
	}

	public void setTyp(String typ) {
		this.typ=typ;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setZnacka(String znacka) {
		this.znacka=znacka;
	}
	public void setKlient(Klient klient) {
		this.klient=klient;
	}
	public void setOdvoz(Odvoz odvoz) {
		this.odvoz=odvoz;
	}
	
	public String vyhladat() {
		return null;
	}
}
