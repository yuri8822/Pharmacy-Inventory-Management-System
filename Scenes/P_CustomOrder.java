package Scenes;

import java.io.IOException;
import java.sql.SQLException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class P_CustomOrder 
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
    
    public void initialize()
    {
        quantityField.setText("3");
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
    public void Order(ActionEvent event) throws IOException, SQLException, ClassNotFoundException
    {
        if (itemType.getText().equals("Item Type"))
        {
            System.out.print("Please choose an Item Type");
            return;
        }

        // for now just add whatever is entered without checking with the Vendor Order System:
        int Q = Integer.parseInt(quantityField.getText());
        Main.inventory.AddNewItem(nameField.getText(), formulaField.getText(), companyField.getText(), itemType.getText(), Q);
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
        Main.sceneManager.P_Dashboard(event);
    }
}
