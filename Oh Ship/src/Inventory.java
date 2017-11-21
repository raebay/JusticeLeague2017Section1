import java.util.ArrayList;

import Model.Item;

public class Inventory
{
	public ArrayList<Item> items = new ArrayList<>(); 
	public Item equipped; 

	public Inventory()
	{
		
	}
	
	public Inventory(ArrayList<Item> items) 
	{
		this.items = items; 
	}
	
	public void pickUp(Item itemName)
	{
		items.add(itemName);
	}
	
	public void drop(Item itemName)
	{
		items.remove(itemName); 
	}
	
	public ArrayList<Item> getInventory()
	{
		return items; 
	}
	
	//toString method
	   @Override
	   public String toString()
	   {
		   for(Item item: items)
		   {
			   return item.getiName();
		   }
		   return " ";
	   }

}
