package Source;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.ObservableList;

public class Database
{
    private static Database db;
    
    private String _CONNECTION;
    private String _USER;
    private String _PASSWORD;

    private Database() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        // CHANGE CONNECTION STRING HERE!
        _CONNECTION = "jdbc:mysql://localhost:3306/PIMS";
        _USER = "root";
        _PASSWORD = "1234";
    }
    public static Database GetInstance() throws ClassNotFoundException, SQLException
    {
        if (db == null)
        {
            db = new Database();
        }
        return db;
    }
    public void loadAccounts(AccountsList accountsList) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Accounts");

        String username, password;

        for (int i = 0; resultSet.next(); i++)
        {
            username = resultSet.getString("username");
            password = resultSet.getString("password");

            switch (resultSet.getString("accountType"))
            {
                case "Pharmacist":
                {
                    Account newAccount = new Pharmacist();
                    newAccount.insert(username, password);
                    
                    accountsList.getList().add(newAccount);
                    accountsList.getList().get(i).DebugInfo();
                    break;
                }
                case "Manager":
                {
                    Account newAccount = new Manager();
                    newAccount.insert(username, password);
                    
                    accountsList.getList().add(newAccount);
                    accountsList.getList().get(i).DebugInfo();
                    break;
                }
                case "Salesman":
                {
                    Account newAccount = new Salesman();
                    newAccount.insert(username, password);
                    
                    accountsList.getList().add(newAccount);
                    accountsList.getList().get(i).DebugInfo();
                    break;
                }
            }
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
    public void loadEmployees(EmployeeList employeeList) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Employees");

        int ID;
        String First_Name, Last_Name;

        for (int i = 0; resultSet.next(); i++)
        {
            ID = resultSet.getInt("Emp_ID");
            First_Name = resultSet.getString("First_Name");
            Last_Name = resultSet.getString("Last_Name");

            Employee newEmployee = new Employee();
            newEmployee.insert(ID, First_Name, Last_Name);
                    
            employeeList.getList().add(newEmployee);
            employeeList.getList().get(i).DebugInfo();
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
    public void loadItems(Inventory inventory) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Inventory");

        int id, qty;
        String name, formula, company, type;
        Date expYear, mfgYear;
        
        for (int i = 0; resultSet.next(); i++)
        {
            id = resultSet.getInt("Item_ID");
            name = resultSet.getString("Name");
            formula = resultSet.getString("Formula");
            company = resultSet.getString("Company");
            expYear = resultSet.getDate("ExpDate");
            mfgYear = resultSet.getDate("MfgDate");
            type = resultSet.getString("Item_Type");
            qty = resultSet.getInt("Qty");

            Item newItem = new Item();
            newItem.insert(id, name, formula, company, expYear, mfgYear, type, qty);
            
            inventory.getList().add(newItem);
            inventory.getList().get(i).DebugInfo();
        }
        
        resultSet.close();
        statement.close();
        connection.close();
    }
    public void loadReports(ReportList reportList) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Reports");

        int ID;
        String content;

        for (int i = 0; resultSet.next(); i++)
        {
            ID = resultSet.getInt("Rep_ID");
            content = resultSet.getString("Content");
            

            Report newReport = new Report();
            newReport.insert(ID, content);
                    
            reportList.getList().add(newReport);
            reportList.getList().get(i).DebugInfo();
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
    public void loadReviews(ReviewList reviewList) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Reviews");

        int id;
        String review;
        int rating;
        String reply;

        for (int i = 0; resultSet.next(); i++)
        {
            id = resultSet.getInt("Rev_ID");
            review = resultSet.getString("Review");
            rating = resultSet.getInt("Rating");
            reply = resultSet.getString("Reply");
            

            Review newReview = new Review();
            newReview.insert(id, review, rating, reply);
                    
            reviewList.getList().add(newReview);
            reviewList.getList().get(i).DebugInfo();
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
    public void addItemstoDB(ObservableList<Item> Items) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();

        String name;
        String formula;
        String company;
        Date expYear;
        Date mfgYear;
        String itemType;
        int qty;
        
        for (int i = 0; i < Items.size(); i++)
        {
            name = Items.get(i).getName();
            formula = Items.get(i).getFormula();
            company = Items.get(i).getCompany();
            expYear = Items.get(i).getExpYear();
            mfgYear = Items.get(i).getMfgYear();
            itemType = Items.get(i).getType();
            qty = Items.get(i).getQty();

            statement.executeUpdate
            (
                "INSERT INTO Inventory VALUES (DEFAULT, '" + name + "', '" + formula + "', '" + company + "', '" + expYear + "', '" + mfgYear + "', '" + qty + "', '" + itemType + "')"
            );
        }

        statement.close();
        connection.close();
    }
    public void updateItemsInDB(ObservableList<Item> Items) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();

        int id;
        int qty;

        for (int i = 0; i < Items.size(); i++)
        {
            id = Items.get(i).getId();
            qty = Items.get(i).getQty() + 10;

            statement.executeUpdate
            (
                "UPDATE Inventory SET Qty = " + qty + " WHERE Item_ID = " + id
            );
        }

        statement.close();
        connection.close();
    }
    public void RemoveItemsFromDB(ObservableList<Item> Items) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();

        int id;

        for (int i = 0; i < Items.size(); i++)
        {
            id = Items.get(i).getId();

            statement.executeUpdate
            (
                "DELETE FROM Inventory WHERE Item_ID = " + id
            );
        }

        statement.close();
        connection.close();
    }
    public void AddEmployeeToDB(Employee newEmployee) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();

        String fName = newEmployee.GetFirstName();
        String lName = newEmployee.GetLastName();

        statement.executeUpdate
        (
            "INSERT INTO Employees VALUES (DEFAULT, '" + fName + "', '" + lName + "')"
        );

        statement.close();
        connection.close();
    }
    public void RemoveEmployeeFromDB(Employee newEmployee) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();

        String fName = newEmployee.GetFirstName();
        String lName = newEmployee.GetLastName();

        statement.executeUpdate
        (
            "DELETE FROM Employees WHERE First_Name = '" + fName + "' AND Last_Name = '" + lName + "' LIMIT 1"
        );

        statement.close();
        connection.close();
    }
    public void AddReportToDB(Report newReport) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();

        String content = newReport.getContent();

        statement.executeUpdate
        (
            "INSERT INTO Reports VALUES (DEFAULT, '" + content + "')"
        );

        statement.close();
        connection.close();
    }
    public void RemoveReportFromDB(Report newReport) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        
        int id = newReport.getId();

        statement.executeUpdate
        (
            "DELETE FROM Reports WHERE Rep_ID = '" + id + "' LIMIT 1"
        );

        statement.close();
        connection.close();
    }
    public void AddReviewToDB(Review newReview) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();

        String review = newReview.getReview();
        int rating = newReview.getRating();
        String reply = newReview.getReply();

        statement.executeUpdate
        (
            "INSERT INTO Reviews VALUES (DEFAULT, '" + review + "', " + rating + ", '" + reply + "')"
        );

        statement.close();
        connection.close();
    }
    public boolean hasAccount(String username, String password) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT username FROM Accounts WHERE username = '" + username + "' AND password = '" + password + "'");

        if (resultSet.next())
        {
            resultSet.close();
            statement.close();
            connection.close();
            
            return true;
        }
        else
        {
            resultSet.close();
            statement.close();
            connection.close();
            
            return false;
        }
    }
    public String getUserType(String username) throws SQLException
    {
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT accountType FROM Accounts WHERE username = '" + username + "'");

        resultSet.next();
        String userType = resultSet.getString("accountType");

        resultSet.close();
        statement.close();
        connection.close();

        return userType;
    }
    public boolean Register(String username, String password, String userType) throws SQLException
    {
        if (userType.equals("Account Type"))
        {
            System.out.println("Choose an Account Type");
            return false;
        }
        
        Connection connection = DriverManager.getConnection(_CONNECTION, _USER, _PASSWORD);
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO Accounts (username, password, accountType) VALUES ('" + username + "', '" + password + "', '" + userType + "')");
        
        statement.close();
        connection.close();
        
        return true;
    }
}
