import java.util.Scanner;
public class NumericalMethod
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println( "Enter an integer:" );
        int n = s.nextInt();
        int i = 0;
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;
        while( i <= n )
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
            
            i++;
        }
        System.out.println(fnew);
    }
}
