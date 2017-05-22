package com.pawan.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pawan.Calculator;

public class CalculatorTest {

	private static Calculator calc;
	
	@BeforeClass 
	public static void setUpClass(){
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int result = calc.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void testMultiply() {
		int result = calc.multiply(1, 2);
		assertEquals(2, result);
	}

}
