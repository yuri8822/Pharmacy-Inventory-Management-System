package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;

public class M_ManageEmp
{
    public void Add(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_ManageEmp_Add(event);
    }
    public void Update(ActionEvent event) throws IOException
    {
        
    }
    public void Remove(ActionEvent event) throws IOException
    {
        
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_Dashboard(event);
    }  
}