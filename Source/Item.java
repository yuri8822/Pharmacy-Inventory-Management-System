package Source;

import java.sql.Date;

public interface Item
{
    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear);
    public void DebugInfo();
    public int getId();
    public String getName();
    public String getFormula();
    public String getCompany();
    public Date getExpYear();
    public Date getMfgYear();
    public String getItemType(); 
}

class Medicine implements Item
{
    private int id;
    private String name;
    private String formula;
    private String company;
    private Date expYear;
    private Date mfgYear;

    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear)
    {
        this.id = id;
        this.name = name;
        this.formula = formula;
        this.company = company;
        this.expYear = expYear;
        this.mfgYear = mfgYear;
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
            "Item Type: Medicine" + "\n\n"
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
        return "Medicine";
    }
}

class Cosmetic implements Item
{
    private int id;
    private String name;
    private String formula;
    private String company;
    private Date expYear;
    private Date mfgYear;

    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear) 
    {
        this.id = id;
        this.name = name;
        this.formula = formula;
        this.company = company;
        this.expYear = expYear;
        this.mfgYear = mfgYear;
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
}

class Eatable implements Item
{
    private int id;
    private String name;
    private String formula;
    private String company;
    private Date expYear;
    private Date mfgYear;

    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear) 
    {
        this.id = id;
        this.name = name;
        this.formula = formula;
        this.company = company;
        this.expYear = expYear;
        this.mfgYear = mfgYear;
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
            "Item Type: Eatable" + "\n\n"
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
        return "Eatable";
    }
}
