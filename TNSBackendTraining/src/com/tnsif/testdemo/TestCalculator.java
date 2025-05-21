package com.tnsif.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {

//Addition
	@Test
	public void testForAdd() {
		Assertions.assertEquals(8,Calculator.add(5,3));
	}
	@Test
	public void testForSub() {
		Assertions.assertEquals(2,Calculator.sub(5,3));
	}
}
