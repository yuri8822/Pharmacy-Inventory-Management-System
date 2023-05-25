package Source;

public class Employee 
{
    private int ID;
    private String Fname;
    private String Lname;

    public void insert(int ID, String Fname, String Lname)
    {
        this.ID = ID;
        this.Fname = Fname;
        this.Lname = Lname;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "Employee ID: " + ID + "\n" +
            "First Name: " + Fname + "\n" +
            "Last Name: " + Lname + "\n\n"
        );
    }
    public String GetFirstName()
    {
        return Fname;
    }
    public String GetLastName()
    {
        return Lname;
    }
}
