package Controller;
import Model.*;
import View.Console;

public class Controller 
{
	//private String input;
		private String output;
		
		// this is a temp var that I need to access the current room ID. This is true speghetti code, I'm sorry. -Zach
		public String currentRoomID;
		
	private ItemRead itemRead;
	private RoomRead roomRead;
	private DoorRead doorRead;
	private MonsterRead monsterRead;
	
	Player player = null;
	
	public Controller() 
	{
		//input = "";
		output = "";
		System.out.println("Constructed");
		
	}
	public void setOutput(String output)
	{
		this.output = output;
	}
	
	public String getOutput()
	{
		return output;
	}
	
	
	private boolean confirmClose()
	{
		if( player == null )
			return true ;
		
		
		output = "This operation would close the current game. Do you want to save the progress ? (Yes, No)";
		String res = UserInput.getString() ;
		
		if(res.equalsIgnoreCase("Yes"))
			saveGame();
		
		return true ;
		
	}
	/*****************************************************************/
	
	// Player will create new game 
		private void createNewPlayer()
		{
			String name = UserInput.getString("please enter user name") ;
			
			CharacterSt stat = new CharacterSt(200,50,40,15) ;
			player = new Player( name, "L1", stat) ;
			
			// now open the door which are open initially for each user
			for( int i=0; i<doorRead.getDoorCount();i++)
			{
				Door door = doorRead.getDoor(i) ;
				
				if( door.getDCR1().startsWith("L") || door.getDCR1().startsWith("A") ||
						door.getDCR2().startsWith("L") || door.getDCR2().startsWith("A") )
					player.addDoor(door.getDID());
			}
			
		}
		/********************************************************************************************************************************/
		// Player will save the game
		private void saveGame()
		{
			if( player == null )
			{
				output = "no active player , you should create or load a game";
				return ;
			}
			player.save();
		}
	
		/********************************************************************************************************************************/
		//player will load the game were its left off
		private void loadGame()
		{
			String name = UserInput.getString("please enter user name") ;
			

			player = new Player();
			if( ! player.load(name))
			{
				output ="Cannot load  user. user/password incorrect" ;
				player = null ;
			}
			
		}
	
		/********************************************************************************************************************************/
		// display the inventory of the items and memories
		private void displayInventory()
		{
			if( player == null )
			{
				output ="no active player , you should create or load a game";
				return ;
			}
			output = "\nPlayer " + player.getUserName() + " has " + player.getItemCount() + " items !";
			for( int i=0 ; i< player.getItemCount() ; i++)
			{
				Item item = ItemRead.getItem(player.getItemID(i)) ;
				if(item != null )
					output = "Player owns : " + item.getiName();
				else
					output = "Player owns : ERROR" ;
				
			}
			
			output ="\n\n";
					
					
			
		}
	
		/********************************************************************************************************************************/
		//Anythime display the score of the player
		private void displayPlayerScore()
		{
			if( player == null )
			{
				output = "no active player , you should create or load a game";
				return ;
			}

			output = "HP = " + player.getStats().getcHP() ;
			output = "ATTACK = " + player.getStats().getcAttack() ;
			output = "DEFENCE = " + player.getStats().getcDef() ;
			output = "Avoid = " + player.getStats().getcAvoid() ;
			
		}
	
		/********************************************************************************************************************************/
		
		private boolean displayMenu() // true means we should quit
		{
			int res = Menu.getMenuResponse() ;
			
			switch(res)
			{
			case 0:
				output ="Resuming game";
				break;
			case 1:
				
				if( confirmClose() )
						createNewPlayer() ;
				
				break;
				
			case 2:
				saveGame() ;
				break;
			case 3:
				
				if( confirmClose() )						
					loadGame() ;

				break;
				
			case 4:
				if( confirmClose() )
					return true;
				break;
			case 5:
				// handle help
			break;
			case 6:
				displayInventory() ;
				break;
					
			case 7:
		displayPlayerScore() ;
			break;
	}

			return false;
		}
		
		/********************************************************************************************************************************/
		
