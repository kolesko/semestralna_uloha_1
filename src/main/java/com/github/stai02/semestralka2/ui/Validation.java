package com.github.stai02.semestralka2.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;




/**
 * The Class Validation - constains the regular expressions of choosen fields.
 *
 * @author Lenka Šťastná, Matej Kolesár, Julia Loseeva, Ivana Stanová
 * @version June 2018
 */
public class Validation {

	public static boolean validate(String param, String co) {                 
		boolean status=false;  
		
		switch(param) {
			case "telephone": {
				if(co.matches("^0042\\d{10}$")){
	           status=true;
	           break;
	           }
	       else{
	           status=false;
	           break;
	           }	
		}
			case "name": {
				if(co.matches("^[A-ZÁÄČĎÉĚÍĽĹŇÓÖŐÔŘŔŠŤÚŮÜŰÝŽ][a-záäčďéěíľĺňóöőôřŕšťúůüűýž]+$")){
	           status=true;
	           break;
	           }
	       else{
	           status=false;
	           break;
	           }	
		}
			
			case "surname": {
				if(co.matches("^[A-ZÁÄČĎÉĚÍĽĹŇÓÖŐÔŘŔŠŤÚŮÜŰÝŽ][a-záäčďéěíľĺňóöőôřŕšťúůüűýž]+$")){
	           status=true;
	           break;
	           }
	       else{
	           status=false;
	           break;
	           }	
		}
			case "timeFrom": {
				if(co.matches("^[0-2]\\d:[0-5]\\d$")){
	           status=true;
	           break;
	           }
	       else{
	           status=false;
	           break;
	           }	
		}
			case "timeTo": {
				if(co.matches("[0-2]\\d:[0-5]\\d$")){
	           status=true;
	           break;
	           }
	       else{
	           status=false;
	           break;
	           }	
		}

			case "brand": {
				if(co.matches("^[A-ZÁÄČĎÉĚÍĽĹŇÓÖŐÔŘŔŠŤÚŮÜŰÝŽ][a-záäčďéěíľĺňóöőôřŕšťúůüűýž]+$")){
	           status=true;
	           break;
	           }
	       else{
	           status=false;
	           break;
	           }	
		}

			case "model": {
				if(co.matches("^[A-ZÁÄČĎÉĚÍĽĹŇÓÖŐÔŘŔŠŤÚŮÜŰÝŽ][a-záäčďéěíľĺňóöőôřŕšťúůüűýž]+$")){
	           status=true;
	           break;
	           }
	       else{
	           status=false;
	           break;
	           }	
		}
					
			
		}
		
		return status;
		
		
	}
}
