package fracCalc;

public class Fraction {
	private int sign = 1;
	private int whole = 0;
	private int numerator = 0;
	private int denominator = 1;

	public Fraction(String str) {
		int begin = 0;
		if (str.charAt(begin) == '-') {
			setSign('-');
			begin = 1;
		}

		// Either an underscore or a space can separate the whole part from the fraction.
		int underscore = str.indexOf('_');
		underscore = (underscore > -1) ? underscore : str.indexOf(' ');
		int slash = str.indexOf('/');

		int w = 0;
		int n = 0;
		int d = 1;

		if (underscore == -1 && slash == -1 && str.length() > 0 + begin) {
			// Whole only.
			w = Integer.parseInt(str.substring(begin));
		} else if (underscore > -1 && slash > -1 && str.length() >= 5 + begin) {
			// Whole and fraction.
			w = Integer.parseInt(str.substring(begin, underscore));
			n = Integer.parseInt(str.substring(underscore + 1, slash));
			d = Integer.parseInt(str.substring(slash + 1));
		} else if (underscore == -1 && slash > begin && str.length() >= 3 + begin) {
			// Fraction only.
			n = Integer.parseInt(str.substring(begin, slash));
			d = Integer.parseInt(str.substring(slash + 1));
		} else {
			// Malformed input.
			throw new IllegalArgumentException("Can't construct fraction from '" + str + "'");
		}

		setWhole(w);
		setNumerator(n);
		setDenominator(d);
	}

	public Fraction(char sign, int whole, int numerator, int denominator) {
		setSign(sign);
		setWhole(whole);
		setNumerator(numerator);
		setDenominator(denominator);
	}

	public void reduce() {
		this.whole = this.numerator() / this.denominator;
		this.numerator = this.numerator() % this.denominator;
		int gcf = gcf(this.numerator, this.denominator);
		this.numerator /= gcf;
		this.denominator /= gcf;
	}

	// Getters
	public boolean isNegative() { return sign == -1 ? true : false; }
	public int sign() { return sign; } // TODO: write tests.
	public int whole() { return whole; }
	public int numerator(boolean proper) { return proper ? numerator : (whole * denominator + numerator); }
	public int numerator() { return numerator(false); }
	public int denominator() { return denominator; }

	// Setters - not public
	void setSign(char s) {
		if (s == '+')
			this.sign = 1;
		else if (s == '-')
			this.sign = -1;
		else
			throw new IllegalArgumentException("Don't know how to handle sign of '" + s + "'");
	}

	void setWhole(int num) {
		// TODO: decide if we should set the sign here
		if (num < 0) { this.sign = -1; }
		this.whole = Math.abs(num);
	}

	void setNumerator(int num) {
		// TODO: decide if we should set the sign here
		if (num < 0) { this.sign = -1; }
		this.numerator = Math.abs(num);
	}

	void setDenominator(int num) {
		if (num == 0) { throw new IllegalArgumentException("Denominator can not be zero"); }
		if (num < 0) { throw new IllegalArgumentException("Negitive value passed to Fraction.setDenominator()"); }
		this.denominator = num;
	}

	public String toString(boolean proper) {
		if (this.whole == 0 && this.numerator == 0) {
			return "0";
		}
		if (proper) {
			this.reduce();
			if (this.whole > 0) {
				return (this.isNegative() ? "-" : "") + this.whole +
						(this.numerator > 0 ? ("_" + this.numerator + "/" + this.denominator) : "");
			} else {
				return (this.isNegative() ? "-" : "") + this.numerator + "/" + this.denominator;
			}
		} else {
			return (this.isNegative() ? "-" : "") + this.numerator + "/" + this.denominator;
		}
	}

	@Override
	public String toString() {
		return this.toString(true);
	}

	static int gcf(int n, int d) {
		int gcf = 1;

		for (int i = 2; i <= n; i++) {
			if ((n % i == 0) && (d % i == 0)) {
				gcf = i;
			}
		}
		return gcf;
	}
}
