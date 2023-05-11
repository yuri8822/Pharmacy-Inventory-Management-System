package Source;

public class SessionManager
{
    private String SignedIn;

    public SessionManager()
    {
        SignedIn = "";
    }

    public void SetSignedIn(String user)
    {
        SignedIn = user;
    }
    
    public String GetSignedIn()
    {
        return SignedIn;
    }
}
