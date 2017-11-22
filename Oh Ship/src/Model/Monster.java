package Model;
import java.util.Set;



import java.util.HashSet;
public class Monster //extends Character 
{
private CharacterSt st;
String ID;
String name;
String description;
String surrender;

public Monster(String ID, String name, String description, String surrender, CharacterSt st)
{
	setID(ID);
	setName(name);
	setDescription(description);
	setSurrender(surrender);
	setSt(st);
}
	
public CharacterSt getSt() {
	return st;
}

public void setSt(CharacterSt st) {
	this.st = st;
}

public String getID() {
	return ID;
}

public void setID(String ID) {
	this.ID = ID;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getSurrender() {
	return surrender;
}

public void setSurrender(String surrender) {
	this.surrender = surrender;
}
	
	
	
	
	
	
	
	
	
}	
//	public String monsterName;
//	public String monsterDescripton;
//	public boolean isDefeated = false; 
//	 
//	public Monster()
//	{
//		
//	}
//
//	public Monster(int health, String monsterName, String monsterDescripton, boolean isDefeated) 
//	{
//		super(health);
//		this.monsterName = monsterName; 
//		this.monsterDescripton = monsterDescripton; 
//		this.isDefeated = isDefeated; 
//	}
//
//	public String getmMonsterName() 
//	{
//		return monsterName;
//	}
//
//	public void setMonsterName(String monsterName)
//	{
//		this.monsterName = monsterName;
//	}
//
//	public String getMonsterDescripton() 
//	{
//		return monsterDescripton;
//	}
//
//	public void setMonsterDescripton(String monsterDescripton) 
//	{
//		this.monsterDescripton = monsterDescripton;
//	}
//
//	public boolean isDefeated()
//	{
//		return isDefeated;
//	}
//
//	public void setDefeated(boolean isDefeated) 
//	{
//		this.isDefeated = isDefeated;
//	}
//	
//	public void die()
//	{
//		
//	}

//}
