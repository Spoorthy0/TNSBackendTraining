package com.tnsif.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMathOperations {

//positive number	
	@Test
	public void testForPositive() {
			Assertions.assertTrue(MathOperations.positiveNumber(5));
		}
//negative number
	@Test
    public void testForNegative() {
	        Assertions.assertTrue(MathOperations.negativeNumber(-5));
}  

}

