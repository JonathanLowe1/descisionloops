import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StateTest.
 *
 * @JonathanLowe
 * @12/5/2015
 */
public class StateTest
{
    private String abbreviation = "IL";
    private twitter4j.GeoLocation center = new twitter4j.GeoLocation(40.633132, 89.398574);
    private double area = 50;
    private double sentiment;
    private State testState;
    public StateTest()
    {
        testState = new State(abbreviation, center, area);
        System.out.println(testState.toString());
    }
    
    @Test
    public void testConstructor()
    {
        assertEquals(testState.getAbbreviation(), abbreviation);
        assertEquals(testState.getCenter(), center);
        assertEquals(testState.getArea(), area, 1e-15);
    }
    
    @Test
    public void testSetSentiment()
    {
        testState.setSentiment(2.0);
        assertEquals(testState.getSentiment(), 2.0, 0);
    }
    
    @Test
    public void testGetRadius()
    {
        assertEquals(testState.getRadius(), 3.989422804014327, 1e-15);
    }
}
