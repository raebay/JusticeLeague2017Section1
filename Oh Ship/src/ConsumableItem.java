
public class ConsumableItem extends Item 
{
	int itemEffect; 

	public ConsumableItem(String name, String description, int itemEffect) 
	{
		super(name, description);
		this.itemEffect = itemEffect; 
		
	}
	
	public int getItemEffect()
	{
		return itemEffect; 
	}
	
	public void setItemEffect(int itemEffect)
	{
		this.itemEffect = itemEffect; 
	}

}
