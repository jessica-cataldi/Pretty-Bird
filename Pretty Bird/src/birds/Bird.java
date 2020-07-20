package birds;

public class Bird
{
	private String color;
	private Bird next;
	
	public Bird(String color) 
	{
		this.color = color;
		next = null;
	}
	public Bird() {}

	public String getColor() 
	{
		return color;
	}
	public Bird getNext()
	{
		return next;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	public void setNext(Bird next)
	{
		this.next = next;
	}
	
	public void display()
	{
		System.out.print(color + "\t");
	}

	public String toString() 
	{
		return "Bird: " + color;
	}	
}