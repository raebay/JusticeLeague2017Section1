
public class Puzzle 
{
	public boolean isSoloved = false; 
	public String pHint = "";
	public String pDescription = "";
	public String pName = " "; 
	public Room pRooms; 

	public Puzzle()
	{
		
	}
	
	public Puzzle(String pName, String pDescription, String pHint)
	{
		this.pName = pName; 
		this.pDescription = pDescription; 
		this.pHint = pHint; 
		this.pRooms = pRooms; 
		
	}
	public Puzzle(String pName, boolean isSolved, String pHint, String pDescription, Room pRooms) 
	{
		this.pName = pName; 
		this.isSoloved = isSolved; 
		this.pDescription = pDescription; 
		this.pHint = pHint; 
		this.pRooms = pRooms; 
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

	
	public void checkAnswer()
	{
		
	}
	
	public void ignorePuzzle()
	{
		
	}
	
	public Room getpRooms()
	{
		return pRooms; 
	}
	
	public void setpRooms(Room pRooms)
	{
		this.pRooms = pRooms; 
	}
	
	//toString method
	   @Override
	   public String toString()
	   {
		   return "Puzzle: " + pName + ", Description=" + pDescription;
	   }

}
