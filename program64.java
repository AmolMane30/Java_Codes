import java.util.Scanner;

public class program64
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int[] Arr;

        int val = 5;
        Arr = new int[val];
        System.out.println("Enter values : ");
        
        for(int i = 0; i < val; i++)
        {
            Arr[i] = sc.nextInt();
        }

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println("Entered values are : "+Arr[i]);
        }

        sc.close();
    }
}