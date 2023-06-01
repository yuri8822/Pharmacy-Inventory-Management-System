package Scenes;

import java.io.IOException;
import java.sql.SQLException;

import Source.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUp 
{
    @FXML
    TextField usernameField;
    @FXML
    PasswordField passwordField;
    @FXML
    MenuButton userType;

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
        Main.sceneManager.Login(event);
    }         
    public void Register(ActionEvent event) throws IOException, SQLException, ClassNotFoundException
    {
        // code for what Register button does
        Database.GetInstance().Register(usernameField.getText(), passwordField.getText(), userType.getText());

        //check for repeated Username:
        
        //check for uppercase character in username:
        
        //check for special character in password:
        
        //check for uppercase character in password:
    }         
}
