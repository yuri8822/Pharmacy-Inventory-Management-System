package Source;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeList 
{
    private ArrayList<Employee> employees;
    private int id;

    public EmployeeList() throws SQLException
    {
        employees = new ArrayList<Employee>();
        Main.db.loadEmployees(this);
        id = employees.size();
    }
    public ArrayList<Employee> getList()
    {
        return employees;
    }
    public void AddEmployee(String fName, String lName) throws SQLException
    {
        id++;

        Employee newEmployee = new Employee();
        newEmployee.insert(id, fName, lName);
        employees.add(newEmployee);

        Main.db.AddEmployeeToDB(newEmployee);
        employees.clear();
        Main.db.loadEmployees(this);
        
        System.out.print("Employee added to Database\n");
    }
}
