package Scenes;

import java.io.IOException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class M_ReviewFeedback 
{
    @FXML
    TableView<Review> table;
    @FXML
    TableColumn<Review, Number> idColumn;
    @FXML
    TableColumn<Review, String> reviewColumn;
    @FXML
    TableColumn<Review, Number> ratingColumn;

    public void initialize()
    {
        //Set the cell value factories for each column
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        reviewColumn.setCellValueFactory(new PropertyValueFactory<>("review"));
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));

        //Set the items of the TableView to the ObservableList
        table.setItems(Main.reviewList.getList());
    }
    public void SendAutomatedReply(ActionEvent event)
    {

    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.M_Dashboard(event);
    }
}