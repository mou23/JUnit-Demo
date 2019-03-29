package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ScientificCalculatorTest {
	static ScientificCalculator sc;
	static int a;
	static int b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sc=new ScientificCalculator();
		a=3;
		b=2;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		Assert.assertEquals(5, sc.sum(a, b));
	}

	@Test
	public void testSubstract() {
		Assert.assertEquals(1, sc.substract(a, b));
	}

	@Test
	public void testMultiplication() {
		Assert.assertEquals(6, sc.multiplication(a, b));
	}

	@Test
	public void testDivision() {
		Assert.assertEquals(1, sc.division(a, b));
	}

	@Test
	public void testPower() {
		Assert.assertEquals(9, sc.power(a, b));
	}

	@Test
	public void testSquareRoot() {
		Assert.assertEquals(1.73, sc.squareRoot(a),0.5);
	}

	@Test
	public void testFactorial() {
		Assert.assertEquals(6, sc.factorial(a));
	}

	@Test
	public void testLn() {
		Assert.assertEquals(1.09, sc.ln(a),0.05);
	}

	@Test
	public void testLog() {
		Assert.assertEquals(0.47, sc.log(a),0.05);
	}

	@Test
	public void testSin() {
		Assert.assertEquals(0.1411200080598672, sc.sin(a),0.0005);
	}

	@Test
	public void testCos() {
		Assert.assertEquals(-0.9899924966004454, sc.cos(a),0.0005);
	}

	@Test
	public void testTan() {
		Assert.assertEquals(-0.1425465430742778, sc.tan(a),0.0005);
	}
	
	@Test
	public void testnPr() {
		Assert.assertEquals(6, sc.nPr(a, b));
	}
	
	@Test
	public void testnCr() {
		Assert.assertEquals(3, sc.nCr(a, b));
	}
	
	@Test
	public void testConvertToBinary() {
		Assert.assertEquals("11", sc.convertToBinary(a));
	}
	
	@Test
	public void testConvertToOctal() {
		Assert.assertEquals("17", sc.convertToOctal(15));
	}
	
	@Test
	public void testConvertToHex() {
		Assert.assertEquals("f", sc.convertToHex(15));
	}
	
	@Test
	public void testExponential() {
		Assert.assertEquals(20.085, sc.exponential(a),0.005);
	}
}
