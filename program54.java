import java.util.*;

public class program54
{
    static void displayDigit(int no)
    {       
        int ans = 0;

        while(no != 0)
        {
            if(no < 0)
            {
                no = -no;
            }

            int digit = no % 10;

            ans = ans * 10 + digit;

            no = no / 10;
        }
        System.out.println("Rev order is : "+ans);
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int no = 0;
        System.out.print("Enter number : ");
        no = sc.nextInt();

        displayDigit(no);
        System.out.print("org value remains unchanged : ");
        System.out.println(no);
     
    }
}