		public void start()
		{
			itemRead = new ItemRead() ;
			itemRead.LoadItems("itemFile.txt") ;
			
			roomRead= new RoomRead() ;
			roomRead.LoadRooms("RoomFile.txt") ;
			
			doorRead = new DoorRead() ;
			doorRead.LoadDoors("doorFile.txt") ;
			
			monsterRead = new MonsterRead() ;
			monsterRead.LoadMonster("monsterFile.txt") ;
			
			
			
			while( true )
			{
				if( player != null )
				{
					if( player.getStats().getcHP()<=0)
					{
						output ="Player has been defeated ! , GAME OVER ....";
						player = null ;
					}
				}
				if( player != null )
				{
					if( player.hasMonster("M9"))
					{
						output ="\n\n******************************************************";
						output ="\n\nCongradulations !!!!";
						output ="\n\nYou have won the GAME !!!";
						player = null ;
						return ;
					}
				}

				//	while ( player == null )
				{
					if( displayMenu() )
						return ;
				}
				
					
				if( player != null )
					playNextAction() ;
				
				
			}
			
		}
		public void playNextAction() 
		{
			output ="\n*****************************";
			output ="Current room : ";
			Room room  = roomRead.getRoom( player.getCurrentRoomID()) ;
			if( room == null)
			{
				output ="There is inconsisitency in game database , cant find room " + player.getCurrentRoomID();
				return ;
			}
			room.toString() ;
			output ="\n*****************************";
		
			 
			
			switch( room.getRoomType())
			{
			case 'B':
				handlerMonster(room) ;
			break;
			case 'P':
				handlerPuzzle(room) ;
			break;
			case 'L':
			case 'A':
				handleRoomAccess(room);
			break;
				
			
			case 'I':
				handlerItem(room);
			break;
			
			}
			
			
		}
		
		/********************************************************************************************************************************/
		public void unlockAllDoors( Room room)
		{
			String []exitRooms = room.getDoors().split(",") ;
			for( int j=0; j< exitRooms.length ; j++)
			{
				String doorID = doorRead.getDoorID(room.getrID(), exitRooms[j].trim()) ;
				if( doorID != null)
				{
					if( !player.hasDoor(doorID))
					{
						output ="Yeay,... You have unlocked room " + exitRooms[j].trim();
						player.addDoor(doorID);
					}
					
				}
			}
			
		}
		
		
		public void handlerPuzzle(Room room)
		{
			output ="\nPPPPPPPPPPUUUUUUUUUUUUZZZZZZZZZZZZZZZZLLLLLLLLLLLLLEEEEEEEEE";
			output ="\nYou have enetered a puzzle room. You have 3 chance to answer the question";
			Puzzle puzzle = new Puzzle( room.getrID() ) ;
			puzzle.loadProblem() ;
			
			if( puzzle == null )
			{
				output ="cannot load puzzle, It is your lucky day !";
				unlockAllDoors( room ) ;
				
			}
			else
			{
				if( player.hasPuzzle(puzzle.getpID()))
				{

					output ="puzzle is solved already, you can pick your exit door";
					handleRoomAccess(room);
					return ;
				}
				for(int i=0; i<3; i++)
				{
					output = puzzle.getpDescription() ;
					output = puzzle.getpDescription() ;
					
					String response = UserInput.getString("What is your answer :" );
					if( response.equalsIgnoreCase(puzzle.getpAnswer()))
					{
						output ="Correct Answer, hooray !";
						// correct answer : open the doors 
						unlockAllDoors( room ) ;
						player.addPuzzle(puzzle.getpID());
						output = "Now you can pick your exit door";
						handleRoomAccess(room);
						return ;
						
					}
					else
					{
						output = "Wrong answer ! try again ";
					}
					
				}
				
				// 3 incorrect answers !
				output = "You didnt answer the puzzle, you should now exit this room";
				handleRoomAccess(room);
				return  ;
				
			}
			
			
		}
		
		
		/********************************************************************************************************************************/
		

		public void handlerMonster(Room room)
		{
			output ="You have entered a Boss room";

			Monster monster  = monsterRead.getMonster( room.getRoomNumber() - 1) ;
			if( monster == null )
			{
				output = "Cannot load monster information, your locky day" ;
				unlockAllDoors( room ) ;
				output = "you should now exit this room";
				handleRoomAccess(room);
			}
			else
			{
				output = "Mosnter " + monster.getMName() + " is here  !!!" ;


				if( player.hasMonster(monster.getMid()))
				{
					output = "You have already defeated the monster !" ;
					output = "you should now exit this room";
					handleRoomAccess(room);
				}
				else
				{
					output = "\n";
					output =  monster.getMDescription() ;
					output =  monster.getMSurrender() ;

					String response = UserInput.getString("Do you wanna fight " + monster.getMName() +  "   ?  (Yes/No)" ) ;

					if( response.equalsIgnoreCase("no"))
					{
						output = "you should now exit this room";
						handleRoomAccess(room);
					}

					else
					{

						if( fight( monster ) )
						{
							output = "\n\nCongradulation !!!! You defeated monster :" + monster.getMName() ;
							player.addMonster(monster.getMid());
							unlockAllDoors(room);

							int monsterID = room.getRoomNumber() - 1 ;
							

							if( monster.getMid() != "M9")

							{
								output = "you should now exit this room";
								handleRoomAccess(room);
							}




						}
						else 
							return ;


					}
				}
			}

		}
		
		
		/********************************************************************************************************************************/

