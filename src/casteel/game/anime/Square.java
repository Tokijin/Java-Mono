package casteel.game.anime;

public class Square {

	//Constants
	//private static final int MAX_HOUSES = 5; 	//4 Houses and Hotel
		
	private String name;
	public static enum squareType {PROPERTY, RAILROAD, UTILITY, TAX, JAIL,
								CHANCE, COMMUNITY_CHEST, FREE_PARKING, GO,
								GOTO_JAIL};
	private squareType type;
	private int owner = 0;
	public static enum groups {SHAFT, GAINAX, MADHOUSE_STUDIOS, 
								PRODUCTION_IG, TV_STATIONS, TOEI_ANIMATION,
								KYOTO_ANIMATION, BONES, JC_STAFF, UTILITY}
	private groups grouping;
	private boolean mono;
	private int price;
	private int rent[];
	private int numNeighbors;
	
	
	public void setName(String n){
		
		name = n;
	}
	
	
	public void setType(squareType t){
		
		type = t;
	}
	
	public void setPrice(int p){
		
		price = p;
	}
	
	
	public void setRent(int[] r){
		
		rent = r;
	}
	
	
	public void setMonopolyGroup(groups g){
		
		grouping = g;
	}
	
	
	public void setNumNeighbors(int i){
		
		numNeighbors = i;
	}
	
	
	public void setMonopoly(){
		
		//Check grouping for same owner
		mono = true;
	}
	
	
	public void buySquare(int own){
		
		owner = own;
	}
	
	
	public String getName(){
		
		return name;
	}
	
	
	public squareType getType(){
		
		return type;
	}
	
	
	public int getOwner(){
		
		return owner;
	}
	
	
	public int getPrice(){
		
		return price;
	}
	
	
	public int getRent(int numHouses) {
	
		return rent[numHouses];
	}
	
	
	public int getNumNeighbors(){
		
		return numNeighbors;
	}
	public Square.groups getGroup(){
		
		return grouping;
	}
	
	
	public boolean hasMonopoly(){
		
		return mono;
	}
}
