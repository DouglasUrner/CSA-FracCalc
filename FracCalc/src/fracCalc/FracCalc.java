package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner input = new Scanner(System.in);
        String eq = input.nextLine();
        System.out.println(produceAnswer(eq));
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String result = "";
        Scanner tokens = new Scanner(input);

        // Break string into operands and operator.
        String leftSide = tokens.next();
        String operator = tokens.next();
        String rightSide = tokens.next();

        // Left hand operand.

        int lsWhole = 0;
        int lsNum = 0;
        int lsDenom = 1;

        // Check for landmarks.
        int underscore = leftSide.indexOf('_');
        int slash = leftSide.indexOf('/');

        if (underscore > 0) {
            // We have whole and fractional parts.
            lsWhole = Integer.parseInt(leftSide.substring(0, underscore));

            lsNum = Integer.parseInt(leftSide.substring(underscore + 1, slash));
            lsDenom = Integer.parseInt(leftSide.substring(slash + 1));
        } else if (slash > 0) {
            // We only have the fractional part.
            lsNum = Integer.parseInt(leftSide.substring(0, slash));
            lsDenom = Integer.parseInt(leftSide.substring(slash + 1));
        } else {
            // It's a whole number.
            lsWhole = Integer.parseInt(leftSide);
        }

        // Right hand operand.

        int rsWhole = 0;
        int rsNum = 0;
        int rsDenom = 1;

        // Check for landmarks.
        underscore = rightSide.indexOf('_');
        slash = rightSide.indexOf('/');

        if (underscore > 0) {
            // We have whole and fractional parts.
            rsWhole = Integer.parseInt(rightSide.substring(0, underscore));

            rsNum = Integer.parseInt(rightSide.substring(underscore + 1, slash));
            rsDenom = Integer.parseInt(rightSide.substring(slash + 1));
        } else if (slash > 0) {
            // We only have the fractional part.
            rsNum = Integer.parseInt(rightSide.substring(0, slash));
            rsDenom = Integer.parseInt(rightSide.substring(slash + 1));
        } else {
            // It's a whole number.
            rsWhole = Integer.parseInt(rightSide);
        }

        // result = "whole:" + rsWhole + " numerator:" + rsNum + " denominator:" + rsDenom;

        int resultWhole = 0;
        int resultNum = 0;
        int resultDenom = 1;
        int commonDenom;

        if (lsDenom == rsDenom) {
            commonDenom = lsDenom;
        } else {
            commonDenom = lsDenom * rsDenom;
        }
        resultDenom = commonDenom;

        lsNum = normalizeNumerator(lsWhole, lsNum, lsDenom, rsDenom);
        lsWhole = 0;

        rsNum = normalizeNumerator(rsWhole, rsNum, rsDenom, lsDenom);
        rsWhole = 0;

        switch (operator.toCharArray()[0]) {
            case '+':
                resultNum = lsNum + rsNum;
                break;

            case '-':
                resultNum = lsNum - rsNum;
                break;

            case '*':
                resultNum = lsNum * rsNum;
                resultDenom = commonDenom * commonDenom;
                break;

            case '/':
                resultNum = lsNum * commonDenom;
                resultDenom = commonDenom * rsNum;
                break;

            default:
                break;

        }

        return formatResult(resultWhole, resultNum, resultDenom);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need

    /**
     * normalizeNumerator() - given the components of a fraction and the other
     * denominator calculate the numerator in terms of a common denominator.
     *
     * @param w - whole number part
     * @param n - numerator
     * @param d - denominator
     * @param o - other denominator
     * @return an integer representing the new numerator
     */
    private static int normalizeNumerator(int w, int n, int d, int o) {
        boolean neg = false;
        if (w < 0) {
            neg = true;
            w *= -1;
        } else if (n < 0) {
            neg = true;
            n *= -1;
        }

        if (d != o) {
            n *= o;
            w *= d * o;
            n += w;
        } else {
            n += w * d;
        }

        if (neg)
            return n * -1;
        else
            return n;
    }

    private static String formatResult(int w, int n, int d) {
        String sign = "";
//        if (n < 0) {
//            sign = "-";
//            n *= -1;
//        }
        return sign + w + "_" + n + "/" + d;
    }

}
