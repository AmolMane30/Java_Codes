import java.util.Scanner;

public class program65
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[4];

        System.out.println("Enter values : ");        
        for(int i = 0; i < 4; i++)
        {
            Arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 4; i++)
        {
            System.out.println("Entered values are : "+Arr[i]);
        }

        sc.close();
    }
}