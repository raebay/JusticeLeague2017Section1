package Model;

import View.Console;

public class ConsumableItem extends Item 
{
	Console view;
	
	public int consumableItemId;

	public ConsumableItem()
	{
		super(0, "", "");
		this.consumableItemId = 0;
	}
	
	
	public ConsumableItem(int iId, String iName, String iDescription, int consumableItemId)
	{
		super(iId, iName, iDescription);
		this.consumableItemId = consumableItemId;
	}
	
	public int getConsumableItemId()
	{
		return consumableItemId;
	}
	
	
	
	public void setConsumableItemId(int consumableItemId)
	{
		this.consumableItemId = consumableItemId;
	}
	
	
	
	
	@Override
	public String toString()
	{
		return "Consumable Item: ID=" + consumableItemId;
	}
//	public ConsumableItem(String name, String description, int itemEffect) 
//	{
//		super(name, description);
//		this.itemEffect = itemEffect; 
//		
//	}
//	
//	public int getItemEffect()
//	{
//		return itemEffect; 
//	}
//	
//	public void setItemEffect(int itemEffect)
//	{
//		this.itemEffect = itemEffect; 
//	}

}
