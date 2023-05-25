package Source;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory
{
    private ArrayList<Item> items;
    private ObservableList<Item> tempItems;
    private ObservableList<Item> lowItems;
    private int id;
    
    public Inventory() throws SQLException
    {
        items = new ArrayList<Item>();
        tempItems = FXCollections.observableArrayList();
        lowItems = FXCollections.observableArrayList();
        Main.db.loadItems(this);
        id = items.size();
    }
    public ArrayList<Item> getList()
    {
        return items;
    }
    public ObservableList<Item> getTempList()
    {
        return tempItems;
    }
    public void AddNewItem(String name, String formula, String company, String itemType, int qty)
    {
        // generate id and dates:
        id++;
        Date expDate =  new Date(System.currentTimeMillis());
       
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(expDate);
        calendar.add(Calendar.YEAR, 3);
        Date mfgDate = new Date(calendar.getTime().getTime());

        switch (itemType)
        {
            case "Medicine":
            {
                Item item = new Medicine();
                item.insert(id, name, formula, company, expDate, mfgDate, qty);
                tempItems.add(item);
                break;
            }
            case "Cosmetic":
            {
                Item item = new Cosmetic();
                item.insert(id, name, formula, company, expDate, mfgDate, qty);
                tempItems.add(item);
                break;
            }
            case "Eatable":
            {
                Item item = new Eatable();
                item.insert(id, name, formula, company, expDate, mfgDate, qty);
                tempItems.add(item);
                break;
            }
        }
        System.out.print("Item Added to temporary List\n");
    }
    public void ConfirmAddItems() throws SQLException
    {
        Main.db.addItemstoDB(this.tempItems);
        items.clear();
        Main.db.loadItems(this);
        tempItems.clear();
        
        id = items.size();
        System.out.print("All Items added to Database\n");        
    }
    public ObservableList<Item> ScanLowItems()
    {
        for (int i = 0; i < items.size(); i++)
        {
            if (items.get(i).getQty() < 3)
            {
                lowItems.add(items.get(i));
            }
        }
        return lowItems;
    }
    public void RestockLowItems() throws SQLException
    {
        // these items should first be deleted from the database and THEN added so remember that!
        Main.db.updateItemsInDB(this.lowItems);
        items.clear();
        Main.db.loadItems(this);
        lowItems.clear();

        id = items.size();
        System.out.print("All Items Restocked\n");
    }
}