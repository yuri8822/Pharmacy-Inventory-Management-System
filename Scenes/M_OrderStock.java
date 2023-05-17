package Scenes;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import Source.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class M_OrderStock 
{
    Stage stage;
    Scene scene;
    Parent root;

    @FXML
    TextField nameField;
    @FXML
    TextField formulaField;
    @FXML
    TextField companyField;
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

    public void Add(ActionEvent event) throws IOException
    {
        Main.inventory.AddNewItem(nameField.getText(), formulaField.getText(), companyField.getText(), itemType.getText());

        // idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        // nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        // formulaColumn.setCellValueFactory(new PropertyValueFactory<>("formula"));
        // companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        // expColumn.setCellValueFactory(new PropertyValueFactory<>("expYear"));
        // mfgColumn.setCellValueFactory(new PropertyValueFactory<>("mfgYear"));
        
        // ObservableList<Item> data = FXCollections.observableArrayList(Main.inventory.getTempList());
                
        // table.setItems(data);
    }
    public void Minus(ActionEvent event) throws IOException
    {
        // What does Minus do:
    }
    public void Plus(ActionEvent event) throws IOException
    {
        // What does Plus do:
    }
    public void Confirm(ActionEvent event) throws IOException, SQLException
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
