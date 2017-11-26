package Model;




public class Monster //extends Room//extends Character 
{
public String mId = "";
public String mName = "";
public String mDescription = "";
public String mWeapon = "";
public String mSurrender = "";
public boolean isDefeated = false;	
private CharacterSt stat;
String ID;
String name;
String description;
String surrender;


public Monster()
{
	
}

public Monster(String mId, String mName, String mDescription, String mWeapon, String mSurrender)
{
	this.mId = mId;
	this.mName = mName;
	this.mDescription = mDescription;
	this.mWeapon = mWeapon;
	this.mSurrender = mSurrender;
	
}
	

public Monster(String mId, String mName, String mDescription, String mWeapon, String mSurrender ,CharacterSt stat, boolean isDefeated)
{
	this.mId = mId;
	this.mName = mName;
	this.mDescription = mDescription;
	this.mWeapon = mWeapon;
	this.mSurrender = mSurrender;
	this.stat = stat;
	this.isDefeated = isDefeated;
	
}
public CharacterSt getStat() {
	return stat;
}

public void setStat(CharacterSt stat) {
	this.stat = stat;
}

public  String getMid() {
	return mId;
}

public void setMid(String mId) {
	this.mId = mId;
}
public String getMName() {
	return mName;
}

public void setMName(String mName) {
	this.mName = mName;
}
public String getMDescription() {
	return mDescription;
}

public void setMDescription(String mDescription) {
	this.mDescription = mDescription;
}

public String getMWeapon() {
	return mWeapon;
}

public void setMWeapon(String mWeapon) {
	this.mWeapon = mWeapon;
}
public String getMSurrender() {
	return mSurrender;
}

public void setMSurrender(String mSurrender) {
	this.mSurrender = mSurrender;
}

public boolean isDefeated()
{
	return isDefeated;
}

public void setDefeated(boolean isDefeated) 
{
	this.isDefeated = isDefeated;
}

@Override
public String toString()
{
	   return "Oh no, there is a " + mName + " in this room." + "\n \n \n what would you like to do: \n examine m \n ignore \n fight";
	        
}

public boolean equalsIgnoreCase(String mid2) {
	// TODO Auto-generated method stub
	return false;
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
