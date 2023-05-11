package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager 
{
    private Parent root;
    private Scene scene;
    private Stage primaryStage;

    public void setup(Stage primaryStage) throws IOException
    {
        this.primaryStage = primaryStage;
        
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        scene = new Scene(root);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void Login(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void P_Dashboard(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("P-Dashboard.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();   
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }
    public void M_Dashboard(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("M-Dashboard.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();     
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }
    public void S_Dashboard(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("S-Dashboard.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();     
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }
}
