package Scenes;

import java.io.IOException;

import Source.Main;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class P_RestockInv 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void Inventory(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_Inventory(event);  
    }
    public void RestockAllItems(ActionEvent event) throws IOException
    {
        // what will this do?
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_Dashboard(event);
    }
}
