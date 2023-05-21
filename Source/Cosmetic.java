package Source;

import java.sql.Date;

public class Cosmetic implements Item
{
    private int id;
    private String name;
    private String formula;
    private String company;
    private Date expYear;
    private Date mfgYear;
    private int qty;

    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear, int qty) 
    {
        this.id = id;
        this.name = name;
        this.formula = formula;
        this.company = company;
        this.expYear = expYear;
        this.mfgYear = mfgYear;
        this.qty = qty;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "ID: " + id + "\n" +
            "Name: " + name + "\n" +
            "Formula: " + formula + "\n" +
            "Company: " + company + "\n" +
            "Exp Year: " + expYear + "\n" +
            "Mfg Year: " + mfgYear + "\n" +
            "Quantity: " + qty + "\n" +
            "Item Type: Cosmetic" + "\n\n"
        );
    }
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public String getFormula() 
    {
        return formula;
    }
    public String getCompany() 
    {
        return company;
    }
    public Date getExpYear() 
    {
        return expYear;
    }
    public Date getMfgYear() 
    {
        return mfgYear;
    }
    public String getItemType()
    {
        return "Cosmetic";
    }
    public int getQty()
    {
        return qty;
    }
}