package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public Complex (double real,double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public String add(Complex c1) {
		double newReal = 0.0;
		double newImaginary = 0.0;
			newReal = this.real + c1.real;
			newImaginary = this.imaginary + c1.imaginary;
		return newReal + "+" + newImaginary + "i";
	}
	
	public String multiply(Complex c1) {
		double newReal = 0.0;
		double newImaginary = 0.0;
			newReal = this.real * c1.real - this.imaginary * c1.imaginary;
			newImaginary = this.real * c1.imaginary + this.imaginary * c1.real;
		return newReal + "+" + newImaginary + "i";
	} 
	public static void main (String[]args) {
		Complex carl = new Complex(4.0,6.0);
		Complex cindy = new Complex(2.0,5.0);
		System.out.println (carl.add(cindy));
		System.out.println (carl.multiply(cindy));
		

	}
}
