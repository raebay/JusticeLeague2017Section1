package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import View.Console;


public class Player
{
	private String userName;
	private CharacterSt stats;
	ArrayList<String> itemIDs;
	ArrayList<String> doorIDs;
	ArrayList<String> puzzleIDs;
	ArrayList<String> monsterIDs;
	String currentRoomID;
	
	
	public CharacterSt getStats()
	{
		return stats;
	}
	public void setStats( CharacterSt stats)
	{
		this.stats = stats;
	}
	
	public void save()
	{
		String fileName = getUserName() + ".txt";
		
		try 
		{
		FileOutputStream f = new FileOutputStream(fileName);
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeObject(userName);
		o.writeInt(stats.getcHP());
	    o.writeInt(stats.getcAttack());
	    o.writeInt(stats.getcDef());
	    o.writeInt(stats.getcAvoid());
	    
	    if (itemIDs.size()>0)
	    {
	    	o.writeInt(1);
	    	o.writeObject(itemIDs);
	    }
	    else
	    {
	    	o.writeInt(0);
	    }
	    
	    if( doorIDs.size()>0)
	    {
	    	o.writeInt(1);
	    	o.writeObject(doorIDs);
	    }
	    else
	    {
	    	o.writeInt(0);
	    }
	    
	    if( puzzleIDs.size()>0)
	    {
	    	o.writeInt(1);
	    	o.writeObject(puzzleIDs);
	    }
	    else
	    {
	    	o.writeInt(0);
	    }
	    
	    if( monsterIDs.size()>0)
	    {
	    	o.writeInt(1);
	    	o.writeObject(monsterIDs);
	    }
	    else
	    {
	    	o.writeInt(0);
	    }
	    
        o.writeObject(currentRoomID);
	    
	    Console.print("This game " + getUserName() +  "has been saved ");
		}
		catch(Exception e)
		{
		}	
		}
	    
