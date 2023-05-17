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