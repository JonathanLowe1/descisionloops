import java.util.Scanner;
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *      Evaluates a boolean condition (like a if statement)
         *      if true, executes the body of the loop and then re-evaluates
         *      the boolean condition
         *      if false, skips the body of the loop and continues
         */

        int count = 1; // initialization

        while( count <= 5 ) // condition
        {
            System.out.println( count ); //body
            count += 1; //change the condition variable
        }

        System.out.println( "done" );
    }

    public static void infiniteLoop()
    {
        //         int count = 1;
        //         
        //         while( count != 50 )
        //         {
        //             System.out.println( count );
        //             count += 2;
        //         }
        //         
        //         System.out.println( "done" );
    }

    public static void forExample()
    {
        /*
         * for loop;
         *  three parts of the for loop statement:
         *      1. Initialization - executed once
         *      2. Boolean condition - tested at the start of each iteration
         *      3. change of condition variable - executed at the *end*
         *          of each iteration *before* again testing the condition
         */
        for(int count = 1;
        count <= 5;
        count += 1)
        {
            System.out.println( count );
        }

        System.out.println( "done" );
    }

    public static void forExample2()
    {
        /*
         * for loop;
         *  three parts of the for loop statement:
         *      1. Initialization - executed once
         *      2. Boolean condition - tested at the start of each iteration
         *      3. change of condition variable - executed at the *end*
         *          of each iteration *before* again testing the condition
         */
        int count = 1; //init
        for(           ;
        count <= 5;
        count += 1)
        {
            System.out.println( count );
        }
        System.out.println( "done" );
    }
    System.out.println( "done" );

    public static void offByOne()
    {
        /*(
         *
         */
        for(int i = 0;
                i <= 5;
                i++ )
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         *  1. executes body of the loop
         *  2. Evaluates the boolean condition
         *      if true, executes body of loop again
         *      if false, continues execution after the loop
         */
        
        int count = 1;
        
        do
        {
            System.out.println( count );    //body
            
            count += 1;                     //update the condition
        }
        while( count <= 5 );                //condition
    }
    
    public static void sum()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0
        
        do
        {
            /*
             * Sentinel value
             *      value eg 0 used to terminate a loop
             *          is often entered by a user
             */
            
            System.out.print( "Enter an integer (0 to quit): " );
            int value = s.nextInt();
            
            sum+= value;
        }
        while ( value != 0);
        
        System.out.println( "sum" + sum);
        
    }
    
    public static void sum2()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0
        
        do
        {
            System.out.print( "Enter an integer (-1 to quit): " );
            int value = s.nextInt();
            
            if( value == -1)
            {
                /*
                 * break exits inner most loop
                 * 
                 * we are done with this loop
                 */
                break;
            }
            sum+= value;
        }
        while ( value != -1);
        
        System.out.println( "sum" + sum);
    }
    
    public static void sum3()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0
        
        do
        {
            System.out.print( "Enter an integer (-1 to quit): " );
            
            if(s.hasNextInt() == false)
            {
                /*
                 * continue:
                 *      1. skips to the end of the innermost loop it is in
                 *      2. reevauluates loop condition at that point
                 * "we are done with this iteration"
                 */
                continue;
            }
            
            value = s.nextInt()
            
            if( value == -1)
            {
                /*
                 * break exits inner most loop
                 * 
                 * we are done with this loop
                 */
                break;
            }
            sum+= value;
        }
        while ( value != -1);
        
        System.out.println( "sum" + sum);
    }
}
