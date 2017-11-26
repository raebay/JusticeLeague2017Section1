package Model;
public class Player extends Character 
{
	Inventory pInventory; 
	Room pLocation; 

	public Player(int health, Inventory pInventory, Room pLocation) 
	{
		super(health, health, health, health);
		this.pInventory = pInventory; 
		this.pLocation = pLocation; 

	}
	
	public Inventory getpInventory() 
	{
		return pInventory;
	}


	public void setpInventory(Inventory pInventory) 
	{
		this.pInventory = pInventory;
	}

	public Room getpLocation()
	{
		return pLocation;
	}

	public void setpLocation(Room pLocation) 
	{
		this.pLocation = pLocation;
	}

	public void move(Room room)
	{
		 
	}
		
	public void escape()
	{
		
	}
	
	public void surrender()
	{
		
	}
	
	public void surrenderHint()
	{
		
	}
	
	public void winFight()
	{
		
	}
	
	public void loseFight()
	{
		
	}

}
