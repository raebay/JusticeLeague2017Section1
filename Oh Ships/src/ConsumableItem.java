package Model;

import View.Console;

public class ConsumableItem extends Item 
{
	Console view;
	
	public String consumableItemId;

	public ConsumableItem()
	{
		super("", "", "");
		this.consumableItemId =  "";
	}
	
	
	public ConsumableItem(String iId, String iName, String iDescription, String consumableItemId)
	{
		super(iId, iName, iDescription);
		this.consumableItemId = consumableItemId;
	}
	
	public String getConsumableItemId()
	{
		return consumableItemId;
	}
	
	
	
	public void setConsumableItemId(String consumableItemID)
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
