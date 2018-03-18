package fracCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FracCalcTestFinalAddition {
	@Test public void testAdditionSimple1() {assertEquals("2/5", FracCalc.produceAnswer("1/5 + 1/5"));}
	@Test public void testAdditionSimple2() {assertEquals("4/5", FracCalc.produceAnswer("3/5 + 1/5"));}
	@Test public void testAdditionSimple3() {assertEquals("4_3/7", FracCalc.produceAnswer("1_1/7 + 3_2/7"));}

	@Test public void testAdditionReduce1() {assertEquals("1_1/5", FracCalc.produceAnswer("3/5 + 3/5"));}
	@Test public void testAdditionReduce2() {assertEquals("1_1/5", FracCalc.produceAnswer("4/5 + 2/5"));}
	@Test public void testAdditionReduce3() {assertEquals("1/4", FracCalc.produceAnswer("1/8 + 1/8"));}

	@Test public void testAdditionWholeNumbers1() {assertEquals("1", FracCalc.produceAnswer("2/5 + 3/5"));}
	@Test public void testAdditionWholeNumbers2() {assertEquals("1", FracCalc.produceAnswer("2/3 + 1/3"));}
	@Test public void testAdditionWholeNumbers3() {assertEquals("10", FracCalc.produceAnswer("3 + 7"));}
	@Test public void testAdditionWholeNumbers8() {assertEquals("2", FracCalc.produceAnswer("1 + 1"));}
	@Test public void testAdditionWholeNumbers4() {assertEquals("4", FracCalc.produceAnswer("1 + 3"));}
	@Test public void testAdditionWholeNumbers5() {assertEquals("452", FracCalc.produceAnswer("452 + 0"));}
	@Test public void testAdditionWholeNumbers6() {assertEquals("254", FracCalc.produceAnswer("0 + 254"));}
	@Test public void testAdditionWholeNumbers7() {assertEquals("1021778", FracCalc.produceAnswer("124543 + 897235"));}

	@Test public void testAdditionWithNegatives1() {assertEquals("2/5", FracCalc.produceAnswer("3/5 + -1/5"));}
	@Test public void testAdditionWithNegatives2() {assertEquals("900", FracCalc.produceAnswer("978 + -78"));}
	@Test public void testAdditionWithNegatives3() {assertEquals("900", FracCalc.produceAnswer("-78 + 978"));}
	@Test public void testAdditionWithNegatives4() {assertEquals("-1_1/4", FracCalc.produceAnswer("-3_3/4 + 2_2/4"));}
	@Test public void testAdditionWithNegatives5() {assertEquals("-1_1/4", FracCalc.produceAnswer("2_2/4 + -3_3/4"));}

	@Test public void testAdditionImproperFractionsAndReductions1() {assertEquals("5_5/6", FracCalc.produceAnswer("20/8 + 3_1/3"));}
	@Test public void testAdditionImproperFractionsAndReductions2() {assertEquals("1_1/20", FracCalc.produceAnswer("4/5 + 2/8"));}

	// This unit test tries a number of combined concepts
	@Test public void testAdditionCombined1() { assertEquals("-9035", FracCalc.produceAnswer("-9035 + 0"));}
	@Test public void testAdditionCombined2() {     assertEquals("-64", FracCalc.produceAnswer("64 + -128"));}
	@Test public void testAdditionCombined3() {         assertEquals("-133", FracCalc.produceAnswer("-98 + -35"));}
	@Test public void testAdditionCombined4() { assertEquals("62_11/19", FracCalc.produceAnswer("0 + 34_543/19"));}
	@Test public void testAdditionCombined5() { assertEquals("-44_229/888", FracCalc.produceAnswer("-38_3/72 + -4_82/37"));}
}
