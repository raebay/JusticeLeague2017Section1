package Model;

import View.Console;
public class Artifact extends Item
{

	public Console View;
	
	public String artifactId;
	
	public Artifact()
	{
		super("", "", "");
		this.artifactId = "";
	}
	
	
	public Artifact(String iId, String iName, String iDescription, String artifactId)
	{
		super(iId, iName, iDescription);
		this.artifactId= artifactId;
	}
	
	public String getArtifactId()
	{
		return artifactId;
	}
	
	public void setArtifactid(String artifactId)
	{
		this.artifactId = artifactId;
	}
	
	@Override
	public String toString()
	{
		return "Artifact: artifactId=" + artifactId;
	}
	
	
	
	
	
}
