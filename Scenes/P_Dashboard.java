package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;

public class P_Dashboard 
{
    public void RestockInventory(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_RestockInv(event);
    }         
    public void Inventory(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_Inventory(event);
    }
    public void CustomOrder(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_CustomOrder(event);
    }
    public void ViewRep(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_M_S_ViewReports(event);
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
