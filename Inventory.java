package PharmacyInventoryManagementSystem;

import java.sql.SQLException;
import java.util.ArrayList;

public class Inventory 
{    
    private ArrayList<Unit> units;
    
    public Inventory() throws SQLException
    {
        units = new ArrayList<Unit>();
        Main.db.loadUnits(this);
    }
    public ArrayList<Unit> getList()
    {
        return units;
    }
}