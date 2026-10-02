import java.util.*;

public class program53
{
    static void displayDigit(int no)
    {        
        while(no != 0)
        {
            int digit = no % 10;
            System.out.print(digit);
            no = no / 10;
        }
        System.out.println();
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int no = 0;
        System.out.println("Enter number : ");
        no = sc.nextInt();

        displayDigit(no);
        System.out.println(no);
     
    }
}