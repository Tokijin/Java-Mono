package casteel.game.anime;

import java.awt.Image;

public class Card {

	//Instance Variables
	private String text;
	private Image pic;
	
	//Temporary Constructor.... remove once pictures added
	public Card (String s){
		
		text = s;
	}
	
	
	/**
	 * Constructor...
	 * @param s Text to be displayed when card is selected
	 * @param i Image to be displayed when card is selected
	 */
	public Card(String s, Image i){
		
		text = s;
		pic = i;
	}
	
	
	/**
	 * Gets String value for this card.
	 * @return String value associated with current card
	 */
	public String getText(){
		
		return text;
	}
	
	
	/**
	 * Gets Image for this card.
	 * @return Image associated with current card
	 */
	public Image getPic(){
		
		return pic;
	}
}
