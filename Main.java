package PharmacyInventoryManagementSystem;

import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    static public Database db;
    static public AccountsList accountsList;

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));      
        Scene HP = new Scene(root);
        primaryStage.setScene(HP);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        db = new Database();
        accountsList = new AccountsList();

        launch(args);
    }
}
