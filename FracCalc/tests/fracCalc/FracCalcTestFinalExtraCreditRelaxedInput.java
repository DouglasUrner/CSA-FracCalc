package fracCalc;

import org.junit.Test;

public class FracCalcTestFinalExtraCreditRelaxedInput {
	@Test public void testCheckpoint1_1() {FracCalcTestALL.assertForEarlyCheckpoints("6 5/8", "whole:6 numerator:5 denominator:8", "12 3/8", FracCalc.produceAnswer("5 3/4 + 6 5/8"));}
	@Test public void testCheckpoint1_2() {FracCalcTestALL.assertForEarlyCheckpoints("20", "whole:20 numerator:0 denominator:1", "-20 3/7", FracCalc.produceAnswer("-3/7-20"));}
	@Test public void testCheckpoint1_3() {FracCalcTestALL.assertForEarlyCheckpoints("27/21", "whole:0 numerator:27 denominator:21", "-33 2/7", FracCalc.produceAnswer("-32-27/21"));}
}
