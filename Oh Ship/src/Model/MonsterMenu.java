package Model;
import java.util.ArrayList;

import java.util.NoSuchElementException;


import Model.Character;

public class MonsterMenu{

	private ArrayList<Monster> monsterList;
	
	public MonsterMenu()
	{
		
		
		monsterList = new ArrayList<Monster>();
		
		final String[] IDs = {"m1", "m2", "m3", "m4", "m5", "m6", "m7", "m8", "m9"};
		
		final String[] name = new String[] {"Pirate without weapon", "Muscular man", "Three pirates", "Two pirates with a hostage", "Storage room pirate", "Staircase pirate", "A one-eyed pirate", "First pirate", "Captain"};
		
		String description;
		String surrender;
		
		
		description = "This man is masked and seems to be as spooked from your presence as you are from his...";
		surrender = "He stuffs you in the closet and locks\n" + 
				"it. He will get what he needs from the\n" + 
				"supervisor and leave. You survive\n" + 
				"without taking any damage.";
		monsterList.add(new Monster(IDs[0], name[0], description, surrender, new Character(3,1,5,3)));
		
		description = "From the sound you see this muscular man. He will probably put up a better fight than the past one.";
		surrender = "Not an available option for this fight";
		monsterList.add(new Monster(IDs[1], name[1], description, surrender, new Character(4,2,6,3)));
		
		description = "Three pirates searching through the containers.";
		surrender = "Surrendering does not work, it will\n" + 
				"result in getting killed";
		monsterList.add(new Monster(IDs[2], name[2], description, surrender, new Character(5,3,7,3)));
		
		description = "There are two pirates armed with guns, and they are turned the other way, trying to interrogate this hostage.";
		surrender = "You make them aware of your\n" + 
				"presence, and they attack you\n" + 
				"immediately.";
		monsterList.add(new Monster(IDs[3], name[3], description, surrender, new Character(6,4,8,3)));
		
		description = "When the storage room is opened, a pirate jumps out of nowhere and attacks.";
		surrender = "You are defeated";
		monsterList.add(new Monster(IDs[4], name[4], description, surrender, new Character(7,5,9,3)));
		
		
		description = "A pirate is running down the stairs towards you.";
		surrender = "You are defeated";
		monsterList.add(new Monster(IDs[5], name[5], description, surrender, new Character(8,6,10,3)));
		
		description = "This pirate has a cutlass on his side, and looks like a younger pirate that can't fully grow a beard yet.";
		surrender = "You announce your presence while\n" + 
				"slowly approaching, but then\n" + 
				"suddenly push him off the edge of the\n" + 
				"ship.";
		monsterList.add(new Monster(IDs[6], name[6], description, surrender, new Character(9,7,11,3)));
		
		description = "This pirate has a cutlass on his side, and look like a younger pirate that can't fully grow a beard yet.";
		surrender = "You are able to push one over the\n" + 
				"edge, but then a battle begins with\n" + 
				"the second";
		monsterList.add(new Monster(IDs[7], name[7], description, surrender, new Character(10,8,12,3)));
		
		description = "The captain of the pirates is bloody, has a eye patch, and a long beard. He is the scariest pirate you have ever seen. He has 12 health. Using the gun weapon against him will most likely miss, rather than deal damage.";
		surrender = "You are defeated";
		monsterList.add(new Monster(IDs[8], name[8], description, surrender, new Character(12,10,15,3)));
	}
	public Monster getMonster(int i)
	{
		return monsterList.get(i);
	}
	
	public Monster getMonster(String id)
	{
		for(int i=0; i<monsterList.size();i++)
			if(monsterList.get(i).getMid().equalsIgnoreCase(id))
				return monsterList.get(i);
		return null;
	}
}
