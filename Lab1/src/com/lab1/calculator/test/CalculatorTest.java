package com.lab1.calculator.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lab1.calculator.Calculator;

public class CalculatorTest {

	private Calculator calculator;
	
	
	@Before
	public void setUp()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2,2));
		assertNotEquals(5, calculator.add(2,2));
		assertEquals(8, calculator.multiply(4,2));
		assertNotEquals(9, calculator.multiply(4,2));
		assertEquals(10, calculator.divide(20,2));
		assertNotEquals(23, calculator.divide(20,2));
		assertEquals(2, calculator.subtract(5,3));
		assertNotEquals(7, calculator.subtract(5,3));
		assertNotEquals(true, calculator.isEqual(10,8));
		
	}
	
}
