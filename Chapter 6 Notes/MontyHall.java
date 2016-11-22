import java.util.Random;
public class MontyHall
{
    public static void main (String[] args)
    {
        int i = 0;
        int strat1 = 0;
        int strat2 = 0;
        while( i <= 1000)
        {
            Random r = new Random();
            int car = r.nextInt(3) + 1;
            int doorChoice = r.nextInt(3) + 1;
            
            int doorHost = doorChoice;
            int doorChoice2 = doorChoice;
            do
            {
                doorHost = r.nextInt(3) + 1;
            }
            while ( doorHost == doorChoice && doorHost == car);
            
            
            if( doorSwitch == 0)
            {   
                doorChoice = doorHost;
                if( doorChoice == car)
                {
                    strat1++;
                }
            }
            if( doorSwitch == 1)
            {
                if( doorChoice == car)
                {
                    strat2++;
                }
            }
            i++;
        }
        System.out.println("Strat1" + strat1 + "          Strat2" + strat2);
    }
}
