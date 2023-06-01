package Source;

import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EmployeeList 
{
    private ObservableList<Employee> employees;
    private int id;

    public EmployeeList() throws SQLException, ClassNotFoundException
    {
        employees = FXCollections.observableArrayList();
        Database.GetInstance().loadEmployees(this);
        id = employees.size();
    }
    public ObservableList<Employee> getList()
    {
        return employees;
    }
    public void AddEmployee(String fName, String lName) throws SQLException, ClassNotFoundException
    {
        id++;

        Employee newEmployee = new Employee();
        newEmployee.insert(id, fName, lName);
        employees.add(newEmployee);

        Database.GetInstance().AddEmployeeToDB(newEmployee);
        employees.clear();
        Database.GetInstance().loadEmployees(this);
        
        System.out.print("Employee added to Database\n");
    }
    public void UpdateEmployee(String fName, String lName) throws SQLException
    {
        
        
        System.out.print("Employee updated in Database\n");
    }
    public void RemoveEmployee(String fName, String lName) throws SQLException, ClassNotFoundException
    {
        Boolean found = false;
        int index = 0;

        for (int i = 0; i < employees.size(); i++)
        {
            if (employees.get(i).GetFirstName().equals(fName) && employees.get(i).GetLastName().equals(lName))
            {
                found = true;
                index = i;

                break;
            }
        }

        if (found)
        {
            Database.GetInstance().RemoveEmployeeFromDB(employees.get(index));
            id--;
            System.out.print("Employee removed from Database\n");
        }
        else
        {
            System.out.print("Employee Does Not Exist!\n");
        }

        employees.clear();
        Database.GetInstance().loadEmployees(this);
    }
}
