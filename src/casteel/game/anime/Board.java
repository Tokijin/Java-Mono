package casteel.game.anime;

import java.util.ArrayList;

import casteel.game.anime.Square.groups;
import casteel.game.anime.Square.squareType;

public class Board {

	// Constants
	private static final int NUM_SQUARES = 40;	     // Total number of squares on board
	
	private Square[] gameboard;
	private int freeParking = 500;
	private Deck chanceDeck;
	private Deck chestDeck;
	
	// Standard Constructor
	public Board(){
		gameboard = new Square[NUM_SQUARES];
	}
	
	
	public void initBoard(){
		
		// Go! - 0
		gameboard[0].setName("Go!");
		gameboard[0].setType(squareType.GO);
		
		// Mediteranean Avenue - 1
		gameboard[1].setName("Sailor Moon");
		gameboard[1].setType(squareType.PROPERTY);
		gameboard[1].setPrice(60);
		gameboard[1].setRent(new int[]{1,2,3,4,5});
		gameboard[1].setMonopolyGroup(groups.TOEI_ANIMATION);
		
		// Community Chest - 2
		gameboard[2].setName("Community Chest");
		gameboard[2].setType(squareType.COMMUNITY_CHEST);
		
		// Baltic Avenue - 3
		gameboard[3].setName("DragonBall");
		gameboard[3].setType(squareType.PROPERTY);
		gameboard[3].setPrice(80);
		gameboard[3].setRent(new int[]{2,3,4,5,6});
		gameboard[3].setMonopolyGroup(groups.TOEI_ANIMATION);
		
		// Income Tax - 4
		gameboard[4].setName("Income Tax");
		gameboard[4].setType(squareType.TAX);
		
		// Reading Railroad - 5
		gameboard[5].setName("TBS");
		gameboard[5].setType(squareType.RAILROAD);
		gameboard[5].setPrice(200);
		gameboard[5].setRent(new int[]{ 25, 50, 100, 200});
		gameboard[5].setMonopolyGroup(groups.TV_STATIONS);
		
		// Oriental Avenue - 6
		gameboard[6].setName("Blood+/Kimi ni Todoke");
		gameboard[6].setType(squareType.PROPERTY);
		gameboard[6].setPrice(100);
		gameboard[6].setRent(new int[]{2,3,4,5,6});
		gameboard[6].setMonopolyGroup(groups.PRODUCTION_IG);
		
		// Chance - 7
		gameboard[7].setName("Chance");
		gameboard[7].setType(squareType.CHANCE);
		
		// Vermont Avenue - 8
		gameboard[8].setName("Higashi no Eden");
		gameboard[8].setType(squareType.PROPERTY);
		gameboard[8].setPrice(100);
		gameboard[8].setRent(new int[]{2,3,4,5,6});
		gameboard[8].setMonopolyGroup(groups.PRODUCTION_IG);
		
		// Connecticut Avenue - 9
		gameboard[9].setName("Ghost in the Shell");
		gameboard[9].setType(squareType.PROPERTY);
		gameboard[9].setPrice(120);
		gameboard[9].setRent(new int[]{2,3,4,5,6});
		gameboard[9].setMonopolyGroup(groups.PRODUCTION_IG);
		
		// Jail - 10
		gameboard[10].setName("Jail");
		gameboard[10].setType(squareType.JAIL);
		
		// St. Charles Place - 11
		gameboard[11].setName("Suzumiya Haruhi no Yuuutsu");
		gameboard[11].setType(squareType.PROPERTY);
		gameboard[11].setPrice(140);
		gameboard[11].setRent(new int[]{2,3,4,5,6});
		gameboard[11].setMonopolyGroup(groups.KYOTO_ANIMATION);
		
		// Electric Company - 12
		gameboard[12].setName("Electric Company");
		gameboard[12].setType(squareType.UTILITY);
		gameboard[12].setPrice(150);
		gameboard[12].setRent(new int[]{4,10});
		gameboard[12].setMonopolyGroup(groups.UTILITY);
		
		// States Avenue - 13
		gameboard[13].setName("K-On!");
		gameboard[13].setType(squareType.PROPERTY);
		gameboard[13].setPrice(140);
		gameboard[13].setRent(new int[]{2,3,4,5,6});
		gameboard[13].setMonopolyGroup(groups.KYOTO_ANIMATION);
		
		// Virginia Avenue - 14
		gameboard[14].setName("Lucky Star");
		gameboard[14].setType(squareType.PROPERTY);
		gameboard[14].setPrice(160);
		gameboard[14].setRent(new int[]{2,3,4,5,6});
		gameboard[14].setMonopolyGroup(groups.KYOTO_ANIMATION);
		
		// Pennsylvania Railroad - 15
		gameboard[15].setName("TV Tokyo");
		gameboard[15].setType(squareType.RAILROAD);
		gameboard[15].setPrice(200);
		gameboard[15].setRent(new int[]{25, 50, 100, 200});
		gameboard[15].setMonopolyGroup(groups.TV_STATIONS);
		
		// St. James Place - 16
		gameboard[16].setName("Shakugan no Shana");
		gameboard[16].setType(squareType.PROPERTY);
		gameboard[16].setPrice(180);
		gameboard[16].setRent(new int[]{2,3,4,5,6});
		gameboard[16].setMonopolyGroup(groups.JC_STAFF);
		
		// Community Chest - 17
		gameboard[17].setName("Community Chest");
		gameboard[17].setType(squareType.COMMUNITY_CHEST);
		
		// Tennessee Avenue - 18
		gameboard[18].setName("Azumanga Diaoh");
		gameboard[18].setType(squareType.PROPERTY);
		gameboard[18].setPrice(180);
		gameboard[18].setRent(new int[]{2,3,4,5,6});
		gameboard[18].setMonopolyGroup(groups.JC_STAFF);
		
		// New York Avenue - 19
		gameboard[19].setName("Toradora!");
		gameboard[19].setType(squareType.PROPERTY);
		gameboard[19].setPrice(200);
		gameboard[19].setRent(new int[]{2,3,4,5,6});
		gameboard[19].setMonopolyGroup(groups.JC_STAFF);
		
		// Free Parking - 20
		gameboard[20].setName("Free Fansubs");
		gameboard[20].setType(squareType.FREE_PARKING);
		
		// Kentucky Avenue - 21
		gameboard[21].setName("Eureka Seven");
		gameboard[21].setType(squareType.PROPERTY);
		gameboard[21].setPrice(220);
		gameboard[21].setRent(new int[]{2,3,4,5,6});
		gameboard[21].setMonopolyGroup(groups.BONES);
		
		// Chance - 22
		gameboard[22].setName("Chance");
		gameboard[22].setType(squareType.CHANCE);
		
		// Indiana Avenue - 23
		gameboard[23].setName("Darker than Black");
		gameboard[23].setType(squareType.PROPERTY);
		gameboard[23].setPrice(220);
		gameboard[23].setRent(new int[]{2,3,4,5,6});
		gameboard[23].setMonopolyGroup(groups.BONES);
		
		// Illinois Avenue - 24
		gameboard[24].setName("Fullmetal Alchemist");
		gameboard[24].setType(squareType.PROPERTY);
		gameboard[24].setPrice(240);
		gameboard[24].setRent(new int[]{2,3,4,5,6});
		gameboard[24].setMonopolyGroup(groups.BONES);
		
		// B.O. Railroad - 25
		gameboard[25].setName("???");
		gameboard[25].setType(squareType.PROPERTY);
		gameboard[25].setPrice(200);
		gameboard[25].setRent(new int[]{2,3,4,5,6});
		gameboard[25].setMonopolyGroup(groups.TV_STATIONS);
		
		// Atlantic Avenue - 26
		gameboard[26].setName("Highschool of the Dead");
		gameboard[26].setType(squareType.PROPERTY);
		gameboard[26].setPrice(260);
		gameboard[26].setRent(new int[]{2,3,4,5,6});
		gameboard[26].setMonopolyGroup(groups.MADHOUSE_STUDIOS);
		
		// Ventnor Avenue - 27
		gameboard[27].setName("Death Note");
		gameboard[27].setType(squareType.PROPERTY);
		gameboard[27].setPrice(260);
		gameboard[27].setRent(new int[]{2,3,4,5,6});
		gameboard[27].setMonopolyGroup(groups.MADHOUSE_STUDIOS);
		
		// Water Company - 28
		gameboard[28].setName("Water Company");
		gameboard[28].setType(squareType.UTILITY);
		
		// Marvin Gardens - 29
		gameboard[29].setName("Black Lagoon");
		gameboard[29].setType(squareType.PROPERTY);
		gameboard[29].setPrice(280);
		gameboard[29].setRent(new int[]{2,3,4,5,6});
		gameboard[29].setMonopolyGroup(groups.MADHOUSE_STUDIOS);
		
		// Go to Jail - 30
		gameboard[30].setName("Go to Jail");
		gameboard[30].setType(squareType.GOTO_JAIL);
		
		// Pacific Avenue - 31
		gameboard[31].setName("Panty & Stocking");
		gameboard[31].setType(squareType.PROPERTY);
		gameboard[31].setPrice(300);
		gameboard[31].setRent(new int[]{2,3,4,5,6});
		gameboard[31].setMonopolyGroup(groups.GAINAX);
		
		// North Carolina Avenue - 32
		gameboard[32].setName("Tengen Toppa Gurren Lagann");
		gameboard[32].setType(squareType.PROPERTY);
		gameboard[32].setPrice(80);
		gameboard[32].setRent(new int[]{2,3,4,5,6});
		gameboard[32].setMonopolyGroup(groups.GAINAX);
		
		// Community Chest - 33
		gameboard[30].setName("Community Chest");
		gameboard[30].setType(squareType.COMMUNITY_CHEST);
		
		// Pennsylvania Avenue - 34
		gameboard[34].setName("Neon Genesis Evangelion");
		gameboard[34].setType(squareType.PROPERTY);
		gameboard[34].setPrice(80);
		gameboard[34].setRent(new int[]{2,3,4,5,6});
		gameboard[34].setMonopolyGroup(groups.GAINAX);
		
		// Short Line - 35
		gameboard[35].setName("???");
		gameboard[35].setType(squareType.PROPERTY);
		gameboard[35].setPrice(80);
		gameboard[35].setRent(new int[]{2,3,4,5,6});
		gameboard[35].setMonopolyGroup(groups.TV_STATIONS);
		
		// Chance - 36
		gameboard[30].setName("Chance");
		gameboard[30].setType(squareType.CHANCE);
		
		// Park Place - 37
		gameboard[37].setName("Mahou Shoujo Madoka Magika");
		gameboard[37].setType(squareType.PROPERTY);
		gameboard[37].setPrice(80);
		gameboard[37].setRent(new int[]{2,3,4,5,6});
		gameboard[37].setMonopolyGroup(groups.SHAFT);
		
		// Luxery Tax - 38
		gameboard[30].setName("Go to Jail");
		gameboard[30].setType(squareType.GOTO_JAIL);
		
		// Boardwalk - 39
		gameboard[39].setName("Bakemonogatari");
		gameboard[39].setType(squareType.PROPERTY);
		gameboard[39].setPrice(80);
		gameboard[39].setRent(new int[]{2,3,4,5,6});
		gameboard[39].setMonopolyGroup(groups.SHAFT);
		
	} // end of initBoard()
	
	
	public void checkMonopolySquare(Square s){
		int neighbors = 1;
		
		// Look at each square on the board:
		for (Square tmp : gameboard){
			
			// Does square belongs to the same group as the square in question:
			if (tmp.getGroup() == s.getGroup()){
				
				//Increment neighbor counter
				neighbors++;
				
				//Check to see if properties are owned by the same player
				if (tmp.getOwner() != s.getOwner()){
					//If not, then it isn't a monopoly
					return;
				}
				
				//If so, then check to see if this is the final neighbor
				if (neighbors == s.getNumNeighbors()){
					//Set flag on square so that rent can be adjusted
					s.setMonopoly();
					return;
				}
				
			}
			
		}
		
	} // end of checkMonopolySquare(Square)
	
	
	public void checkMonopoly(){
		
		for (Square tmp : gameboard){
			
			//Check to see if this is a property, utility or railroad
			if (tmp.getType() == squareType.PROPERTY ||
					tmp.getType() == squareType.RAILROAD ||
					tmp.getType() == squareType.UTILITY) {
				checkMonopolySquare(tmp);
			}
			
			
		}
		
	} // end of checkMonopoly()
	
	
} // end of Board class
