import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Room 
{

	public String rID = "";
	public String rName = "";
	public String rDescription = "";
	public Item rItems; 
	public Monster rMonsters; 
	public Puzzle rPuzzles;
	
	public static ArrayList<Room> rooms = new ArrayList<>();
	
	File roomFile = new File("roomFile.txt");
	// open a Scanner to read data from File
	
	Scanner roomReader = null;  
	{
   try
	{
      roomReader = new Scanner(roomFile);
	
  } 
	catch (FileNotFoundException e)
  {
      // TODO Auto-generated catch block
      System.out.println("File not found - terminating program");
      System.exit(0);
  	e.printStackTrace();
  }
  

   
    while (roomReader.hasNext())
    {
    	// read room
    	String rID = roomReader.nextLine();
    	String rName = roomReader.nextLine();
    	String description = roomReader.nextLine();
    	// create new Room instance and add to ArrayList
    	Room temp = new Room(rID, rName, description);
    	rooms.add(temp);
    	}
    }


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
	
	   @Override
	   public String toString()
	   {
		   return "Room: Room ID=" + rID + ", Room Name=" + rName
		         + ", Room Description=" + rDescription + "";
	   }

	   public Room findRoom(String roomID)
	   {	
		   Room temp = new Room();
		   
		   for (Room obj: rooms)
		   {
			   if(obj.rID.equals(roomID))
			   {
				temp = rooms.get(rooms.indexOf(rID));
				System.out.println(temp);
			   }
			   else
				   return null; 
	
		   }
		return temp;
	
	   }
	

}
