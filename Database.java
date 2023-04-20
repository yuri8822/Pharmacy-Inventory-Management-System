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
    public boolean hasUsername(String username) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "Simple2468");
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
    public boolean Register(String username, String password, String userType) throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "Simple2468");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO Accounts (username, password, accountType) VALUES ('" + username + "', '" + password + "', '" + userType + "')");
        
        statement.close();
        connection.close();
        
        return true;
    }
}
