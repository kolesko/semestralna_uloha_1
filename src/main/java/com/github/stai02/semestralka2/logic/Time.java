package com.github.stai02.semestralka2.logic;

import java.util.Collection;

// TODO: Auto-generated Javadoc
/**
 * The Class Time.
 * 
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */
public class Time {

	/** The cas od. */
	private int casOd;

	/** The cas do. */
	private int casDo;

	/** The timetable. */
	private Timetable timetable;

	/** The den. */
	private Collection<Den> den;

	/**
	 * Gets the cas od.
	 *
	 * @return the casOd
	 */
	public int getCasOd() {
		return casOd;
	}

	/**
	 * Gets the cas do.
	 *
	 * @return the casDo
	 */
	public int getCasDo() {
		return casDo;
	}
	
	/**
	 * Gets the den.
	 *
	 * @return the den
	 */
	public Collection<Den> getDen() {
		return den;
	}
	
	/**
	 * Gets the timetable.
	 *
	 * @return the timetable
	 */
	public Timetable getTimetable() {
		return timetable;
	}
	

	/**
	 * Sets the den.
	 *
	 * @param den the new den
	 */
	public void setDen(Collection<Den> den) {
		this.den=den;
	}

	/**
	 * Sets the timetable.
	 *
	 * @param timetable the new timetable
	 */
	public void setTimetable(Timetable timetable) {
		this.timetable=timetable;
	}

	/**
	 * Sets the cas od.
	 *
	 * @param casOd the new cas od
	 */
	public void setCasOd(int casOd) {
		this.casOd=casOd;
	}
	
	
	/**
	 * Sets the cas do.
	 *
	 * @param casDo the new cas do
	 */
	public void setCasDo(int casDo) {
		this.casDo=casDo;
	}

}
