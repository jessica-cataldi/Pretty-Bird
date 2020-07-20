package birds;

import images.Images;

public class BirdList 
{
	private Bird birdHead;
	
	public BirdList()
	{
		birdHead = null;
	}
		
	public void insertBird(String color)
	{		
		Bird newBird = new Bird(color);
		newBird.setNext(birdHead);
		birdHead = newBird;		
	}		
	public Bird findBird(String color) 
	{
		Bird currentBird = birdHead; 
		if(currentBird != null)
		{
			while(currentBird.getColor() != color)
			{
				if(currentBird.getNext() == null) 
				{
					return null;
				}
				else 
				{
					currentBird = currentBird.getNext();
				}
			}
		}
		return currentBird;		
	}
	public Bird removeBird(String color)
	{
		Bird currentBird = birdHead;
		Bird previousBird = birdHead;		
		while(currentBird.getColor() != color)
		{
			if(currentBird.getNext() == null)
			{
				return null;
			}
			else
			{
				previousBird = currentBird;
				currentBird = currentBird.getNext();
			}
		}
		if(currentBird == birdHead) 
		{
			birdHead = birdHead.getNext();
		}
		else
		{
			previousBird.setNext(currentBird.getNext()); 
		}
		return currentBird;
	}
	public void display() 
	{
		Images images = new Images();
		Bird currentBird = birdHead;
		while(currentBird != null)
		{
			currentBird = currentBird.getNext();
		}
		images.tasteTheRainbow();
	}
}