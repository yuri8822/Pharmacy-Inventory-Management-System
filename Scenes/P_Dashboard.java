package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class P_Dashboard 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void RestockInventory(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_RestockInv(event);
    }         
    public void Inventory(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_Inventory(event);
    }
    public void SignOut(ActionEvent event) throws IOException
    {
        Main.sceneManager.Login(event);
    }
    public void Search(ActionEvent event) throws IOException
    {
        // What does Search do:
    }
}
