package Model;
import Model.Item;

public class Room //extends Testing
{

	public String rID = "";
	public String rName = "";
	public String rDescription = "";
	public Item rItems; 
	public Monster rMonsters; 
	public Door rDoors;
	public Puzzle rPuzzles;

	//Room constructors 
    public Room()
    {
    	
    }
    
	public Room(String rID, String rName, String rDescription, String rDoors, String rItems, String rMonsters, String rPuzzles)
	{
		this.rID = rID; 
		this.rName = rName; 
		this.rDescription = rDescription;  
		
		 
		
	}
	public Room(String rID, String rName, String rDescription, Door rDoors, Item rItems, Monster rMonsters, Puzzle rPuzzles)
	{
		this.rID = rID;
		this.rName = rName;
		this.rDescription = rDescription;
		this.rDoors = rDoors; 
		this.rItems = rItems;
		this.rMonsters = rMonsters;
		this.rPuzzles = rPuzzles;
	}

	//getters and setters for room attributes
	public String getrID() 
	{
		return rID;
		
	}

	public void setrID(String rID) 
	{
		this.rID = rID; 
	}

	public String getrName()
	{
		return rName;
	}

	public void setrName(String rName)
	{
		this.rName = rName;
	}

	public String getrDescription() 
	{
		return rDescription;
	}

	public void setrDoors(Door rDoors) 
	{
		this.rDoors = rDoors;
	}
	
	public Door getrDoors() 
	{
		return rDoors;
	}

	public void setrDescription(String rDescription) 
	{
		this.rDescription = rDescription;
	}
	
	public Item getrItems() 
	{
		return rItems;
	}

	public void setrItems(Item rItems) 
	{
		this.rItems = rItems;
	}

	public Monster getrMonsters() 
	{
		return rMonsters;
	}

	public void setrMonsters(Monster rMonsters)
	{
		this.rMonsters = rMonsters;
	}
	public Puzzle getrPuzzles() 
	{
		return rPuzzles;
	}
	public void setrPuzzles(Puzzle rPuzzles)
	{
		this.rPuzzles = rPuzzles;
	}
	

	public int getRoomNumber()
	{
		if( rID.length()!=2)
			return 0 ;
		
		return Integer.parseInt( rID.substring(1)) ;
	}
	
	public char getRoomType()
	{
		if( rID.length()!=2)
			return 0 ;
		
		return rID.charAt(0);
	}
		//toString method
	   @Override
	   public String toString()
	   {
		   return "Room: Room ID=" + rID + ", Room Name=" + rName
		         + ", Room Description=" + rDescription + "";
	   }
	

}
