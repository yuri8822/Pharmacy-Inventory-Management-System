package PharmacyInventoryManagementSystem;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccountsList 
{
    private ArrayList<Account> accounts;

    public AccountsList() throws SQLException
    {
        accounts = new ArrayList<Account>();
        Main.db.loadAccounts(this);
    }
    public ArrayList<Account> getList()
    {
        return accounts;
    }
    
}