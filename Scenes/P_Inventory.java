package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;

public class P_Inventory
{

    public void AlertShortage(ActionEvent event) throws IOException
    {
        // MAKE CONTROLLER AND PAGE:

        // root = FXMLLoader.load(getClass().getResource("P-AlertShortage.fxml"));        
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // scene = new Scene(root);
        // stage.setTitle("Alert Shortage");
        // stage.setScene(scene);
        // stage.show();  
    }       
    public void RestockInventory(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_RestockInv(event);  
    }
    public void Search(ActionEvent event) throws IOException
    {
        // What does Search do:
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_Dashboard(event);
    }
}
