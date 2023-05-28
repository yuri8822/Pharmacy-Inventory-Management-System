package Source;

public class Report 
{
    private int ID;
    private String content;

    public void insert(int ID, String content)
    {
        this.ID = ID;
        this.content = content;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "Report ID: " + ID + "\n" +
            "Content: " + content + "\n\n"
        );
    }
    public String GetContent()
    {
        return content;
    }
    public int GetID()
    {
        return ID;
    }
}
