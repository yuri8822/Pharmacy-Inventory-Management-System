package Source;

import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
    static public Database db;
    static public AccountsList accountsList;
    static public EmployeeList employeeList;
    static public Inventory inventory;
    static public ReportList reportList;
    static public SessionManager session;
    static public SceneManager sceneManager;

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        sceneManager.setup(primaryStage);
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        // Remember to convert these into Singleton Pattern!
        db = new Database();
        accountsList = new AccountsList();
        employeeList = new EmployeeList();
        inventory = new Inventory();
        reportList = new ReportList();
        session = new SessionManager();
        sceneManager = new SceneManager();

        launch(args);
    }
}
