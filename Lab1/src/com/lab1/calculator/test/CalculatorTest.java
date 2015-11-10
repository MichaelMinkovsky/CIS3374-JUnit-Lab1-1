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
	public void addTest() 
	{
		assertEquals(4, calculator.add(2,2));
		assertNotEquals(5, calculator.add(2,2));
		assertTrue(true);
	}
	@Test
	public void multiplyTest() 
	{
		assertEquals(8, calculator.multiply(4,2));
		assertNotEquals(9, calculator.multiply(4,2));
		assertTrue(true);
}
	@Test
	public void divideTest() 
	{
		assertEquals(10, calculator.divide(20,2));
		assertNotEquals(23, calculator.divide(20,2));
		assertTrue(true);
		}
	@Test
	
	public void subtractTest() 
	{	
		assertEquals(2, calculator.subtract(5,3));
		assertNotEquals(7, calculator.subtract(5,3));
		assertTrue(true);
		}
	
	@Test
	public void isEqualTest()
	{
		assertEquals(false, calculator.isEqual(52,8));
		assertEquals(true, calculator.isEqual(8,8));
		assertTrue(true);

	}
	
	
}
