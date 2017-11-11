package Model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Item 
{

	public int iId;
	public String iName; 
	public String iDescription; 
	public ArrayList<EquippableItem> equippableitemInventory;
	
	
	public Item()
	{
	this.iId = 0;	
	this.iName = "";
	this.iDescription = "";
	}
	
	public Item(int iId, String iName, String iDescription)
	{
		this.iId = iId;
		this.iName = iName;
		this.iDescription = iDescription; 
		
		
		
	}

	
	//getters and setters for items
	public int getiId()
	{
		return iId;
	}
	public void setiId(int iId)
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
		   return "Item: Item ID =" + iId + ", Item Name=" + iName + ", Item Description=" + iDescription;
	   }

	

}