		public boolean load( String name) 
		{
			String fileName = name+".txt" ;
			try
			{
				
				FileInputStream f1 = new FileInputStream (fileName);
				ObjectInputStream o1 = new ObjectInputStream(f1);

				String fileUserName = (String)o1.readObject();
				
				
				setUserName(name);
				
				if( ! fileUserName.equals(name))
				{
					Console.print("Incorrect username please try again");
					return false ;
				}
				stats = new CharacterSt() ;
				stats.setcHP( o1.readInt() );
				stats.setcAttack( o1.readInt() );
				stats.setcDef( o1.readInt() );
				stats.setcAvoid( o1.readInt() );
	    
	    
				if(o1.readInt()==1)
					itemIDs = (ArrayList<String>)o1.readObject();
				else
					itemIDs = new ArrayList<String>() ;
				if(o1.readInt()==1)
					doorIDs = (ArrayList<String>)o1.readObject();
				else
					doorIDs = new ArrayList<String>() ;

				if(o1.readInt()==1)
					puzzleIDs = (ArrayList<String>)o1.readObject();
				else
					puzzleIDs = new ArrayList<String>() ;

				if(o1.readInt()==1)
					monsterIDs = (ArrayList<String>)o1.readObject();
				else
					monsterIDs = new ArrayList<String>() ;

				Console.print("Game for " + getUserName() + " is loading");
				currentRoomID =  (String)o1.readObject(); 
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			
			return false;
		}
		public Player() 
		{
			
		}
		public Player( String userName, String roomID, CharacterSt stats) 
		{
			itemIDs = new ArrayList<String>() ;
			doorIDs = new ArrayList<String>() ;
			this.stats = stats ;
			puzzleIDs =  new ArrayList<String>() ;
			monsterIDs = new ArrayList<String>() ;
			
			setUserName(userName);
			setCurrentRoomID(roomID);

	   } 
		public String getCurrentRoomID()
		{
			return currentRoomID ;
		}
		public void setCurrentRoomID(String roomID )
		{
			this.currentRoomID = roomID ;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public void addDoor(String doorID)
		{
			doorIDs.add(doorID) ;
		}
		
		public boolean isDoorOpen( String doorID)
		{
			for (int i=0; i< doorIDs.size() ; i++ )
				if( doorIDs.get(i).equalsIgnoreCase(doorID))
					return true ;
			return false;
		}
		
		public void additem( String itemID )
		{
			if( !hasItem( itemID )) 
				itemIDs.add(itemID ) ;
		}
		
		public boolean UseItem(String itemID )
		{
			for( int i=0; i< itemIDs.size(); i++)
				if( itemIDs.get(i).equalsIgnoreCase(itemID))
				{
					if( itemIDs.get(i).equals("i1"))
					{
						
					}
					if( itemIDs.get(i).equals("i2"))
					{
						
					}
					if( itemIDs.get(i).equals("i3"))
					{
//						addDoor("D17");
//						addDoor("D17");
//						addDoor("D17");
//						addDoor("D17");
//						addDoor("D17");
						
					}
					if( itemIDs.get(i).equals("i4"))
					{
//						addDoor("D17");
//						addDoor("D17");
//						addDoor("D17");
					}
					if( itemIDs.get(i).equals("i5"))
					{
						stats.setcHP(stats.getcHP()+80);
					}
					if( itemIDs.get(i).equals("i6"))
					{
						stats.setcAttack(stats.getcAttack()+6);
					}
					if( itemIDs.get(i).equals("i7"))
					{
						stats.setcAttack(stats.getcAttack()+10);
					}
					if( itemIDs.get(i).equals("i8"))
					{
						stats.setcAttack(stats.getcAttack()+14);
					}
					if( itemIDs.get(i).equals("i9"))
					{
						stats.setcAttack(stats.getcAttack()+18);
					}
					if( itemIDs.get(i).equals("i10"))
					{
						stats.setcDef(stats.getcDef()+60);
					}
					
					
					itemIDs.remove(i) ;
						
					return true;
				}
			return false ;	
				}
		
		public boolean hasItem(String itemID )
		{
			for( int i=0; i< itemIDs.size(); i++)
				if( itemIDs.get(i).equalsIgnoreCase(itemID))
				{
					return true;
				}
			return false ;
		}
		
		public int getItemCount()
		{
			return itemIDs.size() ;
		}
		
		public String getItemID( int i)
		{
			return itemIDs.get(i) ;
			
		}
		
		public boolean hasDoor(String doorID )
		{
			for( int i=0; i< doorIDs.size(); i++)
			{
				if( doorIDs.get(i).equalsIgnoreCase(doorID))
					return true;
			}
			return false ;
		}
		
		public void addPuzzle(String puzzleID)
		{
			if( !hasPuzzle(puzzleID))
				puzzleIDs.add(puzzleID) ;
		}
		public boolean hasPuzzle(String puzzleID)
		{
			for( int i=0; i< puzzleIDs.size() ; i++)
			{
				if( puzzleIDs.get(i).equalsIgnoreCase(puzzleID))
					return true ;
			}
				
			
			return false;
		}
		public void addMonster(String mId)
		{
			if( !hasMonster(mId))
				monsterIDs.add(mId) ;
		}
		public boolean hasMonster(String mId)
		{
			for( int i=0; i< monsterIDs.size() ; i++)
			{
				if( monsterIDs.get(i).equalsIgnoreCase(mId))
					return true ;
			}
				
			
			return false;
		}
		
}
	
	
	
	
	
	
	












//public class Player extends Character 
//{
//	Inventory pInventory; 
//	Room pLocation; 
//
//	public Player(int health, Inventory pInventory, Room pLocation) 
//	{
//		super(health, health, health, health);
//		this.pInventory = pInventory; 
//		this.pLocation = pLocation; 
//
//	}
//	
//	public Inventory getpInventory() 
//	{
//		return pInventory;
//	}
//
//
//	public void setpInventory(Inventory pInventory) 
//	{
//		this.pInventory = pInventory;
//	}
//
//	public Room getpLocation()
//	{
//		return pLocation;
//	}
//
//	public void setpLocation(Room pLocation) 
//	{
//		this.pLocation = pLocation;
//	}
//
//	public void move(Room room)
//	{
//		 
//	}
//		
//	public void escape()
//	{
//		
//	}
//	
//	public void surrender()
//	{
//		
//	}
//	
//	public void surrenderHint()
//	{
//		
//	}
//	
//	public void winFight()
//	{
//		
//	}
//	
//	public void loseFight()
//	{
//		
//	}
//
//}
