package Scenes;

import java.io.IOException;

import Source.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Login
{
    @FXML
    TextField usernameField;

    public void LogIn(ActionEvent event) throws SQLException, IOException
    {
        // add cases for the other types of users too:
        String userType;
        
        if (Main.db.hasUsername(usernameField.getText()))
        {
            userType = Main.db.getUserType(usernameField.getText());
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
        // Add alternative code (error message that user doesnt exist):
    }         
    public void Signup(ActionEvent event) throws IOException
    {
        Main.sceneManager.SignUp(event);
    }         
}
