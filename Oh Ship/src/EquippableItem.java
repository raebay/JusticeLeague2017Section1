
public class EquippableItem extends Item 
{
	int statChange; 

	public EquippableItem(String name, String description, int statChange)
	{
		super(name, description);
		this.statChange = statChange;
		
	}

	public int getStatChange()
	{
		return statChange;
	}

	public void setStatChange(int statChange)
	{
		this.statChange = statChange;
	}
	
	public void equipItem()
	{
		
	}
	
	public void unEquipItem()
	{
		
	}
	
	

}
