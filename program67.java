
import java.util.Scanner;

public class program67
{
    public static void display(int Arr[])
    {
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Values in array are : "+Arr[i]);
        }
    }

    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[4];

        System.out.println("Enter values : ");        
        for(int i = 0; i < 4; i++)
        {
            Arr[i] = sc.nextInt();
        }

        display(Arr);

        sc.close();
    }
}