package Model;

import View.Console;

public class EquippableItem extends Item 
{
	public Console view;
	int equippableItemId;
	int statChange; 
	
	public EquippableItem() {
		super();
		this.equippableItemId = 0;
		this.statChange = 0;
	}
	
	public EquippableItem(int iId, String iName, String iDescription, int equippableItemId, int statChange)
	{
		super(iId, iName, iDescription);
		this.equippableItemId = equippableItemId;
		this.statChange = statChange;
		
	}

	public int getStatChange()
	{
		return statChange;
	}

	public void setStatChange(int statChange)
	{
		this.statChange = statChange;
	}
	
//	public void equipItem()
//	{
//		
//	}
//	
//	public void unEquipItem()
//	{
//		
//	}
	
	public String toString()
	{
		return "Equippable Item: statChange=" +statChange;
	}

}
