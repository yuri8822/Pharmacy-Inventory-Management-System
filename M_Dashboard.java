package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class M_Dashboard 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
    }
    public void GenerateRep(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("M-GenerateRep.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Generate Reports");
        stage.setScene(scene);
        stage.show();  
    }         
    public void OrderStock(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("M-OrderStock.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Order Stock");
        stage.setScene(scene);
        stage.show();  
    }         
    public void ReviewFeedback(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("M-ReviewFeedback.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Review Feedback");
        stage.setScene(scene);
        stage.show();  
    }         
    public void ManageEmployees(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("M-ManageEmp.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Manage Employees");
        stage.setScene(scene);
        stage.show();  
    }         
    public void SignOut(ActionEvent event) throws IOException
    {
        // what does sign out do?
    }         
    public void OpenReport(ActionEvent event) throws IOException
    {
        // what does Open Report do?
    }         
}
