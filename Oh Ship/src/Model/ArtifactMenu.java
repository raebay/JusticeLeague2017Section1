package Model;
import View.Console;
public class ArtifactMenu {

	Console view;
	
	String artifactId;
	String artifactName;
	String artifactDescription;
	String artifactFunction;
	
	
	int generatOrManualId = 06;
	String generatOrManualName = "Generat Or Manual";
	String generatOrManualDescription = "Manual for Generator 322.";
	String generatOrManualFunction = "Turn generator on!";
	
	
	int personaIPhotosId = 07;
	String personaIPhotosName = "Persona I Photos";
	String personaIPhotosDescription = "This is a picture of your wife and daughter. You must go back to them.";
	String personaIPhotosFunction = "none";
	
	int accessKeyId = 8;
	String accessKeyName = "Access Key";
	String accessKeyDescription = "This key can be used to open the doors in the ship. Belongs to: Supervisor Matthew";
	String accessKeyFunction = "Allows access through stairs";
	
	
	
	int accessKeyToBridgeId = 9;
	String accessKeyToBridgeName = "Access Key to the Bridge";
	String accessKeyToBridgeDescription = "his access Key can be used to enter the bridge. Belongs to: Officer James";
	String accessKeyToBridgeFunction = "Allows Access to the bridge";
	
	String[] artifactNameArray = {generatOrManualName, personaIPhotosName, accessKeyName, accessKeyToBridgeName };
	String[] artifactDescriptionArray = {generatOrManualDescription, personaIPhotosDescription, accessKeyDescription, accessKeyToBridgeDescription};
	
	
	public String[] getArtifactName() 
	{
		return artifactNameArray;
	}
	
	public void setArtifactName(String[] artifactNameArray) 
	{
		this.artifactNameArray = artifactNameArray;
	}
	
	public String[] getArtifactDescription() 
	{
		return artifactDescriptionArray;
	}
	public void setArtifactDescription(String[] artifactDescriptionArray) 
	{
		this.artifactDescriptionArray = artifactDescriptionArray;
	}
}
