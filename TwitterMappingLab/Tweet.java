import java.util.Date;
import java.io.IOException;
import twitter4j.*;
import java.util.Scanner;
/**
 * Write a description of class Tweet here.
 * 
 * @author @JonathanLowe
 * @version November 7 2016
 */
public class Tweet
{
    /** description of instance variable x (add comment for each instance variable) */
    private String user;
    private String text;
    private twitter4j.GeoLocation location;
    private Date date;
    private Double sentiment;
    /**
     * Default constructor for objects of class Tweet
     */
    public Tweet(String user, String text, Date date)
    {
        this.user = user;
        this.text = text;
        this.location = location;
        this.date = date;
        this.calculateSentiment();
    }
    //Acessor for user
    public String getUser()
    {
        return user;
    }
     //Acessor for text
    public String getText()
    {
        return text;
    }
     //Acessor for location
    public twitter4j.GeoLocation getLocation()
    {
        return location;
    }
     //Acessor for date
    public Date getDate()
    {
        return date;
    }
     //Acessor for sentiment    
    public Double getSentiment()
    {
        return sentiment;
    }
    public void calculateSentiment()
    {
        SentimentDictionary dict = SentimentDictionary.getSingleton();
        Scanner s = new Scanner(text);
        double totalWords = 0;
        double totalSentiment = 0;
        while(s.hasNext())
        {
            totalSentiment += dict.getSentiment(s.next());
            totalWords++;
        }
        sentiment = totalSentiment/totalWords;
    }
    public String toString()
    {
        String str = "The user is " + user + " The text is " + text + " The location is " + location + " The date is " + date + " The sentiment is " + sentiment;
        return str;
    }
}
