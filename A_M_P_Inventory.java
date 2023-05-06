package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class A_M_P_Inventory
{
    Stage stage;
    Scene scene;
    Parent root;

    public void AlertShortage(ActionEvent event) throws IOException
    {
        // MAKE CONTROLLER AND PAGE:

        // root = FXMLLoader.load(getClass().getResource("P-CreatOrder.fxml"));        
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // scene = new Scene(root);
        // stage.setTitle("Creat Order");
        // stage.setScene(scene);
        // stage.show();  
    }         
    public void RestockInventory(ActionEvent event) throws IOException
    {
        // MAKE CONTROLLER AND PAGE:

        // root = FXMLLoader.load(getClass().getResource("A-M-P-Inventory.fxml"));        
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // scene = new Scene(root);
        // stage.setTitle("Inventory");
        // stage.setScene(scene);
        // stage.show();  
    }
    public void Search(ActionEvent event) throws IOException
    {
        // What does Search do:
    }
    public void Back(ActionEvent event) throws IOException
    {
        // back depends on which user type accessed the inventory
    }

}
