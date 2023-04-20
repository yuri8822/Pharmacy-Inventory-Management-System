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
        
        if (Main.db.hasUsername(usernameField.getText()))
        {
            root = FXMLLoader.load(getClass().getResource("P-Dashboard.fxml"));        
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Dashboard");
            stage.setScene(scene);
            stage.show();  
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
