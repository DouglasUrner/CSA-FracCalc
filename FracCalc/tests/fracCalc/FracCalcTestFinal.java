package fracCalc;

import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * To run the test suite for the first time, right-click (control-click on a
 * Mac with a single button mouse) anywhere in the file, then select
 * Run FracCalcTestALL from the context menu. For subsequent runs you can either
 * continue to right-click or use the green right-arrow (play) button on the
 * navigation bar.
 *
 * The test results will appear below, grouped by checkpoint. Your code should
 * be passing all of the tests for the current checkpoint and all of the
 * preceding checkpoints.
 *
 * Note that for Checkpoint1 there will be some spurious passes in the tests for
 * Checkpoint3 (you should be passing a all of the tests in Checkpoint1 and nine
 * from Checkpoint3).
 */

/*
 * TODO: figure out the apparent false positive in areFracsEqual().
 * It happens when the expected result is 0.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
    FracCalcTestFinalAddition.class,
    FracCalcTestFinalSubtraction.class,
    FracCalcTestFinalMultiplication.class,
    FracCalcTestFinalDivision.class,
})

public class FracCalcTestFinal
{

}

