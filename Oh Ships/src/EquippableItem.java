package Model;

import View.Console;

public class EquippableItem extends Item 
{
	public Console view;
	String equippableItemId;
	int statChange; 
	
	public EquippableItem() {
		super();
		this.equippableItemId = "";
		this.statChange = 0;
	}
	
	public EquippableItem(String iId, String iName, String iDescription, String equippableItemId, int statChange)
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
