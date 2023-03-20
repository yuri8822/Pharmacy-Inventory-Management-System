package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));      
        Scene HP = new Scene(root);
        primaryStage.setScene(HP);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();    
    }
    public static void main(String[] args) 
    {
        Database db = new Database();
        db.Start();

        launch(args);        
    }
}
