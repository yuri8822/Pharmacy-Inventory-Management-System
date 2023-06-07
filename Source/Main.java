package Source;

import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
    static public AccountsList accountsList;
    static public EmployeeList employeeList;
    static public Inventory inventory;
    static public Vendor_Handler vendorHandler;
    static public ReportList reportList;
    static public ReviewList reviewList;
    static public SessionManager session;
    static public SceneManager sceneManager;

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        sceneManager.setup(primaryStage);
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
    {
        // These have been made static for convenience and mostly to ensure that all objects initiate before anything else
        accountsList = new AccountsList();
        employeeList = new EmployeeList();
        inventory = new Inventory();
        vendorHandler = new Vendor_Handler();
        reportList = new ReportList();
        reviewList = new ReviewList();
        session = new SessionManager();
        sceneManager = new SceneManager();

        launch(args);
    }
}
