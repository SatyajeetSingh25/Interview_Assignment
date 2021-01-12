package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.StringCalculator;

public class StringCalculatorTest {

	//Allow the Add method to handle an unknown amount of numbers
	@Test
	public final void whenNNumberIsTheirThenReturnSum() {
		assertEquals(10, StringCalculator.add("1,2,3,4"));
	}

	@Test(expected = RuntimeException.class)
	public final void whenInvalidNumberThenExceptionIsThrown() {
		StringCalculator.add("W,A");
	}
}
