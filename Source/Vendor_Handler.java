package Source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

// This is a dummy class for the Vendor Order System:
// This class will manage all of the possible items that can be ordered
// along with each item's details.

public class Vendor_Handler 
{
    private File vendorItems;
    private FileReader reader;
    private BufferedReader lineReader;
    private ArrayList<VendorItem> items;

    public Vendor_Handler() throws IOException
    {
        vendorItems = new File("./Source/Vendor_Items.csv");
        reader =  new FileReader(vendorItems);
        lineReader = new BufferedReader(reader);
        items = new ArrayList<VendorItem>();
        loadVendorItems();
    }
    public void loadVendorItems() throws IOException
    {
        String line = null;

        while ((line = lineReader.readLine()) != null)
        {
            String[] array = line.split(",");

            VendorItem newItem = new VendorItem();
            newItem.name = array[0];
            newItem.expYear = Date.valueOf(array[1]);
            newItem.mfgYear = Date.valueOf(array[2]);
            newItem.price = Double.parseDouble(array[3]);
            newItem.company = array[4];
            newItem.type = array[5];

            items.add(newItem);
        }
        
    }
    public VendorItem Check(String name, String company) throws IOException
    {
        for (int i = 0; i < items.size(); i++)
        {
            if (items.get(i).name.equals(name) && items.get(i).company.equals(company))
            {
                return items.get(i);
            }
        }

        return null;
    }
}

class VendorItem
{
    public String name;
    public Date expYear;
    public Date mfgYear;
    public double price;
    public String company;
    public String type;

}