package Scenes;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class M_OrderStock 
{
    @FXML
    TextField nameField;
    @FXML
    TextField formulaField;
    @FXML
    TextField companyField;
    @FXML
    TextField quantityField;
    @FXML
    MenuButton itemType;

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
        quantityField.setText("3");
        
        //Set the cell value factories for each column
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        formulaColumn.setCellValueFactory(new PropertyValueFactory<>("formula"));
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        expColumn.setCellValueFactory(new PropertyValueFactory<>("expYear"));
        mfgColumn.setCellValueFactory(new PropertyValueFactory<>("mfgYear"));
        qtyColumn.setCellValueFactory(new PropertyValueFactory<>("qty"));

        //Set the items of the TableView to the ObservableList
        table.setItems(Main.inventory.getTempList());
    }

    public void Add(ActionEvent event) throws IOException
    {
        if (itemType.getText().equals("Item Type"))
        {
            System.out.print("Please choose an Item Type");
            return;
        }

        int Q = Integer.parseInt(quantityField.getText());
        Main.inventory.AddNewItem(nameField.getText(), formulaField.getText(), companyField.getText(), itemType.getText(), Q);
    }
    public void Minus(ActionEvent event) throws IOException
    {
        int Q = Integer.parseInt(quantityField.getText());
        quantityField.setText(Integer.toString(Q - 1));
    }
    public void Plus(ActionEvent event) throws IOException
    {
        int Q = Integer.parseInt(quantityField.getText());
        quantityField.setText(Integer.toString(Q + 1));
    }
    public void Confirm(ActionEvent event) throws IOException, SQLException, ClassNotFoundException
    {
        Main.inventory.ConfirmAddItems();
    }
    public void OnMedicine(ActionEvent event) throws IOException
    {
        itemType.setText("Medicine");
    }
    public void OnCosmetic(ActionEvent event) throws IOException
    {
        itemType.setText("Cosmetic");
    }
    public void OnEatable(ActionEvent event) throws IOException
    {
        itemType.setText("Eatable");
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_Dashboard(event);
    }
}
