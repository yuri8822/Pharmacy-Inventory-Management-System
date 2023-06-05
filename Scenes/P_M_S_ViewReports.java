package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class P_M_S_ViewReports 
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
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        contentColumn.setCellValueFactory(new PropertyValueFactory<>("content"));
        
        //Set the items of the TableView to the ObservableList
        table.setItems(Main.reportList.getList());
    }
    public void Search(ActionEvent event) throws IOException
    {
        // what will search do?
    }
    public void Back(ActionEvent event) throws IOException
    {
        switch(Main.session.GetSignedIn())
        {
            case "Pharmacist":
            {
                Main.sceneManager.P_Dashboard(event);
                break;
            }
            case "Manager":
            {
                Main.sceneManager.M_Dashboard(event);
                break;
            }
            case "Salesman":
            {
                Main.sceneManager.S_Dashboard(event);
                break;
            }
        }
    }
}

