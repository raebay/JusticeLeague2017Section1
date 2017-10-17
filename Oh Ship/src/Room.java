
public class Room 
{

	public String rID = "";
	public String rName = "";
	public String rDescription = "";
	public Item rItems; 
	public Monster rMonsters; 
	public Puzzle rPuzzles;

	public Room(String rID, String rName, String rDescription, Item rItems, Monster rMonsters, Puzzle rPuzzles)
	{
		this.rID = rID;
		this.rName = rName;
		this.rDescription = rDescription;
		this.rItems = rItems;
		this.rMonsters = rMonsters;
		this.rPuzzles = rPuzzles;
	}

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
	
	public String printDescription()
	{
		return rDescription; 
	}
	
	public Item searchRoom()
	{
		return rItems; 
	}
	
	

}
