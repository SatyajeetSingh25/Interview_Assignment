package com.demo.main;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	/*
	 * Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
	 */
	public static int add(String numbers) {

		String delimiter = ",|\n";
		String numbersWithoutDelimiter = numbers;
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("//") + 2;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
		}

		// removing the delimiter and storing in a String array.
		String[] numbersArray = numbersWithoutDelimiter.split(delimiter);

		List<Integer> negativeNumbers = new ArrayList<Integer>();

		int result = 0;
		if (numbersArray.length < 2) {
			throw new RuntimeException("Atleast 2 numbers are required");
		}

		for (String number : numbersArray) {

			int toCheckNumberIsNeg = Integer.parseInt(number);

			// Checking whether Number is negative or positive
			if (toCheckNumberIsNeg < 0) {
				negativeNumbers.add(toCheckNumberIsNeg);
			}

			// Checking whether Number is greater then 1000 or not
			if (toCheckNumberIsNeg < 1000)
				result += toCheckNumberIsNeg;
		}
		if (negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
		}
		return result;
	}

}
