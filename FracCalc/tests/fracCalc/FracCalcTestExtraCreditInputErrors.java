package fracCalc;

import org.junit.Test;

public class FracCalcTestExtraCreditInputErrors {
	@Test(expected = IllegalArgumentException.class)
	public void InputErrors1() {
		FracCalc.produceAnswer("2 + 1 1/2");
	}

	@Test(expected = IllegalArgumentException.class)
	public void InputErrors2() {
		FracCalc.produceAnswer("1_1/2+2");
	}

	@Test(expected = IllegalArgumentException.class)
	public void InputErrors3() {
		FracCalc.produceAnswer("2 % 2");
	}
}
