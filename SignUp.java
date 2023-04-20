package PharmacyInventoryManagementSystem;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUp 
{
    Stage stage;
    Scene scene;
    Parent root;

    @FXML
    TextField usernameField;

    @FXML
    PasswordField passwordField;

    @FXML
    MenuButton userType;

    public void onAdmin() throws IOException
    {
        userType.setText("Admin");
    }
    public void onPharmacist() throws IOException
    {
        userType.setText("Pharmacist");    
    }
    public void onManager() throws IOException
    {
        userType.setText("Manager");    
    }
    public void onSalesman() throws IOException
    {
        userType.setText("Salesman");    
    }
    public void LogIn(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Log in");
        stage.setScene(scene);
        stage.show();  
    }         
    public void Register(ActionEvent event) throws IOException, SQLException
    {
        // code for what Register button does
        Main.db.Register(usernameField.getText(), passwordField.getText(), userType.getText());
        

        //check for repeated Username:
        
        //check for uppercase character in username:
        
        //check for special character in password:
        
        //check for uppercase character in password:
    }         
}
