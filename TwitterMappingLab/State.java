 import java.util.Date;
import java.io.IOException;
import twitter4j.*;
import java.lang.Math;
/**
 * Write a description of class State here.
 * 
 * @author @JonathanLowe 
 * @version November 16 2016
 */
public class State
{
    private String abbreviation;
    private twitter4j.GeoLocation center;
    private double area;
    private double sentiment;
    public State(String abbreviation, GeoLocation center, double area)
    {
        this.abbreviation = abbreviation;
        this.center = center;
        this.area = area;
        this.sentiment = sentiment;
    }
    public String getAbbreviation()
    {
       return abbreviation;
    }
    public twitter4j.GeoLocation getCenter()
    {
        return center;
    }
    public double getArea()
    {
        return area;
    }
    public double getSentiment()
    {
        return sentiment;
    }
    public void setSentiment(double sentiment)
    {
        this.sentiment = sentiment;
   
    }
    public double getRadius()
    {
        double radius = Math.sqrt( area / Math.PI );
        return radius;
    }
    public String toString()
    {
        return "The abbreviation is " + abbreviation + " ,the center is " + center + " ,the area is " + area + " ,the sentiment is " + sentiment;
    }
    //comment
}
