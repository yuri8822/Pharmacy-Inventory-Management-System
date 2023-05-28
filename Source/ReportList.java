package Source;

import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReportList 
{
    private ObservableList<Report> reports;
    private int id;

    public ReportList() throws SQLException
    {
        reports = FXCollections.observableArrayList();
        Main.db.loadReports(this);
        id = reports.size();
    }
    public ObservableList<Report> getList()
    {
        return reports;
    }
    public void AddReport(String content) throws SQLException
    {
        // perhaps add some conditions that prevent empty strings and less than a certain number of characters:
        if (content.equals("") || content.equals(" "))
        {
            System.out.println("Please add some content in the report\n");
            return;
        }

        id++;

        Report newReport = new Report();
        newReport.insert(id, content);
        reports.add(newReport);

        Main.db.AddReportToDB(newReport);
        reports.clear();
        Main.db.loadReports(this);
        
        System.out.print("Report added to Database\n");
    }
    public void UpdateReport(String fName, String lName) throws SQLException
    {
        
        
        System.out.print("Report updated in Database\n");
    }
    public void RemoveReport(int ID) throws SQLException
    {
        Boolean found = false;
        int index = 0;

        for (int i = 0; i < reports.size(); i++)
        {
            if (reports.get(i).GetID() == ID)
            {
                found = true;
                index = i;

                break;
            }
        }

        if (found)
        {
            Main.db.RemoveReportFromDB(reports.get(index));
            id--;
            System.out.print("Report removed from Database\n");
        }
        else
        {
            System.out.print("Report Does Not Exist!\n");
        }

        reports.clear();
        Main.db.loadReports(this);
    }
}
