package com.pawan.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pawan.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int result = calc.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		int result = calc.multiply(1, 2);
		assertEquals(2, result);
	}

}
