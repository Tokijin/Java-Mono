package casteel.game.anime;

public class Dice {
	
	private int currentValue;
	
	
	public int roll() {
		int newValue;
		
		// Come up with a random dice roll
		newValue = 2;
		
		this.currentValue = newValue;
		return newValue;
	}
	
	public int getValue() {
		return currentValue;
	}
	
}
