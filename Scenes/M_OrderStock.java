package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class M_OrderStock 
{
    Stage stage;
    Scene scene;
    Parent root;

    @FXML
    MenuButton itemType;

    public void Add(ActionEvent event) throws IOException
    {
        // What does Create do:
        switch (itemType.getText())
        {
            case "Medicine":
                
                break;
        }
        

        Main.inventory.AddNewItem(null);
    }
    public void Minus(ActionEvent event) throws IOException
    {
        // What does Minus do:
    }
    public void Plus(ActionEvent event) throws IOException
    {
        // What does Plus do:
    }
    public void Confirm(ActionEvent event) throws IOException
    {
        // What does Confirm do:
    }
    public void OnMedicine(ActionEvent event) throws IOException
    {
        itemType.setText("Medicine");
    }
    public void OnCosmetic(ActionEvent event) throws IOException
    {
        itemType.setText("Cosmetic");
    }
    public void OnEatable(ActionEvent event) throws IOException
    {
        itemType.setText("Eatable");
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_Dashboard(event);
    }
}
