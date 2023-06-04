package Scenes;

import java.io.IOException;

import Source.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class S_CheckAv 
{
    @FXML
    TextField nameField;
    @FXML
    TextField formulaField;
    @FXML
    TextField companyField;
    @FXML
    Label foundLabel;

    public void Search(ActionEvent event) throws IOException
    {
        if (Main.inventory.SearchItem(nameField.getText(), formulaField.getText(), companyField.getText()))
        {
            foundLabel.setText("Found!");
        }
        else
        {            
            foundLabel.setText("Not Found!");
        }
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.S_Dashboard(event);
    }
}
