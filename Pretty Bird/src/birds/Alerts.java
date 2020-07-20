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
//    public static void wrongCourseAlert()
//    {
//        Alert alert = new Alert(AlertType.WARNING);
//        alert.setTitle("WARNING");
//        alert.setHeaderText("INPUT ERROR: Invalid Input");
//        alert.setContentText("Please make sure you fill out all required information including: Course Number"
//                                + ", Course Title, Course Description, and Number of Credits.");
//        alert.showAndWait();
//    }   
//    public static void wrongTextbookAlert()
//    {
//        Alert alert = new Alert(AlertType.WARNING);
//        alert.setTitle("WARNING");
//        alert.setHeaderText("INPUT ERROR: Invalid Input");
//        alert.setContentText("Please make sure you enter a valid book title along with"
//                              + " the authors name and the ISBN");
//        alert.showAndWait();
//    }      
//    public static void wrongStudentAlert()
//    {
//        Alert alert = new Alert(AlertType.WARNING);
//        alert.setTitle("WARNING");
//        alert.setHeaderText("INPUT ERROR: Invalid Input" );
//        alert.setContentText("Please make sure you enter a first and last name "
//                              + "along with a major and a valid 10 digit phonenumber.");
//        alert.showAndWait();
//    }
//    public static void wrongFacultyAlert()
//    {
//        Alert alert = new Alert(AlertType.WARNING);
//        alert.setTitle("WARNING");
//        alert.setHeaderText("INPUT ERROR: Invalid Input" );
//        alert.setContentText("Please make sure you enter a first and last name "
//                              + "along with a title and a valid 10 digit phonenumber.");
//        alert.showAndWait();
//    }
}
