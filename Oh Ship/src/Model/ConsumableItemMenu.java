package Model;

import java.util.ArrayList;
import java.util.Collection;

import View.Console;

public class ConsumableItemMenu {
	
Console view;


public String consumableItemId;
public String ConsumableItemName;
public String consumableItemDescription;
public int consumableItemFunction;

public ArrayList<Item> inventoryConsumable = new ArrayList<Item>();

public ArrayList<Item> getinventoryConsumable()
{
	return inventoryConsumable;
}

public void addConsumableItem(Item kind)
{
	inventoryConsumable.add(kind);
}

public Item searchByName(String name) 
{
	Item kind = null;
	for (Item temp : inventoryConsumable)
	{
		if (temp.getiName().equalsIgnoreCase(name)) 
		{
			kind = temp;
		}
		
	}
	return kind;
}




public void dropItem(String name)
{
	Item tempName = this.searchByName(name);
	if (tempName != null)
	{
		inventoryConsumable.remove(tempName);
	}
}

int medicalKitId = 05;
String medicalKitName = "Medical Kit";
String medicalKitDescription = "A Medical Kit mounted on the wall."; 
int medicalKitFunction = 100;
	
String[] consumableItemNameArray = {medicalKitName};
String[] consumableItemDescriptionArray = {medicalKitDescription};

public String[] getConsumableItemName()
{
	return consumableItemNameArray;
}

public void setConsumableItemName(String[] consumableItemNameArray)
{
	this.consumableItemNameArray = consumableItemNameArray;
}

public String[] getConsumableItemDescription()
{
	return consumableItemDescriptionArray;
}

public void setConsumableItemDescription(String[] consumableItemDescriptionArray)
{
	this.consumableItemDescriptionArray = consumableItemDescriptionArray;
}










}
