
import java.util.Scanner;

public class program76
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int length = 0;
        System.out.println("Enter length : ");
        length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }


        System.out.println("Array elements are : ");
        for(int i = 0; i < length; i++)
        {
            System.out.println(arr[i]);
        }



        sc.close();
    }
}