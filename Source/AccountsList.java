package Source;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccountsList 
{
    private ArrayList<Account> accounts;

    public AccountsList() throws SQLException, ClassNotFoundException
    {
        accounts = new ArrayList<Account>();
        Database.GetInstance().loadAccounts(this);
    }
    public ArrayList<Account> getList()
    {
        return accounts;
    }    
}