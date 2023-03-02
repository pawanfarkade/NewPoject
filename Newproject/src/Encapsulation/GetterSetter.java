package Encapsulation;

public class GetterSetter {
	
	public int id;
	public String name;
	public float price;
	public String colour;
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public void setColour(String colour) 
	{
		this.colour=colour;
		
	}
	
	public int setId() 
	{
		return id;
	}
	public String setName() 
	{
		return name;
	}
	public float setPrice() 
	{
		return price;
	}
	public String setColour() 
	{
		return colour;
	}

}
