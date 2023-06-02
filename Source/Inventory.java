package Source;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory
{
    private ObservableList<Item> items;
    private ObservableList<Item> tempItems;
    private ObservableList<Item> lowItems;
    private int id;
    
    public Inventory() throws SQLException, ClassNotFoundException
    {
        items = FXCollections.observableArrayList();
        tempItems = FXCollections.observableArrayList();
        lowItems = FXCollections.observableArrayList();
        Database.GetInstance().loadItems(this);
        id = items.size();
    }
    public ObservableList<Item> getList()
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
        Date mfgDate =  new Date(System.currentTimeMillis());
       
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(mfgDate);
        calendar.add(Calendar.YEAR, 3);
        Date expDate = new Date(calendar.getTime().getTime());

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
    public void ConfirmAddItems() throws SQLException, ClassNotFoundException
    {
        Database.GetInstance().addItemstoDB(this.tempItems);
        items.clear();
        Database.GetInstance().loadItems(this);
        tempItems.clear();
        
        id = items.size();
        System.out.print("All Items added to Database\n");        
    }
    public ObservableList<Item> GetLowItems()
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
    public void RestockLowItems() throws SQLException, ClassNotFoundException
    {
        // these items should first be deleted from the database and THEN added so remember that!
        Database.GetInstance().updateItemsInDB(this.lowItems);
        items.clear();
        Database.GetInstance().loadItems(this);
        lowItems.clear();

        id = items.size();
        System.out.print("All Items Restocked\n");
    }
}