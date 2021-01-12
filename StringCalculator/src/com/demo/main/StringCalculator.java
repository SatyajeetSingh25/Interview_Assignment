package com.demo.main;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	/*
	 * Support different delimiters to change a delimiter, the beginning of the
	 * string will contain a separate line that looks like this:
	 * “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where
	 * the default delimiter is ‘;’ . the first line is optional. all existing
	 * scenarios should still be supported
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
			if (toCheckNumberIsNeg < 0) {
				negativeNumbers.add(toCheckNumberIsNeg);
			}
			result += toCheckNumberIsNeg;
		}
		if (negativeNumbers.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
		}
		return result;
	}

}
