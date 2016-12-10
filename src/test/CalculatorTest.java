package test;

import main.Calculator;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testSumMethod() throws Exception {
		double a = 4.0;
		double b = 7.0;
		
		double result = classUnderTest.sum(a, b);
		assertEquals(11.0, result, 0.001);
	}
	
	@Test
	public void testSubtractMethod() throws Exception {
		double a = 7.0;
		double b = 4.0;
		
		double result = classUnderTest.subtract(a, b);
		assertEquals(3.0, result, 0.001);
	}
	
	@Test

	public void testMultiplyMethod() throws Exception {
		double a = 4.0;
		double b = 7.0;
		
		double result = classUnderTest.multiply(a, b);
		assertEquals(28.0, result, 0.001);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testDivideMethod() throws Exception {
		double a = 10.0;
		double b = 0.0;
		
		classUnderTest.divide(a, b);
		
		
		
	}

	



}
