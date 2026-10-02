import java.util.*;

public class program59
{
    static int sumDigits(int no)
    {       
        if(no < 0)
        {
            no = -no;
        }

        int sum = 0;

        while(no > 0)
        {
            int digit = no % 10;
            no = no/10;
            sum = sum + digit;    
        }

        return sum;
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int value = 0;
        int ret = 0;

        System.out.print("Enter number : ");
        value = sc.nextInt();

        ret = sumDigits(value);
        System.out.println("Sum is : "+ret);
    }
}