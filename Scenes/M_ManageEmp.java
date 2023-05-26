package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class M_ManageEmp
{
    @FXML
    TableView<Employee> table;
    @FXML
    TableColumn<Employee, Number> idColumn;
    @FXML
    TableColumn<Employee, String> fNameColumn;
    @FXML
    TableColumn<Employee, String> lNameColumn;

    public void initialize()
    {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("Fname"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("Lname"));
        
        table.setItems(Main.employeeList.getList());
    }
    public void Manage(ActionEvent event) throws IOException
    {        
        Main.sceneManager.M_ManageEmp_Manage(event);
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_Dashboard(event);
    }  
}