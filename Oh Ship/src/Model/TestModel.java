package Model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Model.*;


public class TestModel {

	//private String input;
	private String output;
	
	// this is a temp var that I need to access the current room ID. This is true speghetti code, I'm sorry. -Zach
	public String currentRoomID;
	
	
	//Creating array list for room and item objects to be stored
	public static ArrayList<Room> rooms = new ArrayList<>();
	public static ArrayList<Item> items = new ArrayList<>(); 
    public static ArrayList<Monster> monsters = new ArrayList<>();
	/**
	 * This part is to read in the items file and save each item object in an arrayList 
	 */
	
	File itemFile = new File("itemFile");
	// open a Scanner to read data from File
	
	Scanner itemReader = null;  
	{
   try
	{
      itemReader = new Scanner(itemFile);
	
  } 
	catch (FileNotFoundException e)
  {
      System.out.println("File not found - terminating program");
      System.exit(0);
  	e.printStackTrace();
  }
  

   //Read item into array list
    while (itemReader.hasNext())
    {
    	// read item
    	String iID = itemReader.nextLine();
    	String iName = itemReader.nextLine();
    	String iDescription = itemReader.nextLine();
    	
    	// create new Item instance
    	Item temp = new Item(iID, iName, iDescription); 
    	
    	//adding whole temp object to items arrayList
    	items.add(temp);	    	
    	}

	}
	
	/**
	 * This part is to read in the monsters file and save each monster object in an arrayList 
	 */
	
	File monsterFile = new File("monsterFile");
	// open a Scanner to read data from File
	
	Scanner monsterReader = null;  
	{
   try
	{
      monsterReader = new Scanner(monsterFile);
	
  } 
	catch (FileNotFoundException e)
  {
      System.out.println("File not found - terminating program");
      System.exit(0);
  	e.printStackTrace();
  }
  

   //Read item into array list
    while (monsterReader.hasNext())
    {
    	// read item
    	String mId = monsterReader.nextLine();
    	String mName = monsterReader.nextLine();
    	String mDescription = monsterReader.nextLine();
    	String mWeapon = monsterReader.nextLine();
    	String mSurrender = monsterReader.nextLine();
    	// create new Item instance
    	Monster temp = new Monster(mId, mName, mDescription, mWeapon, mSurrender); 
    	
    	//adding whole temp object to items arrayList
    	monsters.add(temp);	    	
    	}

	}
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
    	
    	//Adding Item objects to the Room 
    	Item rItems = TestModel.findItem(items);
    	temps.setrItems(rItems);

    	//adding Monster objects
    	Monster rMonsters = new Monster(monsters, monsters, monsters, monsters, null);
    	rMonsters.setMName(monsters);
    	temps.setrMonsters(rMonsters);
    	
    	//adding whole temps object to rooms arrayList
    	rooms.add(temps);	    	
    	}

	}
	

	
	
	//Current Room!// 
	Room currentRoom = new Room(); 
	
	//Inventory//
	Inventory inventory = new Inventory(); 
	
	public TestModel() {
		//input = "";
		output = "";
		System.out.println("Constructed");
		
	}
//	public void setInput(String input) {
//		//this.input = input;
//	}
	
	public void setOutput(String output)
	{
		this.output = output;
	}
	
	public String getOutput()
	{
		return output;
	}
	
	public String update(String input) 
	{
		if (output.isEmpty()) 
		{
			output = "PLAYER: " + input + "\r\nCommand not recognized. \r\nPress help for list of commands";
		}
		else
		{
			output = output + "\r\nPLAYER: " + input + "\r\nCommand not recognized. \r\nPress help for list of commands";
		}

		if(input.contains("options")) {
			output = "- Options Commands -"
					+ "\r\nload [unique ID]"
					+ "\r\nsave [unique ID]";
		}
		
		if(input.contains("load")) {
			//parse string to find the player's unique id, then load file with that name.
			output = "**File Loaded**"
					+ "\r\njk nothing happened.";		
		}
		
		if(input.contains("save")) {
			//parse string to find the player's unique id, then save file with that name.
			output = "**File Saved**"
					+ "\r\nthis is a lie";		
		}
		
		if(input.contains("Go to") || input.contains("go to"))
		{
			String roomID = input.substring(input.indexOf("o", 4) + 2, input.length()); 
			currentRoom = findRoom(roomID); 
			//output = output + "\r\n" + in;
			output = currentRoom.getrName() + "\r\n" + currentRoom.getrDescription();

			
			//set the current room ID
			currentRoomID = currentRoom.getrID();
			System.out.println(currentRoomID);
		}
		
		
		
		if(input.contains("Search") || input.contains("search"))
		{
			currentRoom.getrItems();
			
			if(currentRoom.getrItems() == null)
			{
				output = "You look around but find nothing you can use.";
			}
			else
			output = "You look around the room, and " + currentRoom.getrItems();
		}
		
		if(input.contains("pick up") || input.contains("Pick up"))
		{
			String itemName = input.substring(input.indexOf("p", 4) + 2, input.length()); 
	    	Item item = TestModel.findNameItem(itemName);
			inventory.pickUp(item);  
			output = item.getiName() + " was added to your inventory!"; 
		}
		
		if(input.equalsIgnoreCase("check inventory"))
		{
				 output = inventory.toString();
				
		}
		
		return output;

	}
	
	//Method finds a room object based on its roomID 
	public static Room findRoom(String roomID)
	{
		for (Room obj: rooms)
		{
			if(obj.rID.equals(roomID))
			{
				return obj;
			}
		}
		return null;

	}
	
	//Method finds a item object based on its item id
	public static Item findItem(String itemID)
	{
		for (Item obj: items)
		{
			if(obj.iId.equalsIgnoreCase(itemID))
			{
				return obj;
			}

		}
		return null;

	}
	
	//Method finds a item object based on its item name 
	public static Item findNameItem(String itemName)
	{
		for (Item obj: items)
		{
			if(obj.iName.equalsIgnoreCase(itemName))
			{
				return obj;
			}			

		}
		return null;

	}
	
	
	
	
}
