package Model;
import java.util.ArrayList;

public class Item 
{

	public String iId;
	public String iName; 
	public String iDescription; 
	public ArrayList<EquippableItem> equippableitemInventory;
	
	
	public Item(String iID, String iName, String iDescription)
	{
		this.iId = iID;
		this.iName = iName;
		this.iDescription = iDescription; 		
		
	}
	
	public Item()
	{
		/*this.iId = "";	
		this.iName = "";
		this.iDescription = "";*/
	}

	//getters and setters for items
	public String getiId()
	{
		return iId;
	}
	
	public void setiId(String iId)
	{
		this.iId = iId;
	}
	
	public String getiName()
	{
		return iName;
	}

	public void setiName(String iName) 
	{
		this.iName = iName;
	}
	

	public String getiDescription()
	{
		return iDescription;
	}

	public void setiDescription(String iDescription) 
	{
		this.iDescription = iDescription;
	}
	
	public ArrayList<EquippableItem> getInventory()
	{
		return equippableitemInventory;
	}

	public void setEquippableitemInventory(ArrayList<EquippableItem> equippableitem) 
	{
		this.equippableitemInventory = equippableitem;
	}
	
	//public String examine()
	{
		//return iDescription; 
	}
	
	public void drop()
	{
		
	}
	
	public void pickupEquippableitem(EquippableItem equippableitem)
	{
		equippableitemInventory.add(equippableitem);
	}
	//toString method
	   @Override
	   public String toString()
	   {
		   return "a wild " + iName + " has appeared!"; 
	   }

	

}
