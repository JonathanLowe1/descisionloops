import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;


/**
 * Write a description of test class TweetTest here.
 * 
 * @JonathanLowe 
 * @12/5/2016
 */
public class TweetTest
{   
    //User info
    private String user = "jlowe";
    //word that has its sentiment calculated
    private String text = "coding";
    //Date the tweet was made
    private Date now = new Date();
    //What state the tweet was made from
    private twitter4j.GeoLocation location = new twitter4j.GeoLocation(41.881832, -87.623177);
    //testTweet of type Tweet
    private Tweet testTweet;
    /**
     * Default constructor for objects of class TweetTest
     */
    public TweetTest()
    {
        testTweet = new Tweet(user, text, now, location);
        System.out.println(testTweet.toString());
    }
    
    @Test
    public void testConstructor()
    {
        assertEquals(testTweet.getUser(), user);
        assertEquals(testTweet.getText(), text);
        assertEquals(testTweet.getLocation(), location);
        assertEquals(testTweet.getDate(), now);
    }
    
    @Test
    public void testCalculateSentiment() 
    {
        assertEquals(testTweet.getSentiment(), null);
    }
}
