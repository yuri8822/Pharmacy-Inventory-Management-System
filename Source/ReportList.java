package Source;

import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReportList 
{
    private ObservableList<Report> reports;
    private int id;

    public ReportList() throws SQLException, ClassNotFoundException
    {
        reports = FXCollections.observableArrayList();
        Database.GetInstance().loadReports(this);
        id = reports.size();
    }
    public ObservableList<Report> getList()
    {
        return reports;
    }
    public void AddReport(String content) throws SQLException, ClassNotFoundException
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

        Database.GetInstance().AddReportToDB(newReport);
        reports.clear();
        Database.GetInstance().loadReports(this);
        
        System.out.print("Report added to Database\n");
    }
    public void UpdateReport(String fName, String lName) throws SQLException
    {
        
        
        System.out.print("Report updated in Database\n");
    }
    public void RemoveReport(int ID) throws SQLException, ClassNotFoundException
    {
        Boolean found = false;
        int index = 0;

        for (int i = 0; i < reports.size(); i++)
        {
            if (reports.get(i).getId() == ID)
            {
                found = true;
                index = i;

                break;
            }
        }

        if (found)
        {
            Database.GetInstance().RemoveReportFromDB(reports.get(index));
            id--;
            System.out.print("Report removed from Database\n");
        }
        else
        {
            System.out.print("Report Does Not Exist!\n");
        }

        reports.clear();
        Database.GetInstance().loadReports(this);
    }
}
