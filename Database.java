package PharmacyInventoryManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database 
{

    public void Database() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");        
    }
    public ResultSet getUsernames() throws SQLException
    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "Simple2468");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select username from Accounts");
        return resultSet;
    }
}
