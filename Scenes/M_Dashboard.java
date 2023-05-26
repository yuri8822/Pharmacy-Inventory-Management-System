package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;

public class M_Dashboard 
{
    public void GenerateRep(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_GenerateRep(event);
    }         
    public void OrderStock(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_OrderStock(event);
    }         
    public void ReviewFeedback(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_ReviewFeedback(event);
    }         
    public void ManageEmployees(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_ManageEmp(event);
    }         
    public void SignOut(ActionEvent event) throws IOException
    {
        Main.sceneManager.Login(event);
    }         
    public void OpenReport(ActionEvent event) throws IOException
    {
        // what does Open Report do?
    }         
}
