package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Login 
{
    Stage stage;
    Scene scene;
    Parent root;

    @FXML
    TextField usernameField;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
    }
    public void LogIn(ActionEvent event) throws SQLException, IOException
    {
        // add cases for the other types of users too:
        String userType;
        
        if (Main.db.hasUsername(usernameField.getText()))
        {
            userType = Main.db.getUserType(usernameField.getText());

            // System.out.print(userType);
            
            switch (userType) 
            {
                case "Admin":
                    root = FXMLLoader.load(getClass().getResource("P-Dashboard.fxml"));        
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setTitle("Dashboard");
                    stage.setScene(scene);
                    stage.show();  
                    break;
                
                case "Pharmacist":
                    root = FXMLLoader.load(getClass().getResource("P-Dashboard.fxml"));        
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setTitle("Dashboard");
                    stage.setScene(scene);
                    stage.show();  
                    break;
                
                case "Salesman":
                    root = FXMLLoader.load(getClass().getResource("S-Dashboard.fxml"));        
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setTitle("Dashboard");
                    stage.setScene(scene);
                    stage.show();  
                    break;
                
                case "Manager":
                    root = FXMLLoader.load(getClass().getResource("M-Dashboard.fxml"));        
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setTitle("Dashboard");
                    stage.setScene(scene);
                    stage.show();  
                    break;
            
                default:
                    break;
            }
        }
        // Add alternative code (error message that user doesnt exist):
    }         
    public void Signup(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();  
    }         
}
