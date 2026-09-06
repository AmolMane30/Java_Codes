
import java.util.*;

public class program50
{
    static private boolean factor_sum(int num)
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
        
        if(sum == num)  return true;
        else            return false;
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        System.out.println("enter number : ");
        num = sc.nextInt();

        boolean perft_num = factor_sum(num);

        if(perft_num)
            System.out.println(" it is perfect num : "+num);
        else
            System.out.println(" it is not perfect num : "+num);

    
    }
}