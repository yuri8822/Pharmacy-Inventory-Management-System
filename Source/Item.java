package Source;

import java.sql.Date;

public interface Item
{
    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear);
    public void DebugInfo();
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
}

class Cosmetic implements Item
{
    private int id;
    private String name;
    private String company;
    private Date expYear;
    private Date mfgYear;

    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear) 
    {
        this.id = id; 
        this.name = name;
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
            "Company: " + company + "\n" +
            "Exp Year: " + expYear + "\n" +
            "Mfg Year: " + mfgYear + "\n" +
            "Item Type: Cosmetic" + "\n\n"
        );
    }
}

class Eatable implements Item
{
    private int id;
    private String name;
    private String company;
    private Date expYear;
    private Date mfgYear;

    public void insert(int id, String name, String formula, String company, Date expYear, Date mfgYear) 
    {
        this.id = id;
        this.name = name;
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
            "Company: " + company + "\n" +
            "Exp Year: " + expYear + "\n" +
            "Mfg Year: " + mfgYear + "\n" +
            "Item Type: Eatable" + "\n\n"
        );
    }
}
