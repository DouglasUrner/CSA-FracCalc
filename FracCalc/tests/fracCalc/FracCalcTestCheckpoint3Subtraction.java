package fracCalc;

import org.junit.Test;

public class FracCalcTestCheckpoint3Subtraction {
	@Test public void testCheckpoint3_SubtractionSimple3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("4_1/2 - 4_1/2"));}
	@Test public void testCheckpoint3_SubtractionWithNegatives3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-1_1/4", FracCalc.produceAnswer("-3_3/4 - -2_2/4"));}
	@Test public void testCheckpoint3_SubtractionCombined2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "8_5/21", FracCalc.produceAnswer("-12_3/7 - -20_2/3"));}
}
