package Model;



public class Puzzle //extends Testing
{
	
	
	 public String pID = "";
	 public String pName = " ";
	 public String pDescription = ""; 
	public String pHint = "";
	
	
//	public Room pRooms; 
//	public Room pHintRoom; 
    
    private String panswer;
    public boolean isSoloved = false; 
    
    
	public Puzzle()
	{
		
	}
	
	public Puzzle(String pID, String pName, String pDescription, String pHint, String panswer /**String pRooms String pHintRoom**/)
	{
		this.pID = pID;
		this.pName = pName; 
		this.pDescription = pDescription; 
		this.pHint = pHint; 
		this.panswer = panswer;
		
	}
	public Puzzle(String pID, String pName, String pHint, String pDescription, String panswer ,boolean isSolved /**String pRooms String pHintRoom**/) 
	{
		this.pID = pID;
		this.pName = pName;  
		this.pDescription = pDescription; 
		this.pHint = pHint; 
		this.panswer = panswer;
		this.isSoloved = isSolved;
//		this.pRooms = pRooms;
//		this.pHintRoom = pHintRoom; 

	}
	
	public String getpID() 
	{
		return pID;
	}

	public void setpID(String pID) 
	{
		this.pID = pID;
	}
	
	public String getpHint() 
	{
		return pHint;
	}

	public void setpHint(String pHint) 
	{
		this.pHint = pHint;
	}

	public String getpDescription()
	{
		return pDescription;
	}

	public void setpDescription(String pDescription) 
	{
		this.pDescription = pDescription;
	}

	public String getpName()
	{
		return pName;
	}

	public void setpName(String pName) 
	{
		this.pName = pName;
	}

	public boolean getIsSoloved() 
	{
		return isSoloved;
	}

	public void setSoloved(boolean isSoloved) 
	{
		this.isSoloved = isSoloved;
	}

	public void setpanswer(String panswer) 
	{
		this.panswer = panswer;
	}
	public String getpAnswer()
	{
		return this.panswer;
	}
	
//	public void ignorePuzzle()
//	{
//		
//	}
	
//	public Room getpRooms()
//	{
//		return pRooms; 
//	}
//	
//	public void setpRooms(Room pRooms)
//	{
//		this.pRooms = pRooms; 
//	}
	
//	public Room getpHintRoom()
//	{
//		return pHintRoom; 
//	}
//	
//	public void setpHintRoom(Room pHintRoom)
//	{
//		this.pHintRoom = pHintRoom; 
//	}
	
	//toString method
	   @Override
	   public String toString()
	   {
		   return  pName;
	   }
	   
//	   public Puzzle( String rID )
//		{
//			this.rID = rID ;
//		}
//		
//		
//		public boolean loadProblem() 
//		{
//			
//			String fileName ;
//			String str ;
//			
//			
//			try{
//				
//				fileName = "puzzleFile.txt" ;	
//				File puzzleFile = new File(fileName);
//				Scanner fileReader = new Scanner(puzzleFile);	
//				
//				
//				//read how many items are in the puzzle file
//				str = fileReader.nextLine() ;
//				//int itemCount = Integer.parseInt(str) ;  
//				
//				
//				// select a puzzle number based on the rooms
//				/*1 + (int)Math.floor(  Math.random() * itemCount ) ; 
//				 * 
//				 * 
//				//New code to specify each puzzle to specific room 
//				 * 
//				 */
//				int item = 1;
//				
//				 switch (rID) {
//		         case "P1": 
//		             item = 1;
//		             break;
//		         case "P2": 
//		             item = 2;
//		             break;
//		         case "P3": 
//		             item = 3;
//		             break;
//		         case "P4": 
//		             item = 4;
//		             break;
//		         case "P5": 
//		             item = 5;
//		             break;
//		         case "P6": 
//		             item = 6;
//		             break;
//		         case "P7": 
//		             item = 7;
//		             break;
//				 }
//		             
//		             
//				// skip all puzzles before reaching the selected puzzles
//				for( int i=0; i<item-1 ; i++)
//				{
//					String str1 = fileReader.nextLine();
//					String str2 = fileReader.nextLine();
//					String str3 = fileReader.nextLine();
//					String str4 = fileReader.nextLine();
//				}
//				
//				// read content of the selected Puzzle
//				this.pID = fileReader.nextLine().trim();
//				this.pName = fileReader.nextLine().trim(); 
//				this.pDescription = fileReader.nextLine().trim();
//				this.panswer = fileReader.nextLine().trim();
//				
//				fileReader.close();
//				return true ;
//				 }
//			
//			catch( Exception e)
//			{
//				return false ;
//			}
//		}

}
