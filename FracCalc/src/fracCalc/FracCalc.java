package fracCalc;

import java.util.Scanner;

public class FracCalc {

  public static void main(String[] args) {
    // Set up and manage the calculator
    Scanner stdin = new Scanner(System.in);

    while (true) {
      // Get equations to process
			System.out.print("> ");
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
  	/*
     * Calculate the result of the expression in input and return a
		 * a String representing the answer as a whole number and proper
     * fraction.
		 */

		String[] tokens = input.split(" ");
		if ((tokens.length < 3) || ((tokens.length - 3) % 2 != 0)) {
			throw new IllegalArgumentException("Error: missing operand or operator in '" + input + "'");
		}

		// Do the first hunk "by hand."
		Fraction result = compute(tokens[0], tokens[1], tokens[2]);

		int tokensLeft = tokens.length - 3;
		int startAt = 3;

		// Loop over anything that remains using the previous result as the left operand.
		while (tokensLeft > 0) {
			result = compute(result.toString(), tokens[startAt], tokens[startAt + 1]);
			tokensLeft -= 2;
			startAt += 2;
		}

    return result.toString();
  }

  private static Fraction compute(String left, String op, String right) {
  	Fraction l = new Fraction(left);
  	Fraction r = new Fraction(right);

  	int tempN;
    int tempD;

    switch (op) {
			case "+":
				tempN = (l.sign() * l.numerator() * r.denominator()) + (r.sign() * r.numerator() * l.denominator());
				tempD = l.denominator() * r.denominator();
				break;

			case "-":
				tempN = (l.sign() * l.numerator() * r.denominator()) - (r.sign() * r.numerator() * l.denominator());
				tempD = l.denominator() * r.denominator();
				break;

			case "*":
				tempN = (l.sign() * l.numerator()) * (r.sign() * r.numerator());
				tempD = l.denominator() * r.denominator();
				break;

			case "/":
				if (r.numerator() == 0) { throw new IllegalArgumentException("ERROR: attempt to divide by zero"); }
				tempN = (l.sign() * l.numerator()) * (r.sign() * r.denominator());
				tempD = l.denominator() * r.numerator();
				break;

				default:
					throw new IllegalArgumentException("ERROR: Unrecognized operator '" + op + "'");
    }

		return new Fraction((tempN < 0 ? '-' : '+'), 0, tempN, tempD);
  }

/*	private static String formatForCheckpoint1(Fraction f) {
  	return f.toString(true);
	}

  private static String formatForCheckpoint2(Fraction f) {
    String result = "whole:" + f.whole();
    result += " numerator:" + f.numerator(true);
    result += " denominator:" + f.denominator();
    return result;
  }*/
}
