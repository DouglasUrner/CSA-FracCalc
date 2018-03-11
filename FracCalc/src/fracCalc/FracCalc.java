package fracCalc;

import java.util.Scanner;

public class FracCalc {

  public static void main(String[] args) {
    // TODO: loop processing equations until user quits
    // Set up and manage the calculator
    Scanner stdin = new Scanner(System.in);

    while (true) {
      // Get equations to process
      String eq = stdin.nextLine();

      if (eq.equalsIgnoreCase("quit")) {
        // We're done.
        break;
      } else {
        // Calculate & print result
        System.out.println(produceAnswer(eq));
      }
    }
  }

  /*
   * IMPORTANT DO NOT DELETE OR CHANGE THE SIGNATURE OF THIS FUNCTION
   *
   * This function will be used to test your code.
   *
   * This function takes a String 'input' and produces the result
   *
   * input is a fraction string that needs to be evaluated.  For your
   * program, this will be the user input.
   *     e.g. input ==> "1/2 + 3/4"
   *
   * The function should return the result of the fraction after it
   * has been calculated
   *    e.g. return ==> "1_1/4"
   */
  public static String produceAnswer(String input) {
    // TODO: validate input tokens

    // Calculate the result of the expression in input and return a
    // a String representing the answer as a whole number and proper
    // fraction.

    // Split the input into three tokens: left-operand operator right-operand.
    Scanner tokens = new Scanner(input);
    String leftOperand = tokens.next();
    String operator = tokens.next();
    String rightOperand = tokens.next();

    // return rightOperand;
    // return formatForCheckpoint2(rightOperand);
    return compute(leftOperand, operator, rightOperand);
  }

  private static String compute(String l, String op, String r) {
    int lW = parseFraction(l, parts.whole);
    int lN = parseFraction(l, parts.numerator);
    int lD = parseFraction(l, parts.denominator);
    int lSign = (lW < 0 || lN < 0) ? -1 : 1;
    lW = Math.abs(lW);
    lN = Math.abs(lN);

    int rW = parseFraction(r, parts.whole);
    int rN = parseFraction(r, parts.numerator);
    int rD = parseFraction(r, parts.denominator);
    int rSign = (rW < 0 || rN < 0) ? -1 : 1;
    rW = Math.abs(rW);
    rN = Math.abs(rN);

    int commonD = lD * rD;
    lN = (lN * rD + lW * commonD) * lSign;
    rN = (rN * lD + rW * commonD) * rSign;

    int resultNumerator = 0;
    int resultDenominator = commonD;

    if (op.equals("+")) {
      resultNumerator = lN + rN;
    } else if (op.equals("-")) {
      resultNumerator = lN - rN;
    } else if (op.equals("*")) {
      resultNumerator = lN * rN;
      resultDenominator = commonD * commonD;
    } else if (op.equals("/")) {
      resultNumerator = lN;
      resultDenominator = rN;
    }
    return reduceFractionToString(resultNumerator, resultDenominator);
  }

  // TODO: Use the space below for any helper methods that you need.

  enum parts { whole, numerator, denominator }

  /**
   * parseFraction(String f, parts get)
   *
   * Return the component of the fraction requested by the enum get.
   *
   * @param f   - String holding the fraction
   * @param get - member of enum parts specifying the component to get
   * @return    - int value of the component
   */
  private static int parseFraction(String f, parts get) {
    int value = 0;

    int underscore = f.indexOf("_");
    int slash = f.indexOf("/");

    switch (get) {
      case whole:
        if (underscore == -1 && slash == -1) {
          // Only a whole number is present.
          value = Integer.parseInt(f);
        } else if (underscore > -1) {
          // A fraction is also present.
          value = Integer.parseInt(f.substring(0, underscore));
        }
        break;

      case numerator:
        if (underscore == -1 && slash > -1) {
          // Only a fraction is present.
          value = Integer.parseInt(f.substring(0, slash));
        } else if (underscore > -1 && slash > -1) {
          // Whole number part is also present.
          value = Integer.parseInt(f.substring(underscore + 1, slash));
        }
        break;

      case denominator:
        if (slash > -1) {
          // A fraction part is present.
          value = Integer.parseInt(f.substring(slash + 1));
        } else {
          value = 1;
        }
        break;
    }
    return value;
  }

  private static String reduceFractionToString(int n, int d) {
    return n + "/" + d;
  }

  private static String formatForCheckpoint2(String s) {
    String result = "whole:" + parseFraction(s, parts.whole);
    result += " numerator:" + parseFraction(s, parts.numerator);
    result += " denominator:" + parseFraction(s, parts.denominator);
    return result;
  }
}
