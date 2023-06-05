package Scenes;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import Source.Item;
import Source.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class P_CheckExp 
{
    @FXML
    TableView<Item> table;
    @FXML
    TableColumn<Item, Number> idColumn;
    @FXML
    TableColumn<Item, String> nameColumn;
    @FXML
    TableColumn<Item, String> formulaColumn;
    @FXML
    TableColumn<Item, String> companyColumn;
    @FXML
    TableColumn<Item, Date> expColumn;
    @FXML
    TableColumn<Item, Date> mfgColumn;
    @FXML
    TableColumn<Item, String> typeColumn;
    @FXML
    TableColumn<Item, Number> qtyColumn;

    public void initialize()
    {
        //Set the cell value factories for each column
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        formulaColumn.setCellValueFactory(new PropertyValueFactory<>("formula"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        expColumn.setCellValueFactory(new PropertyValueFactory<>("expYear"));
        mfgColumn.setCellValueFactory(new PropertyValueFactory<>("mfgYear"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        qtyColumn.setCellValueFactory(new PropertyValueFactory<>("qty"));

        //Set the items of the TableView to the ObservableList
        table.setItems(Main.inventory.GetExpItems());
    }
    public void RemoveItems(ActionEvent event) throws IOException, ClassNotFoundException, SQLException
    {
        Main.inventory.RemoveExpItems();
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.P_Dashboard(event);
    }    
}
