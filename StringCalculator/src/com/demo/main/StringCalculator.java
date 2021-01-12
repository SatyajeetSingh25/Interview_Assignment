package com.demo.main;

public class StringCalculator {
	public static int add(String numbers) {
		// removing the delimiter and storing in a String array.
		String[] numbersArray = numbers.split(",");
		int result = 0;
		for (String number : numbersArray) {

			// Checking whether input is valid number or not.
			result += Integer.parseInt(number);
		}
		return result;
	}

}
