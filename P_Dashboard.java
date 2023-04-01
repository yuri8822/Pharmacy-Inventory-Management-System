package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class P_Dashboard 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void CreateOrder(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("P-CreateOrder.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Create Order");
        stage.setScene(scene);
        stage.show();  
    }         
    public void Inventory(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("A-M-P-Inventory.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Inventory");
        stage.setScene(scene);
        stage.show();  
    }
    public void SignOut(ActionEvent event) throws IOException
    {
        // What does sign out do:
    }
    public void Search(ActionEvent event) throws IOException
    {
        // What does Search do:
    }
}
