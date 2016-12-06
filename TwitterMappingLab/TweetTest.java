import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;


/**
 * Write a description of test class TweetTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * 
 * https://www.tutorialspoint.com/junit/junit_basic_usage.htm
 */
public class TweetTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;    
    private String user = "jlowe";
    private String text = "coding";
    private Date now = new Date();
    private twitter4j.GeoLocation location = new twitter4j.GeoLocation(41.881832, -87.623177);
    private Tweet testTweet;


    /**
     * Default constructor for objects of class TweetTest
     */
    public TweetTest()
    {
        // initialise instance variables
        System.out.println("Top of TweetTest...");
        x = 0;
        
//        Date now = new Date();
        // chicago:
//        twitter4j.GeoLocation loc = new twitter4j.GeoLocation(41.881832, -87.623177);
        testTweet = new Tweet(user, text, now, location);
        System.out.println(testTweet.toString());
        
    }
    
    /** 
     * 
     */
    @Test
    public void testConstructor()
    {
        System.out.println("In testConstructor()...");
        assertEquals(testTweet.getUser(), user);
        assertEquals(testTweet.getText(), text);
        assertEquals(testTweet.getLocation(), location);
        assertEquals(testTweet.getDate(), now);
    }
    
    /**
     * 
     */
    @Test
    public void testCalculateSentiment() 
    {
        System.out.println("In testCalculateSentiment()...");
        assertEquals(testTweet.getSentiment(), new Double(0.0));
    }
}
