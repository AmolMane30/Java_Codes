import java.util.*;

public class program60
{
    private class SumEvenDigits
    {
        public int sumEvenDigits(int no)
        {
            int sum = 0;
            while(no > 0)
            {
                if(no % 2 == 0)
                {
                    int digit = no % 10;
                    sum = digit + sum;
                }

                no = no /10;
            }
            return sum;
        }
        
    }

    public static void main(String arg[])
    {
        int value = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value : ");
        value = sc.nextInt();

        program60 pObj = new program60();
        SumEvenDigits sObj = pObj.new SumEvenDigits();

        int ret = sObj.sumEvenDigits(value);
        System.out.println("Sum of even digits is : "+ret);

    }
}