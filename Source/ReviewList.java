package Source;

import java.io.IOException;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReviewList 
{
    private ObservableList<Review> reviews;
    private int id;

    public ReviewList() throws IOException, ClassNotFoundException, SQLException
    {
        reviews = FXCollections.observableArrayList();
        Database.GetInstance().loadReviews(this);
        id = reviews.size();
    }
    public ObservableList<Review> getList()
    {
        return reviews;
    }
    public void AddReview(String review, int rating) throws SQLException, ClassNotFoundException
    {
        // perhaps add some conditions that prevent empty strings and less than a certain number of characters:
        if (review.equals("") || review.equals(" "))
        {
            System.out.println("Please add some content in the Review\n");
            return;
        }
        if (rating > 5 || rating < 0)
        {
            System.out.println("Please provide a valid Rating");
            return;
        }

        id++;

        Review newReview = new Review();
        newReview.insert(id, review, rating, "");
        reviews.add(newReview);

        Database.GetInstance().AddReviewToDB(newReview);
        reviews.clear();
        Database.GetInstance().loadReviews(this);
        
        System.out.print("Review Published\n");
    }   
}