package Model;

import View.Console;

public class EquippableItemMenue {

	Console view;
	String equippableItemId;
	String equippableItemDescription;
	String equippableItemKind;
	
	int crowbarId = 1;
	String crowbarName = "Crowbar";
	String crowbarD = "A regular crowbar for prying things open, but can make a good weapon that won't break";
	
	int axeId = 2;
	String axeName = "Axe";
	String axeD = "Standard firefighter's axe that can be used as a weapon against two enemies, but then it will break";
	
	int cutlassId = 3;
	String cutlassName = "Cutlass";
	String cutlassD = "A one handed sword that can be used against one enemy";
	
	int gunId = 4;
	String gunName = "Gun";
	String gunD = "An old worn out pistol. it is the best weapon you can find on the ship, but will only work for 5 attacks and has a random chance of missing and dealing no damage to the enemy.";
	
	
	int bulletProofVestId = 5;
	String bulletProofVestName = "bullet Proof Vest";
	String bulletProofVestD = "Body armor that reduces damage from guns and from melee attacks";
	
	String[] equippableItemName = {crowbarName, axeName, cutlassName, gunName, bulletProofVestName};
	String[] equippableItemD = {crowbarD, axeD, cutlassD, gunD, bulletProofVestD};
	
	
	public String[] getEquippableItemName()
	{
		return equippableItemName;
	}
	
	public void setEquippableItemName(String[] equippableItemName)
	{
		this.equippableItemName = equippableItemName;
	}
	
	public String[] getEquippableItemD()
	{
		return equippableItemD;
	}
	public void setEquippableItemD(String[] equippableItemD)
	{
		this.equippableItemD = equippableItemD;
	}
}
