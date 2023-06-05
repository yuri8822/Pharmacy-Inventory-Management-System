package Scenes;

import java.io.IOException;

import Source.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Login
{
    @FXML
    TextField usernameField;
    @FXML
    PasswordField passwordField;

    public void LogIn(ActionEvent event) throws SQLException, IOException, ClassNotFoundException
    {
        // add cases for the other types of users too:
        String userType;
        
        if (Database.GetInstance().hasAccount(usernameField.getText(), passwordField.getText()))
        {
            userType = Database.GetInstance().getUserType(usernameField.getText());
            Main.session.SetSignedIn(userType);
            
            switch (userType) 
            {                
                case "Pharmacist":
                    Main.sceneManager.P_Dashboard(event);
                    break;
                
                case "Manager":
                    Main.sceneManager.M_Dashboard(event);
                    break;
                    
                case "Salesman":
                    Main.sceneManager.S_Dashboard(event);
                    break;

                default:
                    break;
            }
        }
        else
        {
            System.out.println("Please check your Username or Password");
        }
    }         
    public void Signup(ActionEvent event) throws IOException
    {
        Main.sceneManager.SignUp(event);
    }         
}
