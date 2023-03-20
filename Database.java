package PharmacyInventoryManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database 
{
    public void Start()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PIMS", "root", "Simple2468");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from medicine");

            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getInt(4));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    
}
