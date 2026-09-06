
import java.util.*;

public class program49
{
    static private int factor_sum(int num)
    {
        int ans = 0;
        int sum = 0;

        for(int i = 1; i <= num/2; i++)
        {
            ans = num % i;
            if(ans == 0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        System.out.println("enter number : ");
        num = sc.nextInt();

        int sum = factor_sum(num);
        System.out.println("summation of factors of num : "+sum);
    
    }
}