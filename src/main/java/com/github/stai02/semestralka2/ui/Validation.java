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
				if(co.matches("^([0-9])+$")){
					System.out.println("jj");
	           status=true;
	           break;
	           }
	       else{
	    	   System.out.println("bb");
	           status=false;
	           break;
	           }	
		}
		}
			
		
		return status;
		
		
	}
}
