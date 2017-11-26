package Model;

import View.Console;

public class EquippableItem extends Item 
{
	public Console view;
	int statChange; 
	
	public EquippableItem() {
		super();
		this.statChange = 0;
	}
	
	public EquippableItem(String iId, String iName, String iDescription, int statChange)
	{
		super(iId, iName, iDescription);
		this.statChange = statChange;
		
	}
	
	public EquippableItem(String iId, String iName, String iDescription)
	{
		super(iId, iName, iDescription);
		
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
