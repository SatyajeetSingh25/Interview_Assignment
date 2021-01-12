package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.StringCalculator;

public class StringCalculatorTest {

	//Allow the Add method to handle an unknown amount of numbers.
	@Test
	public final void whenNNumberIsTheirThenReturnSum() {
		assertEquals(10, StringCalculator.add("1,2,3,4"));
	}

	//Allow to check the type of input.
	@Test(expected = RuntimeException.class)
	public final void whenInvalidNumberThenExceptionIsThrown() {
		StringCalculator.add("W,A");
	}
	
	//Allow to add numbers if input contains \n in it.
	@Test
	public final void whenNewLineThenReturnSum() {
	    assertEquals(17, StringCalculator.add("12,4\n1"));
	}
	
	//Throw Exception if only one number is Present.
	@Test(expected = RuntimeException.class)
	public final void whenOnlyOneCorrectValueIsPresentThenThrowRuntimeException() {
		StringCalculator.add("1,\n");
	}
	
	
	@Test
	public final void whenMultipleDelimiterThenSeparateNumbersAndFindSum() {
	    assertEquals(3, StringCalculator.add("//;\\n1;2"));
	}
}
