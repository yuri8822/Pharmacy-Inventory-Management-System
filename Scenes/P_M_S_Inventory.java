package Scenes;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class P_M_S_Inventory
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
        qtyColumn.setCellValueFactory(new PropertyValueFactory<>("qty"));

        //Set the items of the TableView to the ObservableList
        table.setItems(Main.inventory.getList());
    }
    public void AlertShortage(ActionEvent event) throws IOException, ClassNotFoundException, SQLException
    {
        if (Main.session.GetSignedIn().equals("Pharmacist"))
        {
            Main.reportList.AddReport("There Are Items Low on Quantity!");
        }
        else
        {
            System.out.println("You need to be a Pharmacist in order to perform this action");
        }
    }       
    public void RestockInventory(ActionEvent event) throws IOException
    {
        if (Main.session.GetSignedIn().equals("Pharmacist"))
        {
            Main.sceneManager.P_RestockInv(event);  
        }
        else
        {
            System.out.println("You need to be a Pharmacist in order to perform this action");
        }
    }
    public void Search(ActionEvent event) throws IOException
    {
        // What does Search do:
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
