package com.demo.main;

public class StringCalculator {

	/*
	 * Allow the Add method to handle new lines between numbers (instead of commas).
	 * the following input is ok: “1\n2,3” (will equal 6) the following input is NOT
	 * ok: “1,\n” (not need to prove it - just clarifying)
	 */
	public static int add(String numbers) {
		// removing the delimiter and storing in a String array.
		String[] numbersArray = numbers.split(",|\n");
		int result = 0;
		if(numbersArray.length <2)
		{
			throw new RuntimeException("Atleast 2 numbers are required");
		}
		
		for (String number : numbersArray) {

			// Checking whether input is valid number or not.
			result += Integer.parseInt(number);
		}
		return result;
	}

}
