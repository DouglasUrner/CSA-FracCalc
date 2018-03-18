package fracCalc;

import org.junit.Test;

public class FracCalcTestCheckpoint3Division {
	@Test public void testCheckpoint3_DivisionBasic1() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "9/16", FracCalc.produceAnswer("3/4 / 4/3"));}
	@Test public void testCheckpoint3_DivisionBasic2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "2_1/4", FracCalc.produceAnswer("3/2 / 2/3"));}
	@Test public void testCheckpoint3_DivisionWithNegatives5() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-2_6/7", FracCalc.produceAnswer("-20 / 7"));}
	@Test public void testCheckpoint3_DivisionWithNegatives6() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1_13/32", FracCalc.produceAnswer("-3_3/4 / -2_2/3"));}
	@Test public void testCheckpoint3_DivisionWithZero5() { FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 / 46/27"));}
	@Test public void testCheckpoint3_DivisionWithZero6() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0/24 / 1/46"));}
	@Test public void testCheckpoint3_DivisionCombined2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-2_2/3", FracCalc.produceAnswer("16/4 / -3/2"));}
	@Test public void testCheckpoint3_DivisionCombined3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "6_661/5520", FracCalc.produceAnswer("-38_3/72 / -4_82/37"));}
}
