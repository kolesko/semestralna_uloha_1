package com.github.stai02.semestralka2.logic;

import java.util.ArrayList;


/**
 * Class Vodič - trieda vodičov/poskytovateľov odvozu, dedia od osoby
 * 
 * Táto trieda je tvorená základnými metódami get a set.
 *
 * @author Lenka Šťastná
 * @version pro školní rok 2017/2018
 */

public class Vodič extends Osoba {

	private char typVP;

	private Rozvrh disponibilnyCas;

	private Odvoz odvoz;

	private Rozvrh rozvrh;

	public void prihlasenie() {

	}

	public ArrayList getObjednavky(String meno) {
		return null;
	}

	public char getTypVP() {
		return 0;
	}

	public Rozvrh getDisponibilnyCas() {
		return null;
	}

}
