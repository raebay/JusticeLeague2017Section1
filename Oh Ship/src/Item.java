
public abstract class Item
{

	public String name; 
	public String description; 
	
	public Item(String name, String description)
	{
		this.name = name;
		this.description = description; 
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String examine()
	{
		return description; 
	}
	
	public void drop()
	{
		
	}
	
	public void pickup()
	{
		
	}

}
