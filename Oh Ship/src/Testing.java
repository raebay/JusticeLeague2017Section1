import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Testing 
{

	public static void main(String[] args) 
	{
		ArrayList<Room> rooms = new ArrayList<>();
		File roomFile = new File("roomFile.txt");
		// open a Scanner to read data from File
		
		Scanner roomReader = null;   {
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
	    
	    System.out.println(rooms);
	    
	}

}
