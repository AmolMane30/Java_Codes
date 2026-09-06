/////////////////////////////////
//
//  Prblem : divisible by 3 or not check it 
/////////////////////////////////
import java.util.*;

public class program45
{
    static private boolean check(int num)
    {
        if(num % 3 == 0) return true;
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
            System.out.println("divisible by 3");
        }
        else
        {
            System.out.println("Not divisible by 3");
        }
    }
}