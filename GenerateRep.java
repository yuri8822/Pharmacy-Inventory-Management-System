package PharmacyInventoryManagementSystem;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GenerateRep 
{
    Stage stage;
    Scene scene;
    Parent root;

    public void onButtonClick() throws IOException
    {
        System.out.println("Hey fam");
    }
    public void showReviewFeedback(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("ReviewFeedback.fxml"));        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Review Feedback");
        stage.setScene(scene);
        stage.show();
    }      
}
