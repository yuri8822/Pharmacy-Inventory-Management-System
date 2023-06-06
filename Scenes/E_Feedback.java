package Scenes;

import java.io.IOException;
import java.sql.SQLException;

import Source.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class E_Feedback 
{
    @FXML
    TextArea reviewArea;
    @FXML
    TextField ratingField;

    public void Publish(ActionEvent event) throws ClassNotFoundException, SQLException
    {
        String review = reviewArea.getText();
        if (ratingField.getText().equals(""))
        {
            System.out.println("Please provide a valid Rating");
            return;
        }
        int rating = Integer.parseInt(ratingField.getText());

        Main.reviewList.AddReview(review, rating);

        reviewArea.clear();
        ratingField.clear();
    }
    public void Back(ActionEvent event) throws IOException
    {
        Main.sceneManager.Login(event);
    }
}
