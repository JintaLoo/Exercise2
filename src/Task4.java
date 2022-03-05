import java.util.*;


public class Task4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        //Choose an odd number between 50 and 100 and save it as an int variable
        //telling us how many Lego bricks we have (e.g. amountOfBricks)
        System.out.print("Choose an odd number between 50 and 100 = ");
        int amountOfBricks = sc.nextInt();
        // Check the range of the select number
        if(amountOfBricks<50||amountOfBricks>101) {
            System.out.println("Out of range");
            System.exit(0);
        }
        else
        {
            // check the odd number
            if (amountOfBricks % 2 == 0)
            {
                System.out.println("Not odd number");
                System.exit(0);
            }
        }
        System.out.println("we have "+amountOfBricks+" Lego bricks");

        //select an even number between 5 and 10 stating how many Lego blocks
        //fit in one container (e.g.: containerCapacity) and save it as an int variable
        System.out.print("Select an even number between 5 and 10 = ");
        int containerCapacity=sc.nextInt();
        // Check the range of the select number
        if(containerCapacity<5||containerCapacity>11)
        {
            System.out.println("Out of range");
            System.exit(0);
        }
        else
            {
                // check the even number
                if (containerCapacity % 2 != 0)
                {
                    System.out.println("Not even number");
                    System.exit(0);
                }

            }
        System.out.println(containerCapacity+" Lego blocks fit in one containers");


        int  fullContainers,NotfullContainers,allContainers;
        //calculate number of full containers
        fullContainers=amountOfBricks/containerCapacity;
        //calculate number of Lego blocks remaining in the last container
        NotfullContainers=amountOfBricks%containerCapacity;
        //calculate number of containers in total
        allContainers=fullContainers;
        //check number of total containers
        //if there is a remaining of the blocks then add 1 container so that all the blocks are counted
        if(NotfullContainers!=0) {
            allContainers = fullContainers + 1;
        }
        System.out.println("Number of containers in total = "+allContainers);
        System.out.println("Number of full containers = "+fullContainers);
        System.out.println("Number of Lego blocks remaining in the last container= "+NotfullContainers);
    }
}
