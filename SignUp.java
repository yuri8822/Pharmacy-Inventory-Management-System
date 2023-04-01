package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignUp 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
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
    public void Register(ActionEvent event) throws IOException
    {
        // code for what Register button does

        //check for repeated Username:
        while (reader.Read())
        {
            if (reader[0].ToString() == textBox1.Text)
            {
                flag = true;
                break;
            }
        }
        //check for uppercase character in username:
        for (int i = 0; i < textBox1.Text.Length; i++)
        {
            if (User[i] >= 65 && User[i] <= 90)
            {
                userHasUpper = true;
            }
        }
        //check for special character in password:
        for (int i = 0; i < textBox2.Text.Length; i++)
        {
            if ((Pass[i] >= 32 && Pass[i] <=47) || (Pass[i] >= 58 && Pass[i] <= 64) || (Pass[i] >= 91 && Pass[i] <= 96) || (Pass[i] >= 123 && Pass[i] <= 126))
            {
                hasSpecial = true;
            }
        }
        //check for uppercase character in password:
        for (int i = 0; i < textBox2.Text.Length; i++)
        {
            if (Pass[i] >= 65 && Pass[i] <= 90)
            {
                hasUpper = true;
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////

        //conditions:
        if (textBox1.Text == "" || textBox2.Text == "" || textBox3.Text == "" || textBox4.Text == "" || textBox5.Text == "")
        {
            MessageBox.Show("All fields must be filled!");
        }
        else
        {
            if (flag)
            {
                MessageBox.Show("User Already Exists");
            }
            else // for User
            {
                if (textBox1.Text.Length < 6 || textBox1.Text.Length > 8)
                {
                    MessageBox.Show("Username must contain between 6-8 characters");
                }
                else if (userHasUpper == false)
                {
                    MessageBox.Show("Username must contain at least one uppercase character");
                }
                else // for Pass
                {
                    if (textBox2.Text.Length < 6 || textBox2.Text.Length > 10)
                    {
                        MessageBox.Show("Password must contain between 6-10 characters");
                    }
                    else if (hasSpecial == false)
                    {
                        MessageBox.Show("Password must contain at least 1 special character");
                    }
                    else if (hasUpper == false)
                    {
                        MessageBox.Show("Password must contain at least one uppercase character");
                    }
                    else
                    {
                        if (textBox3.Text.Length < 7 || textBox3.Text.Length > 12)
                        {
                            MessageBox.Show("Question 1 must contain between 7-12 characters");
                        }
                        else if (textBox4.Text.Length < 7 || textBox4.Text.Length > 12)
                        {
                            MessageBox.Show("Question 2 must contain between 7-12 characters");
                        }
                        else if (textBox5.Text.Length < 7 || textBox5.Text.Length > 12)
                        {
                            MessageBox.Show("Question 3 must contain between 7-12 characters");
                        }
                        else
                        {
                            buttonClicked = true;
                            OleDbCommand cmd = new OleDbCommand($"INSERT INTO USERS (UserName, [Password], Ans1, Ans2, Ans3) VALUES ('{textBox1.Text}', '{textBox2.Text}', '{textBox3.Text}', '{textBox4.Text}', '{textBox5.Text}')", conn);
                            cmd.ExecuteNonQuery();
                            conn.Close();
                            MessageBox.Show("Entry added!", "Signed Up", MessageBoxButtons.OK, MessageBoxIcon.Information);
                            this.Close();
                            welcome.Show();
                        }
                    }
                }                        
            }
        }
    }         
}
