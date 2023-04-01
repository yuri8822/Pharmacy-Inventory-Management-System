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

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login 
{
    Stage stage;
    Scene scene;
    Parent root;
    ResultSet Usernames;
    ResultSet Passwords;

    boolean flag;

    @FXML
    TextField usernameField;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
    }
    public void LogIn(ActionEvent event) throws SQLException, IOException
    {
        Usernames = Main.db.getUsernames();

        //check if Username exists:
        while (Usernames.next())
        {
            if (usernameField.getText().equals(Usernames.getString(1)))
            {
                flag = true;
                break;
            }
        }
        Usernames.close();

        if (flag)
        {
            root = FXMLLoader.load(getClass().getResource("P-Dashboard.fxml"));        
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Dashboard");
            stage.setScene(scene);
            stage.show();  
        }
    
        // //check for uppercase character in username:
        // for (int i = 0; i < textBox1.Text.Length; i++)
        // {
        //     if (User[i] >= 65 && User[i] <= 90)
        //     {
        //         userHasUpper = true;
        //     }
        // }
        // //check for special character in password:
        // for (int i = 0; i < textBox2.Text.Length; i++)
        // {
        //     if ((Pass[i] >= 32 && Pass[i] <= 47) || (Pass[i] >= 58 && Pass[i] <= 64) || (Pass[i] >= 91 && Pass[i] <= 96) || (Pass[i] >= 123 && Pass[i] <= 126))
        //     {
        //         hasSpecial = true;
        //     }
        // }
        // //check for uppercase character in password:
        // for (int i = 0; i < textBox2.Text.Length; i++)
        // {
        //     if (Pass[i] >= 65 && Pass[i] <= 90)
        //     {
        //         hasUpper = true;
        //     }
        // }

        // /////////////////////////////////////////////////////////////////////////////////////

        // //conditions:
        // if (textBox1.Text == "" || textBox2.Text == "")
        // {
        //     MessageBox.Show("All fields must be filled!");
        // }
        // else //for user:
        // { 
        //     if (textBox1.Text.Length < 6 || textBox1.Text.Length > 8)
        //     {
        //         MessageBox.Show("Username must contain between 6-8 characters");
        //     }
        //     else if (userHasUpper == false)
        //     {
        //         MessageBox.Show("Username must contain at least one uppercase character");
        //     }
        //     else // for Pass
        //     {
        //         if (textBox2.Text.Length < 6 || textBox2.Text.Length > 10)
        //         {
        //             MessageBox.Show("Password must contain between 6-10 characters");
        //         }
        //         else if (hasSpecial == false)
        //         {
        //             MessageBox.Show("Password must contain at least 1 special character");
        //         }
        //         else if (hasUpper == false)
        //         {
        //             MessageBox.Show("Password must contain at least one uppercase character");
        //         }
        //         else
        //         {
        //             if (!flag)
        //             {
        //                 MessageBox.Show("Incorrect Username or Password", "Login Failed", MessageBoxButtons.OK, MessageBoxIcon.Warning);
        //             }
        //             else
        //             {
        //                 buttonClicked = true;
        //                 this.Close();
        //                 DashBoard dashBoard = new DashBoard();
        //                 dashBoard.Show();
        //                 MessageBox.Show("Login Successful", "Logged In", MessageBoxButtons.OK, MessageBoxIcon.Information);
        //             }
        //         }                
        //     }
        // }
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
