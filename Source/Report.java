package Source;

public class Report 
{
    private int id;
    private String content;

    public void insert(int id, String content)
    {
        this.id = id;
        this.content = content;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "Report ID: " + id + "\n" +
            "Content: " + content + "\n\n"
        );
    }
    public String getContent()
    {
        return content;
    }
    public int getId()
    {
        return id;
    }
}
