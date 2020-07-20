package birds;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts
{
    public static void prettyBirdDoesNotExist()
    {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("PRETTY BIRD ERROR");
        alert.setHeaderText("NO RESULTS: ");
        alert.setContentText("Sorry, but it looks like the pretty bird you are trying to find does not exist. "
        		+ "Try inserting the bird first and then search again.");
        alert.showAndWait();
    }    
    public static void noInput()
    {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("WARNING");
        alert.setHeaderText("INSERT ERROR: ");
        alert.setContentText("You need to select a pretty to insert first.");
        alert.showAndWait();
    }
}
