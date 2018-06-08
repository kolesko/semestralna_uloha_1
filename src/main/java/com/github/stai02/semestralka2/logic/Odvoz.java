package com.github.stai02.semestralka2.logic;

public class Odvoz {

	private int ID;
	private String miestoZ;
	private String miestoKam;
	private boolean ideKlient;
	private int cas;
	private Auto auto;
	private Vodič vodič;
	
	public Odvoz(String miestoZ, String miestoKam, boolean ideKlient, int cas, Auto auto, Vodič vodič) {
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
		zapisOdvozDoDb();
	}
	
	public int getID() {
		return ID;
	}

	public String getMiestoZ() {
		return miestoZ;
	}

	public String getMiestoKam() {
		return miestoKam;
	}

	public boolean getIdeKlient() {
		return ideKlient;
	}

	public int getCas() {
		return cas;
	}

	public String vyhladat(int ID) {
		/*
		 * select do db cez ID
		 */
		return "vrateny string z DB";
	}

	private void zapisOdvozDoDb() {
	     /*
	      * insert vytvoreneho odvozu do db
	      */
	}
}
