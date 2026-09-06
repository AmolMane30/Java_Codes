/////////////////////////////////
//
//  Prblem : print factors with O(n/2)
/////////////////////////////////
import java.util.*;

public class program48
{
    static private void display(int num)
    {
        int ans = 0;

        for(int i = 1; i <= num/2; i++)
        {
            ans = num % i;
            if(ans == 0)
            {
                System.out.println("factors are : "+i);
            }
        }
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        System.out.println("enter number : ");
        num = sc.nextInt();

        display(num);
    
    }
}