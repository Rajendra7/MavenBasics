package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
private Calculator calculator;
	
	@Before
	public void setup() {
		calculator=new Calculator();
	}
	
	@Test
	public void addTest()
	{
		int actual=50;
		int expected=calculator.add(25,25);
		assertEquals(actual,expected);
	}
	@Test
	public void subtractionTest()
	{
		int actual=0;
		int expected=calculator.Subtraction(25,25);
		assertEquals(actual,expected);
	}
	@Test
	public void multiplicationTest()
	{
		int actual=625;
		int expected=calculator.multiplication(25,25);
		assertEquals(actual,expected);
	}
}
