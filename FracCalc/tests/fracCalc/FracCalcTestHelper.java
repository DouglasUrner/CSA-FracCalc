//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

// TODO: clean up magic numbers.

package fracCalc;

public class FracCalcTestHelper {
  public FracCalcTestHelper() {
  }

  public static boolean areFracsEqual(String answer, String candidate) {

    int answerNumerator = parseValue(answer, 1);
    int answerDenominator = parseValue(answer, 2);
    int answerWhole = parseValue(answer, 3);
    boolean isNegative = answerWhole < 0;
    answerNumerator += Math.abs(answerWhole) * answerDenominator;

    if (candidate.length() == 0) {
      return false;
    }

    if (isNegative) {
      answerNumerator *= -1;
    }

    int candidateNumerator = parseValue(candidate, 1);
    int candidateDenominator = parseValue(candidate, 2);
    int candidateWhole = parseValue(candidate, 3);
    if (candidateDenominator == 0) {
      return false;
    } else {
      isNegative = candidateWhole < 0;
      candidateNumerator += Math.abs(candidateWhole) * candidateDenominator;
      if (isNegative) {
        candidateNumerator *= -1;
      }

      return answerNumerator * candidateDenominator == candidateNumerator * answerDenominator;
    }
  }

  private static int parseValue(String value, int what) {
    int whole = 0;
    boolean num = false;
    boolean den = true;
    int iUnderscore = value.indexOf("_");
    int iNum = iUnderscore + 1;
    int iSlash = value.indexOf("/");
    int iWholeEnd;
    if (iUnderscore == -1) {
      if (iSlash == -1) {
        iWholeEnd = value.length();
      } else {
        iWholeEnd = 0;
      }
    } else {
      if (iSlash == -1) {
        return 0;
      }

      iWholeEnd = iUnderscore;
    }

    String numString;
    if (iWholeEnd != 0) {
      numString = value.substring(0, iWholeEnd);
      if (!isInteger(numString)) {
        return 0;
      }

      whole = Integer.parseInt(numString);
    }

    if (iSlash == -1) {
      if (what == 0) {
        return 1;
      } else if (what == 1) {
        return 0;
      } else {
        return what == 2 ? 1 : whole;
      }
    } else {
      numString = value.substring(iNum, iSlash);
      if (!isInteger(numString)) {
        return 0;
      } else {
        int numStringValue = Integer.parseInt(numString);
        String denString = value.substring(iSlash + 1);
        if (!isInteger(denString)) {
          return 0;
        } else {
          int denStringValue = Integer.parseInt(denString);
          if (what == 0) {
            return 1;
          } else {
            if (denStringValue < 0) {
              denStringValue *= -1;
              numStringValue *= -1;
            }

            if (what == 1) {
              return numStringValue;
            } else {
              return what == 2 ? denStringValue : whole;
            }
          }
        }
      }
    }
  }

  private static boolean isInteger(String s) {
    int i = 0;

    if (s.length() == 0) {
      return false;
    }

    if (s.charAt(0) == '-') {
      i = 1;
      if (s.length() == 1) {
        return false;
      }
    }

    while(i < s.length()) {
      char c = s.charAt(i);
      if (c < '0' || c > '9') {
        return false;
      }
      ++i;
    }
    return true;
  }
}
