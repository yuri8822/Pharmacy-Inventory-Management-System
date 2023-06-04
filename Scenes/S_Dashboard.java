package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;

public class S_Dashboard 
{
    @FXML
    MenuButton User;

    public void showProcessSale(ActionEvent event) throws IOException
    {    
        // What page will this show:
    }
    public void ShowInventory(ActionEvent event) throws IOException
    {    
        Main.sceneManager.P_M_S_Inventory(event);  
    }
    public void SignOut(ActionEvent event) throws IOException
    {    
        Main.sceneManager.Login(event);
        Main.session.SetSignedIn("null");
    }
    public void CheckAv(ActionEvent event) throws IOException
    {    
        Main.sceneManager.S_CheckAv(event);
    }
    public void ViewRep(ActionEvent event) throws IOException
    {    
        Main.sceneManager.P_M_S_ViewReports(event);
    }
    public void Search(ActionEvent event) throws IOException
    {    
        // What does Search do:
    }
}
