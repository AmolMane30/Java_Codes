import java.util.*;

public class program56
{
    static int displayCount(int no)
    {       
        int count = 0;

        if(no < 0)
        {
            no = -no;
        }

        while(no != 0)
        {
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

        ret = displayCount(no);
        System.out.println("count is : "+ret);
    }
}