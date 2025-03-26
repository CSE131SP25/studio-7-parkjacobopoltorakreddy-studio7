package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private String hand;
	private int goal;
	private int assist;
	private int point;
	private int game;
	private int totalPoint;
	
	public HockeyPlayer (String name, int jerseyNumber,String hand) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.hand = hand;
		
	 }
	public int Game(int goal, int assist) {
		point = goal + assist;
		totalPoint += point;
		game++;
		return totalPoint;
	}
	
	public static void main (String[]args) {
		HockeyPlayer jeff = new HockeyPlayer("Jeff", 7, "left");
		System.out.println(Game(2,3));
		
	}
}
