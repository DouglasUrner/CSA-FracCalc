package fracCalc;

import java.util.Scanner;

public class FracCalc {

  public static void main(String[] args) {
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

		String[] tokens = input.split(" ");

		Fraction result = compute(tokens[0], tokens[1], tokens[2]);

		int tokensLeft = tokens.length - 3;
		int startAt = 3;
		if (tokensLeft % 2 == 0) {
			while (tokensLeft > 0) {
				result = compute(result.toString(), tokens[startAt], tokens[startAt + 1]);
				tokensLeft -= 2;
				startAt += 2;
			}
		}

		// return rightOperand;
    // return formatForCheckpoint2(rightOperand);
    return result.toString();
  }

  private static Fraction compute(String left, String op, String right) {
  	Fraction l = new Fraction(left);
  	Fraction r = new Fraction(right);
  	Fraction result;

  	int tempN = 0;
    int tempD = 1;

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
				tempN = (l.sign() * l.numerator()) * (r.sign() * r.denominator());
				tempD = l.denominator() * r.numerator();
				break;

				default:
					throw new IllegalArgumentException("Unrecognized operator '" + op + "'");

    }

		return new Fraction((tempN < 0 ? '-' : '+'), 0, tempN, tempD);
  }

  // TODO: Use the space below for any helper methods that you need.

	private static String formatForCheckpoint1(Fraction f) {
  	return f.toString(true);
	}

  private static String formatForCheckpoint2(Fraction f) {
    String result = "whole:" + f.whole();
    result += " numerator:" + f.numerator(true);
    result += " denominator:" + f.denominator();
    return result;
  }
}
