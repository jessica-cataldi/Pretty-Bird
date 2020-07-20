package images;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Images 
{
//	private HBox birdHouse = new HBox();
//	private VBox infoBox = new VBox();
//	private Text text = new Text();
//	private Font font = Font.font(15);
	
	public void getRed() throws FileNotFoundException
	{
		HBox birdHouse = new HBox();
		VBox infoBox = new VBox();
		Text text = new Text();
		Font font = Font.font(15);
		
		Image image = new Image(new FileInputStream("C:\\Users\\jessica\\CSE218\\Pretty Bird\\src\\images\\redBird.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		birdHouse.getChildren().add(imageView);
		birdHouse.setAlignment(Pos.TOP_CENTER);
		
		text.setText("\t\tFun Fact: \n\t\tcardinals have a love life "
					 + "\n\t\tsimilar to humans, "
				+ "they are \n\t\tmonogamous and mate for life.");
		text.setFont(font);
		infoBox.getChildren().add(text);
		infoBox.setAlignment(Pos.CENTER);

		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(birdHouse, infoBox);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		Stage stage = new Stage();
		stage.setTitle("Cardinal");
		stage.setScene(scene);
		stage.show();
	}	
	public void getOrange() throws FileNotFoundException
	{
		HBox birdHouse = new HBox();
		VBox infoBox = new VBox();
		Text text = new Text();
		Font font = Font.font(15);
		
		Image image = new Image(new FileInputStream("C:\\Users\\jessica\\CSE218\\Pretty Bird\\src\\images\\orangeBird.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		birdHouse.getChildren().add(imageView);
		birdHouse.setAlignment(Pos.TOP_CENTER);
		
		text.setText("\t\tFun Fact: \n\t\tafter these beautiful birds mate "
					 + "\n\t\t, mothers are responsible for building nests "
				+ "they are \n\t\tmade from mud in rocky overhangs.");
		text.setFont(font);
		infoBox.getChildren().add(text);
		infoBox.setAlignment(Pos.CENTER);

		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(birdHouse, infoBox);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		Stage stage = new Stage();
		stage.setTitle("Guianan Cock of the Rock");
		stage.setScene(scene);
		stage.show();
	}	
	public void getYellow() throws FileNotFoundException
	{
		HBox birdHouse = new HBox();
		VBox infoBox = new VBox();
		Text text = new Text();
		Font font = Font.font(15);
		
		Image image = new Image(new FileInputStream("C:\\Users\\jessica\\CSE218\\Pretty Bird\\src\\images\\yellowBird.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		birdHouse.getChildren().add(imageView);
		birdHouse.setAlignment(Pos.TOP_CENTER);
		
		text.setText("\t\tFun Fact: \n\t\tthese birds have the ability to "
					 + "\n\t\tmolt and regrow new feathers ");
		text.setFont(font);
		infoBox.getChildren().add(text);
		infoBox.setAlignment(Pos.CENTER);

		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(birdHouse, infoBox);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		Stage stage = new Stage();
		stage.setTitle("American Goldfinch");
		stage.setScene(scene);
		stage.show();
	}	
	public void getGreen() throws FileNotFoundException
	{
		HBox birdHouse = new HBox();
		VBox infoBox = new VBox();
		Text text = new Text();
		Font font = Font.font(15);
		
		Image image = new Image(new FileInputStream("C:\\Users\\jessica\\CSE218\\Pretty Bird\\src\\images\\greenBird.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		birdHouse.getChildren().add(imageView);
		birdHouse.setAlignment(Pos.TOP_CENTER);
		
		text.setText("\tFun Fact: \n\talthough beautiful and sweet looking "
					 + "\n\t, Green Jays have an appetite for small "
				+ "\n\tanimals like frogs and small mammals.");
		text.setFont(font);
		infoBox.getChildren().add(text);
		infoBox.setAlignment(Pos.CENTER);

		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(birdHouse, infoBox);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		Stage stage = new Stage();
		stage.setTitle("Green Jay");
		stage.setScene(scene);
		stage.show();
	}	
	public void getBlue() throws FileNotFoundException
	{
		HBox birdHouse = new HBox();
		VBox infoBox = new VBox();
		Text text = new Text();
		Font font = Font.font(15);
		
		Image image = new Image(new FileInputStream("C:\\Users\\jessica\\CSE218\\Pretty Bird\\src\\images\\blueBird.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		birdHouse.getChildren().add(imageView);
		birdHouse.setAlignment(Pos.TOP_CENTER);
		
		text.setText("\t\tFun Fact: \n\t\tin old African American folklore "
					 + "\n\t\t, Blue Jays were thought to be "
				+ " \n\t\tservants of the devil.");
		text.setFont(font);
		infoBox.getChildren().add(text);
		infoBox.setAlignment(Pos.CENTER);

		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(birdHouse, infoBox);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		Stage stage = new Stage();
		stage.setTitle("Blue Jay");
		stage.setScene(scene);
		stage.show();
	}	
	public void getPurple() throws FileNotFoundException
	{
		HBox birdHouse = new HBox();
		VBox infoBox = new VBox();
		Text text = new Text();
		Font font = Font.font(15);
		
		Image image = new Image(new FileInputStream("C:\\Users\\jessica\\CSE218\\Pretty Bird\\src\\images\\purpleBird.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		birdHouse.getChildren().add(imageView);
		birdHouse.setAlignment(Pos.TOP_CENTER);
		
		text.setText("\t\tFun Fact: \n\t\tViolet Backed Starlings are "
					 + "\n\t\tthe smallest South African Starling, "
				+ "\n\t\tgrowing to only 18cm in length.");
		text.setFont(font);
		infoBox.getChildren().add(text);
		infoBox.setAlignment(Pos.CENTER);

		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(birdHouse, infoBox);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		Stage stage = new Stage();
		stage.setTitle("Violet Backed Starling");
		stage.setScene(scene);
		stage.show();
	}
	public void tasteTheRainbow()
	{
		try {
			getRed();
			getOrange();
			getYellow();
			getGreen();
			getBlue();
			getPurple();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}