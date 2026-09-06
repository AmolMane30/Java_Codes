import java.util.*;

public class program42
{
    static private void display(int freq)
    {
        int count = 0;

        for(count = 1; count <= freq; count++)
        {
            System.out.println(count);
        }
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int freq = 0;

        System.out.println("enter freq");
        freq = sc.nextInt();

        display(freq);
    }
}