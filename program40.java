import java.util.*;

public class program39
{
    static public void display(int freq)
    {
        int count = 0;

        for(count = freq; count >= 1; count--)
        {
            System.out.println(count);
        }
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("enter freq : ");
        count = sc.nextInt();

        display(count);       
    }
}