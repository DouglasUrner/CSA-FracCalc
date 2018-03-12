package fracCalc;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

//	@Test
//	public void FractionTestDefaultConstructor() {
//		Fraction f = new Fraction();
//		assertEquals(1, f.denominator);
//	}

	@Test
	public void FractionTestReduce1() {
		Fraction f = new Fraction("40/10");
		assertEquals("4", f.toString(true));
	}

	@Test
	public void FractionTestReduce2() {
		Fraction f = new Fraction("19/3");
		assertEquals("6_1/3", f.toString(true));
	}

	@Test
	public void FractionTestReduce3() {
		Fraction f = new Fraction("5/7");
		assertEquals("5/7", f.toString(true));
	}

	@Test
	public void FractionTestReduce4() {
		Fraction f = new Fraction("42");
		assertEquals("42", f.toString(true));
	}

	@Test
	public void FractionTestIsNegative1() {
		Fraction f = new Fraction("1_2/3");
		assertFalse(f.isNegative());
	}

	@Test
	public void FractionTestIsNegative2() {
		Fraction f = new Fraction("-1_2/3");
		assertTrue(f.isNegative());
	}

	@Test
	public void FractionTestWhole1() {
		Fraction f = new Fraction("1");
		assertEquals(1, f.whole());
	}

	@Test
	public void FractionTestWhole2() {
		Fraction f = new Fraction("1_2/3");
		assertEquals(1, f.whole());
	}

	@Test
	public void FractionTestWhole3() {
		Fraction f = new Fraction("2/3");
		assertEquals(0, f.whole());
	}

	@Test
	public void FractionTestWhole4() {
		Fraction f = new Fraction("-1_2/3");
		assertEquals(1, f.whole());
	}

	@Test
	public void FractionTestWhole5() {
		Fraction f = new Fraction("-2/3");
		assertEquals(0, f.whole());
	}

	@Test
	public void FractionTestWhole6() {
		Fraction f = new Fraction("1 2/3");
		assertEquals(1, f.whole());
	}

	@Test
	public void FractionTestWhole7() {
		Fraction f = new Fraction("-1");
		assertEquals(1, f.whole());
	}

	@Test
	public void FractionTestNumerator1() {
		Fraction f = new Fraction("2");
		assertEquals(0, f.numerator(true));
	}

	@Test
	public void FractionTestNumerator2() {
		Fraction f = new Fraction("1_2/3");
		assertEquals(2, f.numerator(true));
	}

	@Test
	public void FractionTestNumerator3() {
		Fraction f = new Fraction("2/3");
		assertEquals(2, f.numerator(true));
	}

	@Test
	public void FractionTestNumerator4() {
		Fraction f = new Fraction("-1_2/3");
		assertEquals(2, f.numerator(true));
	}

	@Test
	public void FractionTestNumerator5() {
		Fraction f = new Fraction("-2/3");
		assertEquals(2, f.numerator(true));
	}

	@Test
	public void FractionTestNumerator6() {
		Fraction f = new Fraction("1 2/3");
		assertEquals(2, f.numerator(true));
	}

	@Test
	public void FractionTestNumerator7() {
		Fraction f = new Fraction("1 2/3");
		assertEquals(5, f.numerator(false));
	}

	@Test
	public void FractionTestNumerator8() {
		Fraction f = new Fraction("1 2/3");
		assertEquals(5, f.numerator());
	}

	@Test
	public void FractionTestDenominator1() {
		Fraction f = new Fraction("2");
		assertEquals(1, f.denominator());
	}

	@Test
	public void FractionTestDenominator2() {
		Fraction f = new Fraction("1_2/3");
		assertEquals(3, f.denominator());
	}

	@Test
	public void FractionTestDenominator3() {
		Fraction f = new Fraction("2/3");
		assertEquals(3, f.denominator());
	}

	@Test
	public void FractionTestDenominator4() {
		Fraction f = new Fraction("-1_2/3");
		assertEquals(3, f.denominator());
	}

	@Test
	public void FractionTestDenominator5() {
		Fraction f = new Fraction("-2/3");
		assertEquals(3, f.denominator());
	}

	@Test
	public void FractionTestDenominator6() {
		Fraction f = new Fraction("1 2/3");
		assertEquals(3, f.denominator());
	}

	@Test
	public void FractionTestGcf1() {
		Fraction f = new Fraction("1 2/3");
		assertEquals(1, Fraction.gcf(f.numerator(), f.denominator()));
	}

	@Test
	public void FractionTestGcf2() {
		Fraction f = new Fraction("1 2/3");
		assertEquals(1, Fraction.gcf(f.numerator(), f.denominator()));
	}

	@Test
	public void FractionTestGcf3() {
		Fraction f = new Fraction("42/21");
		assertEquals(21, Fraction.gcf(f.numerator(), f.denominator()));
	}
}