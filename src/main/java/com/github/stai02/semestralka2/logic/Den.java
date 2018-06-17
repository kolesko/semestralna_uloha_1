package com.github.stai02.semestralka2.logic;

import java.util.Collection;

// TODO: Auto-generated Javadoc
/**
 * The Class Den - constains the days of the week, timetable
 *
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */
public class Den {

	/** The den V tydnu. */
	private String denVTydnu;
	
	/** The timetable. */
	private Collection<Timetable> timetable;

	/** The time. */
	private Collection<Time> time;

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public Collection<Time> getCas() {
		return time;
	}

	/**
	 * Sets the time.
	 *
	 * @param the time collection
	 * 
	 */
	public void setCas(Collection<Time> time) {
		this.time=time;

	}
	
	/**
	 * Sets the denVTydnu.
	 *
	 * @param denVTydnu String
	 * 
	 */
	public void setDenVTydnu(String denVTydnu) {
		this.denVTydnu=denVTydnu;

	}
	
	/**
	 * Gets the denVTydnu as a String.
	 *
	 * @return the denVTydnu
	 */
	public String getDenVTydnu() {
		return denVTydnu;
	}
	
	
	/**
	 * Sets the timetable.
	 *
	 * @param the timetable collection
	 * 
	 */
	public void setTimetable(Collection<Timetable> timetable) {
		this.timetable=timetable;

	}
	
	/**
	 * Gets the timetable.
	 *
	 * @return the timetable
	 */
	public Collection<Timetable> getTimetable(){
		return timetable;
	}

	
}
