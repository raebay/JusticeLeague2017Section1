package Model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Model.Item;

public class Testing 
{

	
	
	
	//Creating array list for room objects to be stored
	public static ArrayList<Room> rooms = new ArrayList<>();
	
	//Creating array list for puzzle objects to be stored
	public static ArrayList<Puzzle> puzzles = new ArrayList<>(); 
	

	public static void main(String[] args) 
	{
		
		/**
		 * This part is to read in the room file and save each room object in an arrayList 
		 */
		
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
	    	String doors = roomReader.nextLine(); 
	    	String items = roomReader.nextLine(); 
	    	String monsters = roomReader.nextLine(); 
	    	
	    	// create new Room instance
	    	Room temps = new Room(rID, rName, description, doors, items, monsters);
	    	
	    	//adding Item objects
	    	Item rItems = new Item();
	    	rItems.setiName(items);
	    	temps.setrItems(rItems);
	    	
	    	//adding Monster objects
	    	Monster rMonsters = new Monster(monsters, monsters, monsters, monsters, null);
	    	rMonsters.setName(monsters);
	    	temps.setrMonsters(rMonsters);
	    	
	    	//adding whole temps object to rooms arrayList
	    	rooms.add(temps);	    	
	    	}
	    
		/**
		 * This part is to read in the puzzle file and save each puzzle object in an ArrayList
		 */
		File puzzleFile = new File("puzzleFile.txt");
		// open a Scanner to read data from File
		
		Scanner puzzleReader = null;  
		{
	   try
		{
	      puzzleReader = new Scanner(puzzleFile);
		
	  } 
		catch (FileNotFoundException e)
	  {
	      System.out.println("File not found - terminating program");
	      System.exit(0);
	  	e.printStackTrace();
	  }
	  

	   //Read puzzle into array list
	    while (puzzleReader.hasNext())
	    {
	    	// read puzzle
	    	String pName = puzzleReader.nextLine();
	    	String pDescription = puzzleReader.nextLine();
	    	String pHint = puzzleReader.nextLine();
	    	String pRooms = puzzleReader.nextLine(); 
	    	String pHintR = puzzleReader.nextLine(); 
	    	
	    	// create new Puzzle instance
	    	Puzzle temps = new Puzzle(pName, pDescription, pHint, pRooms, pHintR); 
	    	
	    	//Adding room objects to the puzzles 
	    	Room pRoom = Testing.findRoom(pRooms);
	    	temps.setpRooms(pRoom);
	    	
	    	//Adding room hint to puzzles 
	    	Room pHintRoom = Testing.findRoom(pHintR);
	    	temps.setpHintRoom(pHintRoom);
	    	
	    	//adding whole temps object to puzzles arrayList
	    	puzzles.add(temps);	    	
	    	}

	    
	
	    }
}
		
		//This is literally just testing all the shit I've written so far.
		//The puzzles read into the puzzle arrayList and print accordingly, as do the rooms. 
		//Can't quite get the puzzle object in the rooms arrayList to correspond to 
		//the puzzle object from the puzzles arrayList 

		Room currentRoom = new Room();
		currentRoom = findRoom("1.a");
		
		for(Puzzle puzzle: puzzles)
		{
			System.out.println(puzzle.toString());
		}
		
		


	}
	
	//Method finds a room object based on its roomID 
	public static Room findRoom(String roomID)
	{
		for (Room obj: rooms)
		{
			if(obj.rID.equals(roomID))
			{
				System.out.println(obj);
				return obj;
			}
		}
		return null;

	}
	
	//Method for finding puzzles in a certian room. Used in the rooms array list. 
	//Probably will need a similar method for finding the monsters and items in a room 
	//when the monsters and items array lists are made
	public static Puzzle findPuzzle(String puzzleName)
	{
		for (Puzzle obj: puzzles)
		{
			if(obj.getpName().equals(puzzleName))
			{
				return obj;
			}
		}
		return null;

	}
	
}
