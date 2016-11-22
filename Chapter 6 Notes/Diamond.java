import java.util.Scanner;
/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer (side length of diamond):");
        int sideLength = s.nextInt();
        
        String star = "*";
        String space = " ";
        System.out.println("*");
        String line = s.next();
        String newLine = line.substring(1);
        System.out.println(newLine);
    }
}
