import java.util.*;

public class program29
{
    static void display(int count)
    {
        for(int i = 1; i <= count; i++)
        {
            System.out.println("Jay Ganesh...");
        }
    }

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int freq = 0;

        System.out.println("Enter freq : ");
        freq = sc.nextInt();

        display(freq);
        sc.close();
    }
}