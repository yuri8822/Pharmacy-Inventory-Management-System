package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class M_GenerateRep 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void Back(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("M-Dashboard.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Dashboard");
        stage.setScene(scene);
        stage.show();  
    }      
    public void Print(ActionEvent event) throws IOException
    {
        // What will Print do?
    }      
    public void Copy_To_Clipboard(ActionEvent event) throws IOException
    {
        // What will Copy_To_Clipboard do?
    }      
    public void Generate(ActionEvent event) throws IOException
    {
        // What will Generate do?
    }      
}
