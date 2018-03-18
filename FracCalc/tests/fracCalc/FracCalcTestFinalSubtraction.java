package fracCalc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FracCalcTestFinalSubtraction {
	@Test
	public void testSubtractionSimple1() {assertEquals("1/5", FracCalc.produceAnswer("3/5 - 2/5"));}
	@Test public void testSubtractionSimple2() {assertEquals("0", FracCalc.produceAnswer("1/5 - 1/5"));}
	@Test public void testSubtractionSimple3() {assertEquals("0", FracCalc.produceAnswer("4_1/2 - 4_1/2"));}

	@Test public void testSubtractionReduce1() {assertEquals("4/5", FracCalc.produceAnswer("9/10 - 1/10"));}
	@Test public void testSubtractionReduce2() {assertEquals("1/5", FracCalc.produceAnswer("5/10 - 3/10"));}

	@Test public void testSubtractionWholeNumbers1() {  assertEquals("0", FracCalc.produceAnswer("68591 - 68591"));}
	@Test public void testSubtractionWholeNumbers2() {assertEquals("7", FracCalc.produceAnswer("42 - 35"));}

	@Test public void testSubtractionWithNegatives1() { assertEquals("-2/5", FracCalc.produceAnswer("2/5 - 4/5"));}
	@Test public void testSubtractionWithNegatives2() {assertEquals("-7/8", FracCalc.produceAnswer("5_3/4 - 6_5/8"));}
	@Test public void testSubtractionWithNegatives3() {assertEquals("-1_1/4", FracCalc.produceAnswer("-3_3/4 - -2_2/4"));}
	@Test public void testSubtractionWithNegatives4() {assertEquals("-1_5/8", FracCalc.produceAnswer("4_1/2 - 5_9/8"));}
	@Test public void testSubtractionWithNegatives5() {assertEquals("-1_1/8", FracCalc.produceAnswer("3_3/4 - 4_7/8"));}
	@Test public void testSubtractionWithNegatives6() {assertEquals("-6_1/4", FracCalc.produceAnswer("-3_3/4 - 2_2/4"));}
	@Test public void testSubtractionWithNegatives7() {assertEquals("-36891", FracCalc.produceAnswer("48623 - 85514"));}
	@Test public void testSubtractionWithNegatives8() {assertEquals("-9284", FracCalc.produceAnswer("0 - 9284"));}

	@Test public void testSubtractionImproperFractionsAndReductions1() {assertEquals("53/96", FracCalc.produceAnswer("75/32 - 43/24"));}
	@Test public void testSubtractionImproperFractionsAndReductions2() {assertEquals("16_23/24", FracCalc.produceAnswer("75/4 - 43/24"));}

	// This unit test tries a number of combined concepts
	@Test public void testSubtractionCombined1() {  assertEquals("12_3/8", FracCalc.produceAnswer("5_3/4 - -6_5/8"));}
	@Test public void testSubtractionCombined2() {assertEquals("8_5/21", FracCalc.produceAnswer("-12_3/7 - -20_2/3"));}
	@Test public void testSubtractionCombined3() {assertEquals("-65_247/336", FracCalc.produceAnswer("-32_75/16 - 27_43/21"));}
}
