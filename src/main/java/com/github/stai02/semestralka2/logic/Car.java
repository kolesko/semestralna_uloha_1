package com.github.stai02.semestralka2.logic;

/**
 * Class Car - trieda =auto
 * 
 * Základné metoódy get a set.
 *
 * @author Lenka Šťastná
 * @version pro školní rok 2017/2018
 */
public class Car {

	private String SPZ;
	private String typ;
	private String znacka;
	private String model;
	private Client client;
	private Order order;
	
	public Car(String SPZ, String typ, String znacka, String model)
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
	public Client getKlient() {
		return client;
	}
	public Order getOdvoz() {
		return order;
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
	public void setKlient(Client client) {
		this.client=client;
	}
	public void setOdvoz(Order order) {
		this.order=order;
	}
	
	public String vyhladat() {
		return null;
	}
}
