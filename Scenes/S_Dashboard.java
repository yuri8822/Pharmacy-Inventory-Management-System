package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class S_Dashboard 
{
    Stage stage;
    Scene scene;
    Parent root;
    @FXML MenuButton User;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
    }
    public void showProcessSale(ActionEvent event) throws IOException
    {    
        // What page will this show:

        // root = FXMLLoader.load(getClass().getResource("A-M-P-Inventory.fxml"));
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // scene = new Scene(root);
        // stage.setTitle("Inventory");
        // stage.setScene(scene);
        // stage.show();  
    }
    public void showInventory(ActionEvent event) throws IOException
    {    
        root = FXMLLoader.load(getClass().getResource("A-M-P-Inventory.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Inventory");
        stage.setScene(scene);
        stage.show();  
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