package fracCalc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FracCalcTestFinalMultiplication {
	@Test public void testMultiplicationBasic1() {assertEquals("3", FracCalc.produceAnswer("1_1/2 * 2"));}
	@Test public void testMultiplicationBasic2() {assertEquals("6/25", FracCalc.produceAnswer("3/5 * 2/5"));}
	@Test public void testMultiplicationBasic3() {assertEquals("164268", FracCalc.produceAnswer("234 * 702"));}
	@Test public void testMultiplicationBasic4() {assertEquals("216", FracCalc.produceAnswer("12 * 18"));}
	@Test public void testMultiplicationBasic5() {assertEquals("8", FracCalc.produceAnswer("12/3 * 2/1"));}
	@Test public void testMultiplicationBasic6() {assertEquals("2", FracCalc.produceAnswer("16 * 1/8"));}
	@Test public void testMultiplicationBasic7() {assertEquals("2", FracCalc.produceAnswer("3 * 2/3"));}
	@Test public void testMultiplicationBasic8() {assertEquals("1_1/2", FracCalc.produceAnswer("6 * 1/4"));}
	@Test public void testMultiplicationBasic9() {assertEquals("8994872", FracCalc.produceAnswer("1 * 8994872"));}
	@Test public void testMultiplicationBasic10() {assertEquals("378/943", FracCalc.produceAnswer("27/41 * 14/23"));}
	@Test public void testMultiplicationBasic11() {assertEquals("5_929/943", FracCalc.produceAnswer("1_27/41 * 3_14/23"));}

	@Test public void testMultiplicationWithNegatives1() {assertEquals("-8", FracCalc.produceAnswer("12/3 * -2/1"));}
	@Test public void testMultiplicationWithNegatives2() {assertEquals("-8", FracCalc.produceAnswer("-12/3 * 2/1"));}
	@Test public void testMultiplicationWithNegatives3() {assertEquals("8", FracCalc.produceAnswer("-12/3 * -2/1"));}
	@Test public void testMultiplicationWithNegatives4() {assertEquals("-15_5/7", FracCalc.produceAnswer("-3_2/3 * 4_2/7"));}
	@Test public void testMultiplicationWithNegatives5() {assertEquals("-15_5/7", FracCalc.produceAnswer("3_2/3 * -4_2/7"));}
	@Test public void testMultiplicationWithNegatives6() {assertEquals("15_5/7", FracCalc.produceAnswer("-3_2/3 * -4_2/7"));}
	@Test public void testMultiplicationWithNegatives7() {assertEquals("-842346", FracCalc.produceAnswer("1 * -842346"));}
	@Test public void testMultiplicationWithNegatives8() {assertEquals("-75421", FracCalc.produceAnswer("-1 * 75421"));}
	@Test public void testMultiplicationWithNegatives9() {assertEquals("37953", FracCalc.produceAnswer("-1 * -37953"));}

	@Test public void testMultiplicationByZero1() {assertEquals("0", FracCalc.produceAnswer("0 * 4/5"));}
	@Test public void testMultiplicationByZero2() {assertEquals("0", FracCalc.produceAnswer("0 * 0"));}
	@Test public void testMultiplicationByZero3() {assertEquals("0", FracCalc.produceAnswer("0 * 9321"));}
	@Test public void testMultiplicationByZero4() {assertEquals("0", FracCalc.produceAnswer("0 * -5902"));}
	@Test public void testMultiplicationByZero5() {assertEquals("0", FracCalc.produceAnswer("146 * 0"));}
	@Test public void testMultiplicationByZero6() {assertEquals("0", FracCalc.produceAnswer("3_25/26 * 0"));}
	@Test public void testMultiplicationByZero7() {assertEquals("0", FracCalc.produceAnswer("-24_1/3 * 0"));}

	@Test public void testMultiplicationCombined1() {assertEquals("1065_115/168", FracCalc.produceAnswer("-32_75/16 * -27_43/21"));}
	@Test public void testMultiplicationCombined2() {assertEquals("-15_67/943", FracCalc.produceAnswer("1_27/41 * -3_140/23"));}
	@Test public void testMultiplicationCombined3() {assertEquals("4_2/3", FracCalc.produceAnswer("3_2/4 * 4/3"));}
}
