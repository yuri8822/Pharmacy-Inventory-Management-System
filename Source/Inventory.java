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
    private int id;
    
    public Inventory() throws SQLException
    {
        items = new ArrayList<Item>();
        tempItems = FXCollections.observableArrayList();
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
    public void AddNewItem(String name, String formula, String company, String itemType)
    {
        // generate id and dates:
        id++;
        Date expDate =  new Date(System.currentTimeMillis());
       
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(expDate);
        calendar.add(Calendar.YEAR, 3);
        Date mfgDate = new Date(calendar.getTime().getTime());

        System.out.print(expDate + " " + mfgDate);

        switch (itemType)
        {
            case "Medicine":
            {
                Item item = new Medicine();
                item.insert(id, name, formula, company, expDate, mfgDate);
                tempItems.add(item);
                break;
            }
            case "Cosmetic":
            {
                Item item = new Cosmetic();
                item.insert(id, name, formula, company, expDate, mfgDate);
                tempItems.add(item);
                break;
            }
            case "Eatable":
            {
                Item item = new Eatable();
                item.insert(id, name, formula, company, expDate, mfgDate);
                tempItems.add(item);
                break;
            }
        }
    }
    public void ConfirmAddItems() throws SQLException
    {
        Main.db.addItemstoDB(this);
        items.clear();
        Main.db.loadItems(this);
        tempItems.clear();
        
        id = items.size();
    }
}