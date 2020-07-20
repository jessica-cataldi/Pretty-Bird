package birds;

public class DemoForTesting {

	public static void main(String[] args) 
	{
		BirdList birdList = new BirdList();
		
		birdList.insertBird("Red");
		birdList.insertBird("Orange");
		birdList.insertBird("Yellow");
		birdList.insertBird("Green");
		birdList.insertBird("Blue");
		birdList.insertBird("Purple");
		
		birdList.display();
		
		birdList.insertBird("Pink");
		
		birdList.display();
		
		birdList.removeBird("Green");
		
		birdList.display();
		
		System.out.println(birdList.findBird("Blue"));
		
		birdList.removeBird("Blue");
		
		System.out.println(birdList.findBird("Blue"));
		
		birdList.display();
	}
}