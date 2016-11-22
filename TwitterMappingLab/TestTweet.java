import java.io.IOException;
import twitter4j.*;

class TestTweet
{
    public static void main ( String[] args ) throws TwitterException, IOException
    {
        Twitter twitter = new TwitterFactory().getInstance();
        twitter.updateStatus( "I just tweeted from my Java program! #APCSRocks Thanks @gcschmit!" );
    }
}
