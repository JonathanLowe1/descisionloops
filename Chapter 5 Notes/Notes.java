import java.util.Scanner;
public static boolean floatsAreEqual( double num 1, double num 2 )
{
    /*
     * If we use the equality operator ( == ) for doubles, it
     *      will only return true if all binary digits match.
     * This probably is not the case and not what we want.
     * We will check if they are "close enough" (i.e epsilion value)
     */
    final double EPSILON = 1e-14;
    
    if( Math.abs( num1 - num2 ) < EPSILON )
    {
        return true
    }
    else
    {
        return false
    }
    
    //we dont have to use an if statement
    //return ( Math.abs( num1 - num2) < EPSILON );
}
 
public static void stringExamples()
{
    Scanner s = new Scanner( System.in );
    System.out.print( " enter two strings ");
    Strint str1 = s.next();
    String str2 = s.next();
    
    /*
     * The equality operator (==) returns true if the two variables
     * (e.g str1 and str2) contain the same value. For objects, That is,
     * They refer to the same object in memory. Not that two strings have the
     * same sequence of code.
     * 
     */
    if( str1 == str2 )
    {
        System.out.println(" Strings references are equal" )
    }
    else
    {
        System.out.println(" Strings references are not equal" )
    }
    
    /*
     * The equals method returns true if two objects are equal.
     * what equals mean is defined by that class. For strings, it
     * means the two objects have the same sequence of characters.
     */
    if( str1.equals( str2 ))
    {
        System.out.println(" Strings are equal" )
    }
    else
    {
        System.out.println(" Strings are not equal" )
    }
    
    /*
     * We will determine which string comes first lexographically
     * using the comareTo method of the String class.
     * 
     * compareTo retrns
     *      0: if the strings are equal
     *      < 0: if str1 < str2 lexographically
     *      > 0: if str1 > str2 lexographically
     */
    int result = str.compareTo( str2 );
    String firstStr = null; //assigning the null reference to firstStr
    
    if(result < 0 )
    {
        firstStr = str1;
    {
    else if( result > 0 )
    {
        firstStr = str2;
    }
    if( firstStr != null )
    {
    System.out.println( "The first string is: " + firstStr ):
    System.out.println( "The first string is: " + firstStr.length());
    }
    else
    {
        System.out.println( "The strings are equal. " );
}