package Source;

public interface Account
{
    public void insert(String Name, String Password);
    public void DebugInfo();
}

class Pharmacist implements Account
{
    private String Name;
    private String Password;

    public void insert(String Name, String Password)
    {
        this.Name = Name;
        this.Password = Password;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "Name: " + Name + "\n" +
            "Password: " + Password + "\n" +
            "Account Type: Pharmacist" + "\n\n"
        );
    }
}
class Manager implements Account
{
    private String Name;
    private String Password;

    public void insert(String Name, String Password)
    {
        this.Name = Name;
        this.Password = Password;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "Name: " + Name + "\n" +
            "Password: " + Password + "\n" +
            "Account Type: Manager" + "\n\n"
        );
    }
}
class Salesman implements Account
{
    private String Name;
    private String Password;

    public void insert(String Name, String Password)
    {
        this.Name = Name;
        this.Password = Password;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "Name: " + Name + "\n" +
            "Password: " + Password + "\n" +
            "Account Type: Salesman" + "\n\n"
        );
    }
}