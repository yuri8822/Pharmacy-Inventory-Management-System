package PharmacyInventoryManagementSystem;

import java.sql.SQLException;
import java.util.ArrayList;

public class Inventory
{
    private ArrayList<Item> items;
    
    public Inventory() throws SQLException
    {
        items = new ArrayList<Item>();
        Main.db.loadItems(this);
    }
    public ArrayList<Item> getList()
    {
        return items;
    }
}