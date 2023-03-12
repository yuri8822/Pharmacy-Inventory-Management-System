package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReviewFeedback 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
    }
    public void showGenerateRep(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("GenerateRep.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Generate Reports");
        stage.setScene(scene);
        stage.show();  
    }
    public void showManageEmp(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("ManageEmp.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Manage Employees");
        stage.setScene(scene);
        stage.show();  
    }
    public void showOrderStock(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("RestockInv.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Order Stock");
        stage.setScene(scene);
        stage.show();  
    }   
          
}
