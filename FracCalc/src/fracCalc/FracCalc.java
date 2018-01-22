package fracCalc;

import java.util.Scanner;

public class FracCalc {

  public static void main(String[] args) {

    /*
     * Loop processing input strings until we get told to quit.
     * For each string:
     * - Check if we're done.
     * - Call produceAnswer().
     * - Print the result.
     */
    Scanner input = new Scanner(System.in);
    //String prompt = "> ";  // TODO: why does cursor end up at col 0?
    String prompt = "";

    System.out.print(prompt);

    while (true) {
      String eq = input.nextLine();
      if (eq.equalsIgnoreCase("quit")) {
        break;
      }
      System.out.println(produceAnswer(eq));
      System.out.print(prompt);
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
  static String produceAnswer(String input) {

    /*
     * Processing strategy:
     * - Use a Scanner to parse input into operand and operator tokens.
     * - Work with one pair at a time (either a pair of operands from input and
     *   their operator or the last result and a new operator and operand.
     * - Break operands into component parts.
     * - Reduce to a canonical fraction ([-]n/d, no whole part).
     * - Apply operator to fractions.
     * - Repeat if we haven't reached the end of the input.
     * - Covert from the canoncal form to a proper reduced fraction.
     *
     * Throw an error if:
     * - Initially there are more than two operands.
     * - There is a leading or trailing operator.
     * - There is an unknown operator or invalid operand.
     */

    Scanner tokens = new Scanner(input);

    String left = tokens.next();
    String op = tokens.next();
    String right = tokens.next();

    String result = right;

    return result;
  }

  enum Part { whole, numerator, denominator }

  /**
   * parseNum() - return a portion of string representing a number.
   *
   * @param num - the String
   * @param want - the part we want
   * @return - the integer value of the part
   */
  private static int parseNum(String num, Part want) {
    return 0;
  }

  /**
   * checkOperator() - check that we got a valid operator.
   *
   * @param op - operand String to check
   * @return - is it a valid operand
   */
  private static boolean checkOperator(String op) {
    // Check that op is a String of length 1 from the set: + - / *.
    // TODO: implement tests.
    return true;
  }

  /**
   * reduce() - a possibly improper fraction to proper form.
   *
   * @param n - numerator
   * @param d - denominator
   * @return - String holding reduced form.
   */
  private static String reduce(int n, int d) {
    // TODO: implement fraction reduction.
    return n + "/" + d;
  }

}
