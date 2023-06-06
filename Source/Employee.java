package Source;

public class Employee 
{
    private int id;
    private String firstName;
    private String lastName;

    public void insert(int id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "Employee ID: " + id + "\n" +
            "First Name: " + firstName + "\n" +
            "Last Name: " + lastName + "\n\n"
        );
    }
    public String GetFirstName()
    {
        return firstName;
    }
    public String GetLastName()
    {
        return lastName;
    }
}
