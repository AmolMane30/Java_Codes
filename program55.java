import java.util.*;

public class program55
{
    static void displayCount(int no)
    {       
        int count = 0;

        while(no != 0)
        {
            if(no < 0)
            {
                no = -no;
            }
            no = no / 10;
            count++;
        }
        System.out.println("Count is : "+count);
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int no = 0;
        System.out.print("Enter number : ");
        no = sc.nextInt();

        displayCount(no);
    }
}