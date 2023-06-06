package Source;

public class Review
{
    private int id;
    private String review;
    private int rating;
    private String reply;    

    public void insert(int id, String review, int rating, String reply) 
    {
        this.id = id;
        this.review = review;
        this.rating = rating;
        this.reply = reply;
    }
    public void DebugInfo()
    {
        System.out.print
        (
            "ID: " + id + "\n" +
            "Review: " + review + "\n" +
            "Rating: " + rating + "\n" +
            "Reply: " + reply + "\n\n"
        );
    }
    public int getId() 
    {
        return id;
    }
    public String getReview() 
    {
        return review;
    }
    public int getRating() 
    {
        return rating;
    }
    public String getReply() 
    {
        return reply;
    }
}