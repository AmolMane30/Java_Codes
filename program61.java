import java.util.Scanner;

public class program61
{
    public class ReverseX
    {
        public int revFun(int no)
        {
            int rev = 0;

            while(no != 0)
            {
                int digit = no % 10;
                rev = (rev * 10 ) + digit;
                no = no / 10;
            }
            return rev;
        }
    }

    public static void main(String arg[])
    {
        int val = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter value  : ");
        val = sc.nextInt();

        program61 pObj = new program61();
        ReverseX rObj = pObj.new ReverseX();

        int reverse = rObj.revFun(val);

        System.out.print("Reverse is as follows : "+reverse);
        sc.close();
    }
}