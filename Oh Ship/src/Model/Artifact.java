package Model;

import View.Console;
public class Artifact extends Item{

	public Console View;
	
	public int artifactId;
	
	public Artifact()
	{
		super(0, "", "");
		this.artifactId = 0;
	}
	
	
	public Artifact(int iId, String iName, String iDescription, int artifactId)
	{
		super(iId, iName, iDescription);
		this.artifactId= artifactId;
	}
	
	public int getArtifactId()
	{
		return artifactId;
	}
	
	public void setArtifactid(int artifactId)
	{
		this.artifactId = artifactId;
	}
	
	@Override
	public String toString()
	{
		return "Artifact: artifactId=" + artifactId;
	}
	
	
	
	
	
}
