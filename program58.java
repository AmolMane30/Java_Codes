import java.util.*;

public class program58
{
    static int countOddDigits(int no)
    {       
        int count = 0;

        if(no < 0)
        {
            no = -no;
        }

        while(no != 0)
        {
            if(no % 2 != 0)
            count++;
            no = no / 10;
        }

        return count;
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int no = 0;
        int ret = 0;

        System.out.print("Enter number : ");
        no = sc.nextInt();

        ret = countOddDigits(no);
        System.out.println("Oodd count is : "+ret);
    }
}