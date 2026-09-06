/////////////////////////////////
//
//  Prblem : divisible by 5 or not check it 
/////////////////////////////////
import java.util.*;

public class program43
{
    static private boolean check(int num)
    {
        int result = num % 5;

        if(result == 0) return true;
        else            return false;
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean bFlag = false;

        System.out.println("enter number : ");
        num = sc.nextInt();

        bFlag = check(num);

        if(bFlag)
        {
            System.out.println("divisible by 5");
        }
        else
        {
            System.out.println("Not divisible by 5");
        }
    }
}