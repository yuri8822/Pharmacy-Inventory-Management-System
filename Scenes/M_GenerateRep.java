package Scenes;

import java.io.IOException;
import java.sql.SQLException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class M_GenerateRep
{
    @FXML
    TextArea repContent;

    public void initialize()
    {

    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_Dashboard(event);
    }      
    public void Print(ActionEvent event) throws IOException
    {
        // What will Print do?
    }      
    public void Copy_To_Clipboard(ActionEvent event) throws IOException
    {
        // What will Copy_To_Clipboard do?
    }      
    public void Generate(ActionEvent event) throws IOException, SQLException
    {
        Main.reportList.AddReport(repContent.getText());
    }      
}
