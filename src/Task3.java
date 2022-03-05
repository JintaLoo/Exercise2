import java.lang.Math;

public class Task3
{
    public static void main(String[] args)
    {
        // First part
        // generate random number between 1 and 100
        double a = Math.random()*100;
        System.out.println("Random Number:" + (int)a);
        //Second part
        // check the random number whether it is an even or an odd number
        if((int)a%2==0)
        {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }

    }
}
