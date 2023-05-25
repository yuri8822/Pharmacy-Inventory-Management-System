package Source;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeList 
{
    private ArrayList<Employee> employees;

    public EmployeeList() throws SQLException
    {
        employees = new ArrayList<Employee>();
        Main.db.loadEmployees(this);
    }
    public ArrayList<Employee> getList()
    {
        return employees;
    }        
}
