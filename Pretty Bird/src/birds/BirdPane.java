package birds;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import images.Images;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BirdPane 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void startBird(Stage primaryStage) throws Exception 
	{
		Images images = new Images();
		BirdList birdList = new BirdList();

		BorderPane root = new BorderPane();
		Button findBirdButton, insertBirdButton, showAllBirdsButton;
		HBox birdBox = new HBox();
		HBox allBox = new HBox();

		ComboBox<String> colorComboBox;
		colorComboBox = new ComboBox();
		colorComboBox.setPromptText("color");
		colorComboBox.setItems(FXCollections.observableArrayList("Red", "Orange", "Yellow", "Green", "Blue", "Purple"));

		findBirdButton = new Button("Find Bird");
		insertBirdButton = new Button("Insert Bird");
		showAllBirdsButton = new Button("SHOW ME ALL THE PRETTY BIRDS!");
		birdBox.getChildren().addAll(colorComboBox, insertBirdButton, findBirdButton);
		birdBox.setAlignment(Pos.CENTER);
		allBox.getChildren().add(showAllBirdsButton);
		allBox.setAlignment(Pos.BOTTOM_CENTER);

		root.setTop(new Text("			  	Welcome to Pretty Bird!" + 
							 "\n				How it works:\n"+
							 " 				1. Choose the color of a bird you\n				 want to insert\n" +
							 "				2. Select a color you inserted to \n			       "
							 + " learn a fun fact about a bird species \n\t\t\t\tof that color" +
							 "\n 3. OR, If you want to see all the pretty birds you can \n"
							 + "   skip steps 1 and 2 by pressing the button labeled \n   'SHOW ME ALL THE PRETTY BIRDS!'"));
		root.setCenter(birdBox);
		root.setBottom(allBox);

		//main image
		{
			try 
			{
				Image image = new Image(new FileInputStream("C:\\Users\\jessica\\CSE218\\Pretty Bird\\src\\images\\mainPrettyBird.jpg"));
				ImageView imageView = new ImageView(image);
				imageView.setFitHeight(100);
				imageView.setFitWidth(100);
				root.getChildren().add(imageView);
			} 
			catch (FileNotFoundException e1) 
			{
				e1.printStackTrace();
			}
		}

		
		insertBirdButton.setOnAction(e -> 
		{
			String color = colorComboBox.getValue();
			@SuppressWarnings("unused")
			Bird bird = new Bird(color);
			if (colorComboBox.getValue() != null) 
			{
				birdList.insertBird(color);
				colorComboBox.setValue(null);
			} 
			else 
			{
				Alerts.noInput();
			}
		});
		findBirdButton.setOnAction(e -> 
		{
			String color = colorComboBox.getValue();
			Bird bird = birdList.findBird(color);
			
			if(bird != null)			
			{
				if (bird.getColor().equals("Red")) 
				{
					try 
					{
						images.getRed();
					} 
					catch (FileNotFoundException e1) 
					{
						e1.printStackTrace();
					}
				} 
				else if (bird.getColor().equals("Orange")) 
				{
					try 
					{
						images.getOrange();
					} 
					catch (FileNotFoundException e1) 
					{
						e1.printStackTrace();
					}
				} 
				else if (bird.getColor().equals("Yellow")) 
				{
					try 
					{
						images.getYellow();
					} 
					catch (FileNotFoundException e1) 
					{
						e1.printStackTrace();
					}
				} 
				else if (bird.getColor().equals("Green")) 
				{
					try 
					{
						images.getGreen();
					} 
					catch (FileNotFoundException e1) 
					{
						e1.printStackTrace();
					}
				} 
				else if (bird.getColor().equals("Blue")) 
				{
					try 
					{
						images.getBlue();
					} 
					catch (FileNotFoundException e1) 
					{
						e1.printStackTrace();
					}
				} 
				else if (bird.getColor().equals("Purple")) 
				{
					try 
					{
						images.getPurple();
					} 
					catch (FileNotFoundException e1) 
					{
						e1.printStackTrace();
					}
				}
			}
			else 
			{
				Alerts.prettyBirdDoesNotExist();;
			}
		});
		showAllBirdsButton.setOnAction(s -> 
		{
			birdList.display();
		});

		Scene scene = new Scene(root, 300, 300);
		primaryStage.setTitle("Pretty Bird App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}