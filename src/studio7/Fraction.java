package studio7;

public class Fraction {
	//instance variables
	private double numerator;
	private double denominator;

	//constructor
	public Fraction (double numerator,double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public String add(Fraction f1) {
		double newNumerator = 0.0;
		double newDenominator = 0.0;
		if (this.denominator == f1.denominator) {
			newNumerator = this.numerator + f1.numerator;
		} else {
			newDenominator = this.denominator * f1.denominator;
			newNumerator = this.denominator * (f1.numerator) + this.denominator * (f1.numerator);
		}
		return newNumerator + "/" + newDenominator;
	}
	
	public String multiply(Fraction f1) {//multiply method
		double newNumerator = this.numerator * f1.numerator;
		double newDenominator =this.denominator * f1.denominator;
		return newNumerator + "/" + newDenominator;
	}
	public String reciprocal() {//reciprocal 
		double newNumerator = denominator;
		double newDenominator = numerator;
		return newNumerator + "/" + newDenominator;
	}
	
	//main method
	public static void main (String[]args) {
		Fraction frank = new Fraction(4.0,6.0);
		Fraction freud = new Fraction (2.0,5.0);
		System.out.println (frank.add(freud));
		System.out.println (frank.multiply(freud));
		System.out.println (frank.reciprocal());
	}
}
