package Model;

import View.Console;
public class Artifact extends Item
{

	public Console View;
		
	public Artifact()
	{
		super("", "", "");
	}
	
	
	public Artifact(String iId, String iName, String iDescription)
	{
		super(iId, iName, iDescription);
	}
	
	@Override
	public String toString()
	{
		return iName;
		
	}
	
	
	
	
	
}
