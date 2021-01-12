package com.demo.test;

import org.junit.Assert;
import org.junit.Test;

import com.demo.main.StringCalculator;

public class StringCalculatorTest {
	
	    @Test
	    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
	        StringCalculator.add("1,2");
	        Assert.assertTrue(true);
	    }
	    @Test(expected = RuntimeException.class)
	    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
	        StringCalculator.add("1,X");
	    }
}
