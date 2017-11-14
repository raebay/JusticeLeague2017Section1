import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import Model.Item;

public class Room extends Testing
{

	public String rID = "";
	public String rName = "";
	public String rDescription = "";
	public Item rItems; 
	public Monster rMonsters; 
	public String doors = "";

	//Room constructors 
    public Room()
    {
    	
    }
    
	public Room(String rID, String rName, String rDescription, String doors, String rItems, String rMonsters)
	{
		this.rID = rID; 
		this.rName = rName; 
		this.rDescription = rDescription;  
		this.doors = doors; 
		
	}
	public Room(String rID, String rName, String rDescription, String doors, Item rItems, Monster rMonsters)
	{
		this.rID = rID;
		this.rName = rName;
		this.rDescription = rDescription;
		this.doors = doors; 
		this.rItems = rItems;
		this.rMonsters = rMonsters;
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

	public void setDoors(String doors) 
	{
		this.doors = doors;
	}
	
	public String getDoors() 
	{
		return doors;
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

	
		//toString method
	   @Override
	   public String toString()
	   {
		   return "Room: Room ID=" + rID + ", Room Name=" + rName
		         + ", Room Description=" + rDescription + "";
	   }
	

}
