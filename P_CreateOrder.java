package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class P_CreateOrder 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void Create(ActionEvent event) throws IOException
    {
        // What does Create do:
    }
    public void Minus(ActionEvent event) throws IOException
    {
        // What does Minus do:
    }
    public void Plus(ActionEvent event) throws IOException
    {
        // What does Plus do:
    }
    public void Back(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("P-Dashboard.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Creat Order");
        stage.setScene(scene);
        stage.show();  
    }
}