		public boolean fight( Monster monster)
		{
			output = "***************************************************";
			output ="The fight has begun !!! " ;
			
			while( player.getStats().getcHP()>0 )
			{
				output = "Player HP : " +  player.getStats().getcHP() + " Monster HP : " + monster.getStat().getcHP() ;
				String response = UserInput.getString("What do you want to do ? ( 1. Attack, 2. Use Inventory 3. Escape )") ;
				
				if( response.equalsIgnoreCase("attack") || response.equalsIgnoreCase("1") )
					monster = handlePlayerAttack(monster) ;
				
				if( response.equalsIgnoreCase("Use") || response.equalsIgnoreCase("2") )
					handlePlayerUse() ;
				
				if( response.equalsIgnoreCase("Escape") || response.equalsIgnoreCase("3") )
				{
					output = "\nyou have escaped the fight with " + player.getStats().getcHP() + " HP left\n" ;		
					break;
				}
				
				if( monster.getStat().getcHP() <=0 )
				 	return true ;
			}
					
			return false;
		}
		
		
		/********************************************************************************************************************************/
		public Monster handlePlayerAttack(Monster monster) 
		{
			
			CharacterSt monsterStats = monster.getStat() ;
			CharacterSt playerStats = player.getStats() ;
			
			if( monsterStats.getcAvoid()>0)
			{
				output = "Monster Avoid !)" ;
				monsterStats.Update(0,0, 0, -1);
			} 
			else
			{
				int monsterDamage = playerStats.getcAttack() - monsterStats.getcDef() ;
				if( monsterDamage < 0 )
					monsterDamage= 0 ;
				
				
				monsterStats.Update( -monsterDamage ,0, 0, 0);
			}
			
			
			if( playerStats.getcAvoid()>0)
			{
				output = "player Avoid !)" ;
				playerStats.Update(0,0, 0, -1);
			}
			else
			{
				int playerDamage = monsterStats.getcDef() ;
				playerStats.Update(-playerDamage, 0, 0, 0);
			}
			
			player.setStats(playerStats);
			monster.setStat(monsterStats);
			
			
			return monster ;
		}	
		
		/********************************************************************************************************************************/
		public void handlePlayerUse()
		{
			displayInventory();
			if( player.getItemCount()==0)
			{
				output = "You dont have any artifact to use\n";
				return ;
			}
			output = "Please enter the artifact number (0 to ignore , 1 to " + player.getItemCount() + " to select an artifact" ;
			int response = UserInput.getInt() ;
			if( response == 0 )
				return ;
			
			String iId = player.getItemID(response -1 );
			player.UseItem(iId) ;
			
			
			output = "These are stats after using the artifact :";
			displayPlayerScore();
			
		}

		/********************************************************************************************************************************/

		public void handlerItem(Room room)
		{
			//if( !room.getRoomId().startsWith("I") )
			int itemNumber = Integer.parseInt( room.getrID().substring(1)) - 1 ;
			Item it = itemRead.getItem( itemNumber ) ;
			
			
			if( it == null)
			{
				output = "Cannot load artifact" ;
			}
			else
			{
				output ="\n!!! ARTIFACT ROOM !!!!" ;
				output ="You have enetered a room containts artifact ";
				output = it.getiName() ;
				output = it.getiDescription() ;
				
				if( player.hasItem(it.getiId()))
				{
					output = "User already owns the artifact" ;
				}
				else
				{
					output = "Congradulations ! now you own this artifact : " +  it.getiName()  ;
					player.additem(it.getiId());
					unlockAllDoors(room);
				}
				
				
			}
			
			output = "\n\nYou should now exit this room " ;
			handleRoomAccess(room);
			
		
		}
		
		/********************************************************************************************************************************/
		
		public void handleRoomAccess(Room room)
		{
			while( true )
			{
				output = "Current room has access to these other rooms : " + room.getDoors();
				
				
			
				String choice = UserInput.getString("Which room do you want to go ? ") ;
				
				String doorID = doorRead.getDoorID(room.getrID(), choice) ;
				
				if( doorID == null)
				{
					output = "There is no door connecting this room to " + choice  + ", wrong choice.... , please try again\n";
					continue ;
							
				}
				
				if( player.isDoorOpen(doorID))
				{
					output = "This room is accessible, you are now entering : " + choice;
					player.setCurrentRoomID(choice);
					break ;
					
				}
				{
					output = "This room locked, please pick another room";
					continue ;
				}
			}
			
		}

		
		/********************************************************************************************************************************/
		
//		public static void main(String[] args) 
//		{
//			// TODO Auto-generated method stub
//
//			Controller game = new Controller() ;
//			
//			game.start();
//			
//		}
//		public String update(String res) {
//			// TODO Auto-generated method stub
//			
//			
//			return null;
//		}
		
		
}
