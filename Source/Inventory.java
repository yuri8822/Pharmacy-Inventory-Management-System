package Source;

import java.sql.SQLException;
import java.util.ArrayList;

public class Inventory
{
    private ArrayList<Item> items;
    private ArrayList<Item> tempItems;
    
    public Inventory() throws SQLException
    {
        items = new ArrayList<Item>();
        Main.db.loadItems(this);
    }
    public ArrayList<Item> getList()
    {
        return items;
    }
    public void AddNewItem(String itemType)
    {
        switch (itemType)
        {
            case "Medicine":
                Item item = new Medicine();
                tempItems.add(item);
                break;
        }
        
    }
}