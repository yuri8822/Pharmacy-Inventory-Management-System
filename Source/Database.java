package PharmacyInventoryManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database
{

    public Database() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    public void loadAccounts(AccountsList accountsList) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Accounts");

        int i = 0;
        while (resultSet.next())
        {
            if (resultSet.getString("accountType").equals("Pharmacist"))
            {
                Account newAccount = new Pharmacist();
                newAccount.insert(resultSet.getString("username"), resultSet.getString("password"));
                
                accountsList.getList().add(newAccount);
                accountsList.getList().get(i).DebugInfo();
            }
            else if (resultSet.getString("accountType").equals("Manager"))
            {
                Account newAccount = new Manager();
                newAccount.insert(resultSet.getString("username"), resultSet.getString("password"));
                
                accountsList.getList().add(newAccount);
                accountsList.getList().get(i).DebugInfo();
            }
            else if (resultSet.getString("accountType").equals("Salesman"))
            {
                Account newAccount = new Salesman();
                newAccount.insert(resultSet.getString("username"), resultSet.getString("password"));

                accountsList.getList().add(newAccount);
                accountsList.getList().get(i).DebugInfo();
            }
            i++;
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
    public void loadItems(Inventory inventory) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Inventory");
        
        // add the loading functionality here:
    }
    public boolean hasUsername(String username) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT username FROM Accounts WHERE username = '" + username + "'");
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
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT accountType FROM Accounts WHERE username = '" + username + "'");

        resultSet.next();
        String userType = resultSet.getString(1);

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
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO Accounts (username, password, accountType) VALUES ('" + username + "', '" + password + "', '" + userType + "')");
        
        statement.close();
        connection.close();
        
        return true;
    }
}
