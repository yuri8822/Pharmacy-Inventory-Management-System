package Scenes;

import java.io.IOException;
import java.sql.SQLException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class M_ManageEmp_Manage
{
    @FXML
    TextField fNameTextField;
    @FXML
    TextField lNameTextField;

    public void Add(ActionEvent event) throws IOException, SQLException
    {
        Main.employeeList.AddEmployee(fNameTextField.getText(), lNameTextField.getText());
    }
    public void Remove(ActionEvent event) throws IOException, SQLException
    {
        Main.employeeList.RemoveEmployee(fNameTextField.getText(), lNameTextField.getText());
    }
    public void Back(ActionEvent event) throws IOException
    {
        // add a close screen option here
    }  
}