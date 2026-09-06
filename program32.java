import java.util.*;

public class program32
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int freq = 0;

        System.out.println("Enter freq : ");
        freq = sc.nextInt();

        for(count = 1; count <= freq; count++)
        {
            System.out.println(count);
        }

    }
}