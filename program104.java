// Input : 5
// Output : 5  4  3  2  1
import java.util.*;

public class program104
{
    static void display(int n)
    {
        for(int i = n; i >= 1; i--)
        {
            System.out.print(i+"\t");
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int value = 0;
        System.out.println("Enter len : ");
        value = sc.nextInt();

        display(value);


    }
}