package com.juaracoding.ddt;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {
	Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator ();
		
	}
	
	@Test
	@FileParameters("src/test/resources/testing2.csv")
	public void testAdd1(int a, int b, int expect) {
		int actual = calculator.add(a, b);
		assertEquals(expect, actual);
	}
	@Test
	public void testAdd2() {
		int actual = calculator.add(-2, -3);
		assertEquals(-5, actual);
	}
	@Test
	public void testAdd3() {
		String s = "s";
		String t = "t";
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(t);
		int actual = calculator.add(a, b);
		assertEquals(1, actual);
	}

}
