package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class M_Dashboard 
{
    @FXML
    TableView<Report> table;
    @FXML
    TableColumn<Report, Number> idColumn;
    @FXML
    TableColumn<Report, String> contentColumn;

    public void initialize()
    {
        //Set the cell value factories for each column
        idColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        contentColumn.setCellValueFactory(new PropertyValueFactory<>("content"));
        
        //Set the items of the TableView to the ObservableList
        table.setItems(Main.reportList.getList());
    }
    public void GenerateRep(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_GenerateRep(event);
    }         
    public void OrderStock(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_OrderStock(event);
    }         
    public void ReviewFeedback(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_ReviewFeedback(event);
    }         
    public void ManageEmployees(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_ManageEmp(event);
    }
    public void ShowInventory(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_M_S_Inventory(event);
    }
    public void SignOut(ActionEvent event) throws IOException
    {
        Main.sceneManager.Login(event);
        Main.session.SetSignedIn("null");
    }         
    public void OpenReport(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_M_S_ViewReports(event);
    }         
}
