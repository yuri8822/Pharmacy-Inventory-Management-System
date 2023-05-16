package Source;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager 
{
    private Parent root;
    private Scene scene;
    private Stage primaryStage;

    public void setup(Stage primaryStage) throws IOException
    {
        this.primaryStage = primaryStage;
        
        root = FXMLLoader.load(getClass().getResource("../Scenes/Login.fxml"));
        scene = new Scene(root);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void Login(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/Login.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void SignUp(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/SignUp.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        primaryStage.setTitle("Sign Up");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void P_Dashboard(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/P-Dashboard.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();   
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }
    public void M_Dashboard(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/M-Dashboard.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();     
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }
    public void M_GenerateRep(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/M-GenerateRep.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();     
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Generate Reports");
        primaryStage.show();
    }
    public void M_OrderStock(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/M-OrderStock.fxml"));        
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Order Stock");
        primaryStage.show();  
    }         
    public void M_ReviewFeedback(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/M-ReviewFeedback.fxml"));        
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Review Feedback");
        primaryStage.show();  
    }         
    public void M_ManageEmp(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/M-ManageEmp.fxml"));        
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Manage Employees");
        primaryStage.show();  
    }         
    public void S_Dashboard(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../Scenes/S-Dashboard.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();     
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard");
        primaryStage.show();
    }
}
