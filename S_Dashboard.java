package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class S_Dashboard 
{
    Stage stage;
    Scene scene;
    Parent root;
    @FXML MenuButton User;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
    }
    public void showRestockInv(ActionEvent event) throws IOException
    {    
        root = FXMLLoader.load(getClass().getResource("RestockInv.fxml"));   
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Restock Inventory");
        stage.setScene(scene);
        stage.show();  
    }
}
