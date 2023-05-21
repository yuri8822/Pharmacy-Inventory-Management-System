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

    public Database() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    public void loadAccounts(AccountsList accountsList) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
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
    public void loadItems(Inventory inventory) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Inventory");

        int id, qty;
        String name, formula, company;
        Date expYear, mfgYear;
        
        for (int i = 0; resultSet.next(); i++)
        {
            id = resultSet.getInt("Item_ID");
            name = resultSet.getString("Name");
            formula = resultSet.getString("Formula");
            company = resultSet.getString("Company");
            expYear = resultSet.getDate("ExpDate");
            mfgYear = resultSet.getDate("MfgDate");
            qty = resultSet.getInt("Qty");

            switch (resultSet.getString("Item_Type"))
            {
                case "Medicine":
                {
                    Item newItem = new Medicine();
                    newItem.insert(id, name, formula, company, expYear, mfgYear, qty);
                    
                    inventory.getList().add(newItem);
                    inventory.getList().get(i).DebugInfo();
                    break;
                }
                case "Cosmetic":
                {
                    Item newItem = new Cosmetic();
                    newItem.insert(id, name, formula, company, expYear, mfgYear, qty);
                    
                    inventory.getList().add(newItem);
                    inventory.getList().get(i).DebugInfo();
                    break;
                }
                case "Eatable":
                {
                    Item newItem = new Eatable();
                    newItem.insert(id, name, formula, company, expYear, mfgYear, qty);

                    inventory.getList().add(newItem);
                    inventory.getList().get(i).DebugInfo();
                    break;
                }
            }
        }
        
        resultSet.close();
        statement.close();
        connection.close();
    }
    public void addItemstoDB(ObservableList<Item> Items) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();

        int id;
        String name;
        String formula;
        String company;
        Date expYear;
        Date mfgYear;
        String itemType;
        int qty;
        
        for (int i = 0; i < Items.size(); i++)
        {
            id = Items.get(i).getId();
            name = Items.get(i).getName();
            formula = Items.get(i).getFormula();
            company = Items.get(i).getCompany();
            expYear = Items.get(i).getExpYear();
            mfgYear = Items.get(i).getMfgYear();
            itemType = Items.get(i).getItemType();
            qty = Items.get(i).getQty();

            statement.executeUpdate
            (
                "INSERT INTO Inventory VALUES ('" + id + "', '" + name + "', '" + formula + "', '" + company + "', '" + expYear + "', '" + mfgYear + "', '" + qty + "', '" + itemType + "')"
            );
        }

        statement.close();
        connection.close();
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
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "1234");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO Accounts (username, password, accountType) VALUES ('" + username + "', '" + password + "', '" + userType + "')");
        
        statement.close();
        connection.close();
        
        return true;
    }
}
