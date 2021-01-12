package com.demo.main;

public class StringCalculator {
	    public static final void add(final String numbers) {
	    	
	    	//removing the delimiter and storing in a String array.
	        String[] numbersArray = numbers.split(",");
	       
	            for (String number : numbersArray) {
	            	
	            	//Checking whether input is valid number or not.
	                Integer.parseInt(number);
	            }
	        }
	   
	
}
