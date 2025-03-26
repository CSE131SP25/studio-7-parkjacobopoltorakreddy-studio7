package studio7;

public class Rectange {
	
	//instance variables
	private double length;
	private double width; 
	
	 //constructor
	public Rectange (double length, double width) {
		this.length = length; // use "this" to change the value of instance variable 
		this.width = width;
	}
	
	public double calculateArea () {
		return length * width; 

}
	public double perimeter () {
		return (length + width) *2 ; 

}
	public boolean compare(Rectange r1) { 
		// compare this.calculateArea vs. r1.calculateArea 
		double a1 = r1.calculateArea(); 
		double a2 = this.calculateArea(); 
		if (a1 > a2) {
			return true;
		} else 
			return false;
	}
	public boolean ifSquare() {
		if (length == width) {
			return true;
		} else
			return false;
	}
	
	public static void main (String [] args){
	Rectange Bob = new Rectange (3.0,2.0); //creating objects (Bob is the name of our Rectange object) 
	Rectange Max = new Rectange (4.0,5.0);
	System.out.println (Bob.calculateArea());
	System.out.println (Bob.perimeter());
	System.out.println (Bob.compare(Max));//comparison
	System.out.println (Bob.ifSquare());//if Sqaure
	
	
	}
}

