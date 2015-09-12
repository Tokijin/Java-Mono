package casteel.game.anime;

public class Player {

	private String name;
	private int    ID;
	private Wallet myWallet;
	
	public Player ( int ID ) {
		this.name     = null;
		this.ID       = ID;
		this.myWallet = new Wallet( ID );
	}
	
	
}
