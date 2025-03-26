package studio7;

public class Die {
	
	//instance variables (must be private!!)
	private int n;
	
	//constructor
	public Die(int n) {
		this.n = n;
	}
	public int randomNumber () {//new method
		return (int)((Math.random()*n)+1);
	}
	//main method
	public static void main (String[]args) {
		Die philip = new Die (6);//new object
		System.out.println (philip.randomNumber());//dot method
	}

}
