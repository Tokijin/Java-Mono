package casteel.game.anime;

public class Wallet {

	private static final int STARTING_MONEY = 1500;
	
	private int ownerID;
	private int cash;
	
	public Wallet( int ID ) {
		this.ownerID = ID;
		this.cash    = STARTING_MONEY;
	}
	
	public int getCurrentMonies( int ID ) {
		verifyOwner( ID );
		return this.cash;
	}
	
	public int getOwnerID( int ID ) {
		verifyOwner( ID );
		return this.ownerID;
	}
	
	public void pay( int ID, int cost ) {
		verifyOwner( ID );
		this.cash -= cost;
	}
	
	public void receive( int ID, int payment ) {
		verifyOwner( ID );
		this.cash += payment;
	}
	
	private void verifyOwner( int ID ) {
		if ( ID != this.ownerID ) {
			//throw exception;
		}
	}
}
