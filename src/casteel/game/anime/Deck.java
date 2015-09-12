package casteel.game.anime;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	//Constants
	private static final int DECK_SIZE = 15;
	
	//Instance Variables
	private ArrayList <Card> deck;
	public enum Type { CHANCE, COMMUNITY_CHEST };
	
	
	public Deck(Deck.Type t){
		if (t == Type.CHANCE){
			deck = createChance();
		} else {
			deck = createCommunityChest();
		}
	}
	
	
	public ArrayList <Card> createChance(){
		ArrayList <Card> temp = new ArrayList <Card>(DECK_SIZE);
		
		temp.add(0, new Card("Advance to Go (Collect $200)"));
		temp.add(1, new Card("Advance to Illinois Ave (If you pass" +
				" Go, collect $200)"));
		temp.add(2, new Card("Advance token to nearest Utility. If unowned, " +
				"you may buy it from the Bank. If owned, throw dice and pay " +
				"owner a total ten times the amount thrown."));
		temp.add(3, new Card("Advance token to the nearest Railroad and pay " +
				"owner twice the rental to which he/she is otherwise " +
				"entitled. If Railroad is unowned, you may buy it from the Bank."));
		temp.add(4, new Card("Advance to St. Charles Place (If you pass Go, " +
				"collect $200)"));
		temp.add(5, new Card("Bank pays you dividend of $50"));
		temp.add(6, new Card("Get out of jail free (This card may be kept " +
				"until needed, or traded/sold)"));
		temp.add(7, new Card("Go back 3 spaces"));
		temp.add(8, new Card("Go directly to Jail (Do not pass Go, do not " +
				"collect $200)"));
		temp.add(9, new Card("Make general repairs on all your property - For " +
				"each house pay $25 - for each hotel pay $100"));
		temp.add(10, new Card("Pay poor tax of $15"));
		temp.add(11, new Card("Take a trip to Reading Railroad (If you pass Go, " +
				"collect $200"));
		temp.add(12, new Card("Take a walk on the Boardwalk (Advance token " +
				"to Boardwalk)"));
		temp.add(13, new Card("You have been elected chairman of the board - " +
				"pay each player $50"));
		temp.add(14, new Card("Your building load matures - Collect $150"));
		return temp;
	}
	
	
	public ArrayList <Card> createCommunityChest(){
		ArrayList <Card> temp = new ArrayList <Card>(DECK_SIZE);
		
		temp.add(0, new Card("Advance to Go (Collect $200)"));
		temp.add(1, new Card("Bank error in your favor - Collect $75"));
		temp.add(2, new Card("Doctor's fees - Pay $50"));
		temp.add(3, new Card("Get out of jail free (This card may be kept " +
				"until needed or traded/sold"));
		temp.add(4, new Card("Go to jail (Do not pass Go, do not collect $200)"));
		temp.add(5, new Card("Income Tax refund - Collect $20"));
		temp.add(6, new Card("Life Insurance Matures - Collect $100"));
		temp.add(7, new Card("Pay School Fees of $50"));
		temp.add(8, new Card("Grand Opera Night - Collect $50 from every " +
				"player for opening night seats"));
		temp.add(9, new Card("You are assessed for street repairs - $40 per " +
				"house, $115 per hotel"));
		temp.add(10, new Card("You have won second prize in a beauty contest " +
				"- Collect $10"));
		temp.add(11, new Card("You inherit $100"));
		temp.add(12, new Card("From sale of stock you get $50"));
		temp.add(13, new Card("Holiday Fund matures - Receive $100"));
		temp.add(14, new Card("Pay Hospital Fees of $100"));
		return temp;
	}
	
	
	public void shuffle(){
		Random gen = new Random();
		Card temp;
		int index, ran;
		
		for (int i=0; i<DECK_SIZE; i++){
			//temp = new Card(getCardSuit(i), getCardVal(i));
			temp = deck.get(i);
			ran = Math.abs(gen.nextInt());
			index = (ran%(DECK_SIZE - i) + i);
			deck.set(i, deck.get(index));
			deck.set(index, temp);
		}
	}
	
	
	public Card take(){
		Card last = deck.get(0);
		
		for (int i=0; i<DECK_SIZE-1; i++){
			deck.set(i, (Card) deck.remove(i+1));
		}
		deck.set(DECK_SIZE-1, last);
		
		return last;
	}
	

	public Card peek(){
		
		return deck.get(0);
	}
}
