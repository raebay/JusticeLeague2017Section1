import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Room extends Testing
{

	public String rID = "";
	public String rName = "";
	public String rDescription = "";
	public Item rItems; 
	public Monster rMonsters; 
	public Puzzle rPuzzles;
	

	//Room constructors 
    public Room()
    {
    	
    }
    
	public Room(String rID, String rName, String rDescription)
	{
		this.rID = rID; 
		this.rName = rName; 
		this.rDescription = rDescription; 
	}
	public Room(String rID, String rName, String rDescription, Item rItems, Monster rMonsters, Puzzle rPuzzles)
	{
		this.rID = rID;
		this.rName = rName;
		this.rDescription = rDescription;
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
	
	public Item searchRoom()
	{
		return rItems; 
	}
	
		//toString method
	   @Override
	   public String toString()
	   {
		   return "Room: Room ID=" + rID + ", Room Name=" + rName
		         + ", Room Description=" + rDescription + "";
	   }

	   //Method to locate a room object by it's ID 
	   public Room findRoom(String roomID)
	   {	
		   Room temp = new Room();
		   
		   for (Room obj: rooms)
		   {
			   if(obj.rID.equals(roomID))
			   {
				temp = rooms.get(rooms.indexOf(rID));
				System.out.println(temp);
				return temp;
			   }
			   else
				   return null; 
	
		   }
		return temp; 
	
	   }
	

}
