package fracCalc;

import org.junit.Test;

public class FracCalcTestCheckpoint3Multiplication {
	@Test public void testCheckpoint3_MultiplicationBasic1() {  FracCalcTestALL.assertForEarlyCheckpoints(null, null, "3", FracCalc.produceAnswer("1_1/2 * 2"));}
	@Test public void testCheckpoint3_MultiplicationBasic10() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "378/943", FracCalc.produceAnswer("27/41 * 14/23"));}
	@Test public void testCheckpoint3_MultiplicationBasic3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "164268", FracCalc.produceAnswer("234 * 702"));}
	@Test public void testCheckpoint3_MultiplicationWithNegatives2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-8", FracCalc.produceAnswer("-12/3 * 2/1"));}
	@Test public void testCheckpoint3_MultiplicationWithNegatives6() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "15_5/7", FracCalc.produceAnswer("-3_2/3 * -4_2/7"));}
	@Test public void testCheckpoint3_MultiplicationByZero2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 * 0"));}
	@Test public void testCheckpoint3_MultiplicationByZero3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 * 9321"));}
	@Test public void testCheckpoint3_MultiplicationByZero4() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 * -5902"));}
	@Test public void testCheckpoint3_MultiplicationCombined1() {   FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1065_115/168", FracCalc.produceAnswer("-32_75/16 * -27_43/21"));}
	@Test public void testCheckpoint3_MultiplicationCombined2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-15_67/943", FracCalc.produceAnswer("1_27/41 * -3_140/23"));}
}
