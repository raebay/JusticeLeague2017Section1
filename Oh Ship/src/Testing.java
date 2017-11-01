import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Testing 
{

	//Creating array list for room objects to be stored
	public static ArrayList<Room> rooms = new ArrayList<>();

	
	public static void main(String[] args) 
	{
		
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
	      System.out.println("File not found - terminating program");
	      System.exit(0);
	  	e.printStackTrace();
	  }
	  

	   //Read room into array list
	    while (roomReader.hasNext())
	    {
	    	// read room
	    	String rID = roomReader.nextLine();
	    	String rName = roomReader.nextLine();
	    	String description = roomReader.nextLine();
	    	// create new Room instance and add to ArrayList
	    	Room temps = new Room(rID, rName, description);
	    	rooms.add(temps);
	    	}
	    }

		Room currentRoom = new Room();
		currentRoom = rooms.get(0);
		
/*		for(Room temps: rooms)
		{
			currentRoom = temps.findRoom("1.a");
		}
		*/
		Iterator<Room> iterator = rooms.iterator();
		
			while(iterator.hasNext())
		{
			Room temp = new Room(); 	 
			temp = iterator.next(); 
			
			if(currentRoom.getrID() == temp.getrID())
			{
				currentRoom = temp.findRoom("1.a");
				System.out.println(currentRoom.toString()); 
				break;

			}
			else if(currentRoom.getrID() != temp.getrID())
			{
				iterator.next(); 
			}
		
		}

	}


}
	

