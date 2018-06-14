package com.github.stai02.semestralka2.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static boolean validate(String param, String co) {                 
		boolean status=false;  
		System.out.println(param);
		System.out.println(co);
		
		switch(param) {
			case "telephonee": {
				String TELEPHONE_PATTERN="^\\+42\\d{10}$";
				Pattern pattern = Pattern.compile(TELEPHONE_PATTERN);
				Matcher matcher=pattern.matcher(co);
				if(matcher.matches()){
	           status=true;}
	       else{
	           status=false;}
				    
		}
			
			case "namee":{
				
				String NAME_PATTERN="^[A-Za-z]$";
				Pattern pattern = Pattern.compile(NAME_PATTERN);
				Matcher matcher=pattern.matcher(co);
				if(matcher.matches()){
	           status=true;}
	       else{
	           status=false;}
				
			}
		
		}
		
	return status;
	}
}
