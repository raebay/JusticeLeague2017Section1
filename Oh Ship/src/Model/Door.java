package Model;
public class Door 
{
	public String dID;
	public String dCR1; 
	public String dCR2; 
	public String dDescription; 
	public boolean isOpen; 
	
	
	public Door(String dID, String dCR1, String dCR2, String dDescription)
	{


		this.dID = dID;
		this.dCR1 = dCR1;
		this.dCR2 = dCR2;
		this.dDescription = dDescription;
		
	}
	
	public Door(String dID, String dCR1, String dCR2, String dDescription, boolean isOpen)
	{
//		setDID(dID);
//		setDCR1(dCR1); 
//		setDCR2(dCR2); 
//		setDDescription(dDescription); 
//		setOpen(isOpen); 

		this.dID = dID;
		this.dCR1 = dCR1;
		this.dCR2 = dCR2;
		this.dDescription = dDescription;
		this.isOpen = isOpen;
	}
	
	
	public String getDID() 
	{
		return dID;
	}

	public void setDID(String dID)
	{

		this.dID = dID;
	}
	public void setDDescription(String dDescription) 
	{
		this.dDescription = dDescription;
	}

	public String getDDescription() 
	{
		return dDescription;
	}

	public String getDCR1() 
	{
		return dCR1;
	}

	public void setDCR1(String dCR1)
	{
		this.dCR1 = dCR1;
	}

	public String getDCR2() 
	{
		return dCR2;
	}

	public void setDCR2(String dCR2)
	{
		this.dCR2 = dCR2;
	}

	public boolean isOpen() 
	{
		return isOpen;
	}

	public void setOpen(boolean isOpen) 
	{
		this.isOpen = isOpen;
	}

	
	
	
	
	
}
